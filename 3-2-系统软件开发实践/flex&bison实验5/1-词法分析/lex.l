%{
#include <stdio.h> 
#define LT				1
#define	LE				2
#define GT				3
#define	GE				4
#define	EQ				5
#define NE				6
#define ID				20
#define NUMBER			21
#define RELOP			22
#define MAIN            44
#define INT             45
#define FLOAT           46
#define RETURN          48
#define CONST           49
#define WS              51
#define INCLUDE         59
#define NEWLINE         23
#define OTHER           24
#define STRING          26

int yylval;
int column=0;
int row=0;

%}

delim			[ \t \n]
ws			{delim}+
letter			[A-Za-z_]
schar			\'(\\.|[^"\\])\'
string			\"(\\.|[^"\\])*\"
digit			[0-9]
H			[a-fA-F0-9]
id			({letter}|\_)(\_|{letter}|{digit})*
number	{digit}+(\.{digit}+)?([eE][+-]?{digit}+)?([uUlL]|([uU][lL])|([lL][uU]))?

%%
{ws}	          {return WS;}
"/*"([^\*]|(\*)*[^\*/])*(\*)*"*/"	{;}
"/""/"[^\n]*				{;}

main                {yylval=MAIN;return(MAIN);}
int                 {yylval=INT;return(INT);}
float               {yylval=FLOAT;return(FLOAT);}
return              {yylval=RETURN;return(RETURN);}
0[0-7]*             {yylval=NUMBER;return(NUMBER);}
0[xX]{H}+           {yylval=NUMBER;return(NUMBER);}
"#"include          {yylval=INCLUDE;return(INCLUDE);}

{id}            { return (ID);}
{number}        { return (NUMBER);}
{string}        {return (STRING);}
"<<"    {return(RELOP);}
"<"     {yylval = LT; return (RELOP);}
"<="    {yylval = LE; return (RELOP);}
"="     {yylval = EQ; return (RELOP);}
"<>"    {yylval = NE; return (RELOP);}
">"     {yylval = GT; return (RELOP);}
">="    {yylval = GE; return (RELOP);}
"+"		{return(RELOP);}
"/"		{return(RELOP);}
"{"		{return(RELOP);}
"}"		{return(RELOP);}
";"		{return(RELOP);}
"("		{return(RELOP);}
")"		{return(RELOP);}
.		{yylval = OTHER; return OTHER;}

%%
int yywrap (){
  return 1;
}
void count(){
	int i;
	for(i=0;yytext[i]!='\0';++i){
		if(yytext[i]=='\n'){
			column=0;
			row++;
		}
		else if(yytext[i]=='\t')    column+=8-(column%8);
		else  column++;
	}
	
}
struct err {
	char buf[10];
	int line;
	int col;
};

struct err errbuf[10];
FILE* fp_in;
FILE* fp_err;
FILE* fp;

int pos=0;
void writeout(int c){
    switch(c){
        case OTHER: {
            sprintf(errbuf[pos].buf,"%s", yytext);
            errbuf[pos].line = row+1;
            errbuf[pos].col = column+1;
            pos++;
            break;
        }
        case RELOP:  fprintf(fp, "[RELOP  ] [%20s] ", yytext); break;
        case NUMBER: fprintf(fp, "[NUM    ] [%20s] ", yytext); break;
        case ID:     fprintf(fp, "[ID     ] [%20s] ", yytext); break;
        case NEWLINE:break; 
        case STRING: fprintf(fp, "[STRING ] [%20s] ", yytext); break;
        case MAIN:   fprintf(fp, "[MAIN   ] [%20s] ", yytext); break;
        case INT:    fprintf(fp, "[INT    ] [%20s] ", yytext); break;
        case FLOAT:  fprintf(fp, "[FLOAT  ] [%20s] ", yytext); break;
        case RETURN: fprintf(fp, "[RETURN ] [%20s] ", yytext); break;
        case WS:     break;
        case INCLUDE:fprintf(fp, "[INCLUDE] [%20s] ", yytext); break;
        default:     break;
	}
	if(c!=WS && c!=OTHER){
        // if(yyleng<8)fprintf(fp,"\t");
        fprintf(fp, "(%2d, %2d) \n", row, column);
	}
    count();
    return;
}

void __cifa(char* filename)
{
	int c=0;
	fp = fopen("./output_file/scanner_output.txt","w+");
	fp_err = fopen("./output_file/scanner_error_output.txt","w+");
	fp_in = fopen(filename,"r");
	while (c = yylex()){
		writeout(c);
	}
	for(int i=0; i<pos; i++)
		fprintf(fp_err,"line(%d), column(%d): error : %s\n", errbuf[i].line, errbuf[i].col, errbuf[i].buf);
		
	fclose(fp);
	fclose(fp_in);
	fclose(fp_err);
}

int main (int argc, char ** argv){
	__cifa("test.txt");
	return 0;
}

int yyerror(char *s){
	fprintf(stderr,"%s\n",s);
	return 1;
}