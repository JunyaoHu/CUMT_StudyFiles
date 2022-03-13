%{
    typedef char* string;
    #define YYSTYPE string
    #include <stdio.h>
    int yylex();
    int yyerror(char *msg);
%}
%token NAME EQ AGE
%% 
file :record | record file
	;
record :NAME EQ AGE {printf("%s is %s years old!!!\n",$1,$3);}
	;
%%
int main()
{
	yyparse();
	return 0;
}
int yyerror(char *msg)
{
	printf("Error encountered: %s \n",msg);
	return 0;
}
