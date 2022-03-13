%{
    #include "Name.tab.h"
%}
char [A-Za-z]
num  [0-9]
eq   [=]
name {char}+
age  {num}+
%%
{name} { yylval = strdup(yytext); return NAME; }
{eq}   { return EQ; }
{age}  { yylval = strdup(yytext); return AGE; }
%%
int yywrap(){
    return 1;
}