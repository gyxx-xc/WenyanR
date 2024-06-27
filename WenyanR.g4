grammar WenyanR;

program                     : statement* EOF;

statement                   : candy_statement
                            | expr_statement
                            | object_statement
                            | control_statement
                            | import_statement
                            ;

candy_statement             : declare_write_candy_statement; // make the candy first

control_statement           : if_statement
                            | for_statement
                            | flush_statement
                            | return_statement
                            | break
                            | continue
                            ;

expr_statement              : declare_statement
                            | init_declare_statement
                            | reference_statement
                            | define_statement

                            | assign_statement
                            | boolean_algebra_statement
                            | mod_math_statement
                            | key_function_call_statement

                            | function_define_statement
                            | function_call_statement
                            ;

data                        : data_type=(STRING_LITERAL|BOOL_VALUE|FLOAT_NUM|INT_NUM)            # data_primary
                            | DATA_ID_LAST                                                       # id_last
                            | IDENTIFIER                                                         # id
                            | data FUN_ID_LAST p=(STRING_LITERAL|IDENTIFIER|INT_NUM|DATA_ID_LAST|'長')   # data_child
                            ;

reference_statement         : '夫' data ;
declare_statement           : declare_op INT_NUM type ('曰' d+=data)* ;
init_declare_statement      : '有' type data ;
define_statement            : '名之' ('曰' d+=IDENTIFIER)+ ;

declare_write_candy_statement : declare_statement '書' FUN_ID_LAST ;

mod_math_statement          : '除' data pp=(PREPOSITION_LEFT|PREPOSITION_RIGHT) data POST_MOD_MATH_OP ;
boolean_algebra_statement   : '夫' data data op=(AND | OR) ;
assign_statement            : '昔之' data ZHE ('今' data ('是矣'|YE)?) # assign_data_statement
                            | '昔之' data ZHE '今不復存矣'              # assign_null_statement;

key_function_call_statement : key_function (data|FUN_ID_LAST)
                              (pp+=(PREPOSITION_LEFT|PREPOSITION_RIGHT) data)* ;

function_define_statement   : LOCAL_DECLARE_OP '一術' '名之' '曰' IDENTIFIER
                              ('欲行是術' '必先得' (INT_NUM type ('曰' id+=IDENTIFIER)+)+)?
                              ('是術曰' | '乃行是術曰') statement* '是謂' IDENTIFIER '之術也' ;
function_call_statement     : '施' (data|key_function)
                              (preposition (args+=data|FUN_ID_LAST))?
                              (preposition args+=data)*               # function_pre_call
                            | '取' INT_NUM '以施' (data|key_function)  # function_post_call
                            ;

object_statement            : LOCAL_DECLARE_OP INT_NUM '物' define_statement (object_define_statement)? ;
object_define_statement     : '其物如是' ('物之' STRING_LITERAL ZHE type '曰' data)+ '是謂' IDENTIFIER '之物也' ;

flush_statement             : '噫' ;

if_statement                : '若' if_expression ZHE if+=statement* ('若非' else+=statement*)? for_if_end ;
if_expression               : data                  # if_data
                            | data if_logic_op data # if_logic ;

for_statement               : '凡' data '中之' IDENTIFIER statement* for_if_end  # for_arr_statement
                            | '為是' data '遍' statement* for_if_end             # for_enum_statement
                            | '恆為是' statement* for_if_end                     # for_while_statement
                            ;

return_statement            : '乃得' data                   # return_data_statement
                            | '乃得矣'                      # return_last_statement
                            | '乃歸空無'                    # return_void_statement
                            ;

import_statement            : '吾嘗觀' STRING_LITERAL '之書' ('方悟' IDENTIFIER+ '之義')? ;

if_logic_op                 : op=(EQ|NEQ|LTE|GTE|GT|LT) ;

key_function                : op=(
                              ADD | SUB | MUL | DIV
                            | UNARY_OP
                            | ARRAY_COMBINE_OP
                            | ARRAY_ADD_OP
                            | WRITE_KEY_FUNCTION
                            ) ;

type                        : '數'|'列'|'言'|'爻' ;

break                       : '乃止' ;
continue                    : '乃止是遍' ;

preposition                 : PREPOSITION_LEFT | PREPOSITION_RIGHT ;
declare_op                  : LOCAL_DECLARE_OP | GLOBAL_DECLARE_OP ;

for_if_end                  : '云云'  | '是也' | YE ;

YE                          : '也';
ZHE                         : '者';

DATA_ID_LAST                : '其' ;
FUN_ID_LAST                 : '之' ;

STRING_LITERAL              : '「「' ( ~('」') )* '」」' ;
IDENTIFIER                  : '「' ( ~('」') )+ '」' ;
POST_MOD_MATH_OP            : '所餘幾何' ;
AND                         : '中無陰乎';
OR                          : '中有陽乎';
EQ                          : '等於' ;
NEQ                         : '不等於' ;
LTE                         : '不大於' ;
GTE                         : '不小於' ;
GT                          : '大於' ;
LT                          : '小於'  ;

ADD                         : '加' ;
SUB                         : '減' ;
MUL                         : '乘' ;
DIV                         : '除' ;
UNARY_OP                    : '變' ;

ARRAY_COMBINE_OP            : '銜' ;
ARRAY_ADD_OP                : '充' ;
WRITE_KEY_FUNCTION          : '書' ;

PREPOSITION_LEFT            : '於' ;
PREPOSITION_RIGHT           : '以' ;
LOCAL_DECLARE_OP            : '吾有' ;
GLOBAL_DECLARE_OP           : '今有' ;

FLOAT_NUM                   : INT_NUM FLOAT_NUM_DIVISION (INT_NUM FLOAT_NUM_KEYWORDS)+ ;
fragment
FLOAT_NUM_DIVISION : '又';
fragment
FLOAT_NUM_KEYWORDS          : '分'|'釐'|'毫'|'絲'|'忽'|'微'|'纖'|'沙'|'塵'|'埃'|'渺'|'漠' ;

INT_NUM                     : INT_NUM_SIGN? INT_NUM_KEYWORDS+ ;
fragment
INT_NUM_SIGN                : '負' ;
fragment
INT_NUM_KEYWORDS            : '〇'|'零'|'一'|'二'|'三'|'四'|'五'|'六'|'七'|'八'|'九'
                            | '十'|'百'|'千'|'萬'|'億'|'兆'|'京'|'垓'|'秭'|'穣'|'溝'|'澗'|'正'|'載'|'極'
                            | FLOAT_NUM_DIVISION;

BOOL_VALUE                  : '陰'|'陽' ;

COMMENT                     : ('注曰'|'疏曰'|'批曰') WS? STRING_LITERAL -> skip ;
WS                          : ([ \t\r\n]|'。'|'、'|'，'|'　')+ -> skip ;
