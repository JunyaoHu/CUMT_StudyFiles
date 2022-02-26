L       [a-zA-Z\_]
D       [0-9]
ID      {L}({L}|{D})*
NUM     [1-9]{D}*
enter   \n
space   [ \t]+
%%
"else"|"if"|"switch"|"for"|"int"|"float"|"return"|"void"|"while"  {printf("KWORD:\t%s\n",yytext);}
\+|\-|\*|\/|\<|\<\=|\>|\>\=|\=|\=\=|\!\=|\;|\,|\(|\)|[|]|\{|\}    {printf("SYM:\t%s\n",yytext);}
{ID}        {printf("ID:\t%s\n",yytext);}
{NUM}       {printf("NUM:\t%s\n",yytext);}
{enter}     {}
{space}     {}
#|0|\"|!|\. {}
%%
void main()
{
    yylex();
}
int yywrap()
{
    return 1;
}