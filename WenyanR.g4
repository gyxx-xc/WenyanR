grammar WenyanR;

program                     : statement* EOF;

statement                   : expr_statement
                            | flush_statement
                            | object_statement

                            | if_statement
                            | for_statement
                            | return_statement
                            | BREAK

                            | import_statement
                            ;

expr_statement              : declare_statement
                            | init_declare_statement
                            | reference_statement

                            | assign_statement
                            | boolean_algebra_statement
                            | mod_math_statement

                            | function_define_statement
                            | function_call_statement
                            | key_function_call_statement
                            ;

data                        : data_type=(STRING_LITERAL|BOOL_VALUE|INT_NUM|FLOAT_NUM)    # data_primary
                            | '其'                                                       # id_last
                            | '之'                                                       # id_last_with_self
                            | IDENTIFIER                                                # id
                            | data '之' (STRING_LITERAL|IDENTIFIER|INT_NUM|'其' | '長')  # data_child
                            ;

reference_statement         : '夫' data ;
declare_statement           : declare_op INT_NUM type ('曰' d+=data)* define_statement;
init_declare_statement      : '有' type data define_statement;
define_statement            : '名之' ('曰' d+=IDENTIFIER)+;

mod_math_statement          : '除' data pp=(PREPOSITION_LEFT|PREPOSITION_RIGHT) data POST_MOD_MATH_OP ;
boolean_algebra_statement   : '夫' data data op=(AND | OR) ;
assign_statement            : '昔之' data '者' ('今' data '是矣') # assign_data_statement
                            | '昔之' data '者' '今不復存矣'        # assign_null_statement;

key_function_call_statement : key_function data (preposition data)* ;

function_define_statement   : LOCAL_DECLARE_OP '一術' '名之' '曰' IDENTIFIER
                              ('欲行是術' '必先得' (INT_NUM type ('曰' IDENTIFIER)+)+)?
                              ('是術曰' | '乃行是術曰') statement* '是謂' IDENTIFIER '之術也' ;
function_call_statement     : '施' data (preposition data)* # function_pre_call
                            | '取' INT_NUM '以施' data       # function_post_call
                            ;

object_statement            : LOCAL_DECLARE_OP INT_NUM '物' define_statement (object_define_statement)? ;
object_define_statement     : '其物如是' ('物之' STRING_LITERAL '者' type '曰' data)+ '是謂' IDENTIFIER '之物也' ;

flush_statement             : '噫' ;

if_statement                : '若' if_expression '者' statement* ('若非' statement*)? FOR_IF_END ;
if_expression               : data
                            | data IF_LOGIC_OP data ;

for_statement               : '凡' data '中之' IDENTIFIER statement* FOR_IF_END  # for_arr_statement
                            | '為是' data '遍' statement* FOR_IF_END             # for_enum_statement
                            | '恆為是' statement* FOR_IF_END                     # for_while_statement
                            ;

return_statement            : '乃得' data                   # return_data_statement
                            | '乃得矣'                      # return_last_statement
                            | '乃歸空無'                    # return_void_statement
                            ;

import_statement            : '吾嘗觀' STRING_LITERAL '之書' ('方悟' IDENTIFIER+ '之義')? ;


STRING_LITERAL              : '「「' ( ~('」') )* '」」' ;
IDENTIFIER                  : '「' ( ~('」') )+ '」';
arith_binary_op             : '加'|'減'|'乘'|'除' ;
POST_MOD_MATH_OP            : '所餘幾何' ;
AND                         : '中無陰乎';
OR                          : '中有陽乎';
UNARY_OP                    : '變' ;
IF_LOGIC_OP                 : '等於'|'不等於'|'不大於'|'不小於'|'大於'|'小於' ;

key_function                : arith_binary_op
                            | UNARY_OP
                            | ARRAY_KEY_FUNCTION
                            | WRITE_KEY_FUNCTION
                            ;

ARRAY_KEY_FUNCTION          : '銜' | '充' ;
WRITE_KEY_FUNCTION          : '書' ;

preposition                 : PREPOSITION_LEFT | PREPOSITION_RIGHT ;
PREPOSITION_LEFT            : '於' ;
PREPOSITION_RIGHT           : '以' ;
declare_op                  : LOCAL_DECLARE_OP | GLOBAL_DECLARE_OP ;
LOCAL_DECLARE_OP            : '吾有' ;
GLOBAL_DECLARE_OP           : '今有' ;

FOR_IF_END                  : '云云'|'也' ;

FLOAT_NUM                   : INT_NUM '又' (INT_NUM FLOAT_NUM_KEYWORDS)+ ;
fragment
FLOAT_NUM_KEYWORDS          : '分'|'釐'|'毫'|'絲'|'忽'|'微'|'纖'|'沙'|'塵'|'埃'|'渺'|'漠' ;
INT_NUM                     : INT_NUM_KEYWORDS+ ;
fragment
INT_NUM_KEYWORDS            : '零'|'一'|'二'|'三'|'四'|'五'|'六'|'七'|'八'|'九'
                            | '十'|'百'|'千'|'萬'|'億'|'兆'|'京'|'垓'|'秭'|'穣'|'溝'|'澗'|'正'|'載'|'極' ;

BOOL_VALUE                  : '陰'|'陽' ;
type                        : '數'|'列'|'言'|'爻' ;

BREAK                       : '乃止' ;

COMMENT                     : ('注曰'|'疏曰'|'批曰') STRING_LITERAL -> skip ;
WS                          : ([ \t\r\n]|'。'|'、')+ -> skip ;
