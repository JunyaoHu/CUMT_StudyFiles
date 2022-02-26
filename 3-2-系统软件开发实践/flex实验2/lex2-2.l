%{
#define SYM          1
#define ID          20
#define NUMBER      21
#define RELOP       22
#define MAIN        44
#define INT         45
#define FLOAT       46
#define RETURN      8
#define CONST       49
#define WS          51
#define INCLUDE     59
#define NEWLINE     23
#define OTHER       24
#define STRING      26
int yylval;
int column=0;
int row=0;
%}

delim   [ \t \n]
ws      {delim}+
letter  [A-Za-z_]
schar   \'(\\.|[^"\\])\'
string  \"(\\.|[^"\\])*\"
digit   [0-9]
O       [0-7]
H       [a-fA-F0-9]
id      ({letter}|\_)(\_|{letter}|{digit})*
number  {digit}+(\.{digit}+)?([eE][+-]?{digit}+)?([uUlL]|([uU][lL])|([lL][uU]))?

%%
{ws}                                {return WS;}
"/*"([^\*]|(\*)*[^\*/])*(\*)*"*/"   {}
"/""/"[^\n]*                        {}

main                    {yylval=MAIN;    return(MAIN);}
int                     {yylval=INT;     return(INT);}
float                   {yylval=FLOAT;   return(FLOAT);}
return                  {yylval=RETURN;  return(RETURN);}
0[1-7]{O}*              {yylval=NUMBER;  return(NUMBER);}
0[xX][a-fA-F1-9]{H}*    {yylval=NUMBER;  return(NUMBER);}
"#"include              {yylval=INCLUDE; return(INCLUDE);}

{id}        {return (ID);}
{number}    {return (NUMBER);}
{string}    {return (STRING);}
"<"|"<="|"="|"<>"|">"|">="          {yylval = SYM; return (RELOP);}
"<<"|"+"|"/"|"{"|"}"|";"|"("|")"    {return(RELOP);}
.           {yylval = OTHER; return OTHER;}

%%
int yywrap (){
  return 1;
}
void count(){
	int i;
	for(i=0; yytext[i] != '\0'; i++){
		if(yytext[i]=='\n'){
			column = 1;
			row++;
		}
		else if(yytext[i]=='\t')    column += 8-(column%8);
		else                        column++;
	}   
}
void writeout(int c){
	
    switch(c){
        case OTHER:  break;
        case RELOP:  printf("[RELOP  ] [%20s] ", yytext); break;
        case NUMBER: printf("[NUM    ] [%20s] ", yytext); break;
        case ID:     printf("[ID     ] [%20s] ", yytext); break;
        case NEWLINE:break;
        case STRING: printf("[STRING ] [%20s] ", yytext); break;
        case MAIN:   printf("[MAIN   ] [%20s] ", yytext); break;
        case INT:    printf("[INT    ] [%20s] ", yytext); break;
        case FLOAT:  printf("[FLOAT  ] [%20s] ", yytext); break;
        case RETURN: printf("[RETURN ] [%20s] ", yytext); break;
        case WS:     break;
        case INCLUDE:printf("[INCLUDE] [%20s] ", yytext); break;
        default:     break;
	}
	if(c!=WS && c!=OTHER){
        printf("(%2d, %2d) \n", row+1, column+1);
	}
    count();
    return;
}
int main (int argc, char ** argv){
    int c=0;
    while (c = yylex()){
        writeout(c);
	}
	return 0;
}
int yyerror(char *s){
	fprintf(stderr,"%s\n",s);
	return 1;
}