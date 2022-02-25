%{
int wordCount = 0;
%}
chars [A-Za-z\_\'\.\"]
numbers ([0-9])+
delim [" "\n\t]
whitespace {delim}+
words {chars}+
%%
{words} { wordCount++; /*increase the word count by one*/ }
{whitespace} { /* donothing*/ }
{numbers} { /* one may want to add some processing here*/ }
%%
void main()
{
yylex(); /* start theanalysis*/
printf(" No of words:%d\n", wordCount);
}
int yywrap()
{
return 1;
}
