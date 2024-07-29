# a interpreter of Wenyan Lang with antlr4
Still in development...
I am not very good at java, as you can see, I even use makefile as a making tool

## Note
1. The grammar specification is changed to better fit the antlr and make it better to read
2. The grammar is enhanced to support more features, include but not limited to:
> 1. the neat syntax of data (support xxx 'zhi' xxx 'zhi' xxx)
> 2. make grammar error handler is moved to interpreter (allow 'data' add 'data')
> 3. add a pronoun 'zhi', and make the grammar more standard (shu zhi -> shu + zhi)
> 4. assain statement now only accecpt '昔之' data '者' '今' data '是矣'
3. The number phaser will be work in most of the time, I guess
4. I think there will have bugs when number longer than 10000 digits.

## Todo
- better error coping
