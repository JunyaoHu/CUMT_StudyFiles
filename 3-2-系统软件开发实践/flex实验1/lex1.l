%{
int nchar, nword, nline;
%}
%%
\n { nline++; nchar++; }
[^ \t\n]+ { nword++, nchar += yyleng; }
. { nchar++; }
%%
void main()
{
yylex();
printf("%d\t%d\t%d\n", nchar, nword, nline);
}
int yywrap()
{
return 1;
}