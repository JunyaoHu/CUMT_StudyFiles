
#ifndef PARSER_H
#define PARSER_H

#include "main.h"

#include "nconst.h"

//#pragma once

typedef struct Symbol
{
	char*  name;	 // Pointer to symbol name.														4
	short  length;	 // Length  of symbol name.														2
	//short  level;	 // Level number for scope.                                        	2
	unsigned short term;	 // Terminal number (e.g. <identifier>, <string>, {typedef}, ...)		2
	unsigned short type;	 // Type (e.g. integer, float, double, char, ...)							2
	int    cell;	 // Hash vector cell number for deleting this symbol.						4  16 bytes
}Symbol;

typedef struct addr  //数值 或 局部变量 或 中间变量 或 类型 或 空
{
	char kind[20];
	char name[20];
}addr;

typedef struct fourvarcode  //(op ,addr1 ,addr2 ,addr3 ,)
{
	int op;
	struct addr addr1;
	struct addr addr2;
	struct addr addr3;
	struct fourvarcode *next;
}fourvarcode;

typedef struct symboltable
{
    char type[20];
    char name[20];
    struct symboltable* next;
    int location;
}symboltable;

typedef struct Node
{
	unsigned short id;		 // Node id number    (65535 max).					2	 2	  //id??node_name???????, ?????????node??node_name??????i???????????id???i //???????Χ
	unsigned short prod;	 // Production number (65535 max).					2	 4
	int node_index;   //node ??node?????е?????
	int    sti;     // Symbol-table index (perm or temp var).		4	 8        //sti??symbol???????
	int    prev;	 // Previous node.			   						4  12
	int    next;	 // Next node.												4  16   //node???????±???id ??sti????
	int    line;    // Line number.                                4  20
	int    child;   // Child node.                                	4  24
	int    parent;  // Parent node.                             	4  28 bytes per node
	unsigned short layer;	//?????????(??block?й???????????????????????Χ,??uchar??????????????255??)
	unsigned char  bsource;  //?????????????????????(??????????????????????????????????????????????????м?????н??д?????uchar(unsigned char)?????)
}Node;


int yyerror(char *str);


void init_parser(int, int);
void term_parser();

// Symtab functions
void   init_symtab  (int);	// Initialize the symbol table.
void   term_symtab  ();

char * symbol_name  (short, FILE * );
void  print_symtab (char**);

int   add_symbol (short, char*);
int   get_symbol (char*);

// AST functions
void   init_ast		(int);   //???ast??

Node*  new_node();

void addchild( Node * node1, Node * node2 );

void adjust_term( Node * node1, int term );

//AST
void   printast		();  //???ast?????, ??????
void   print_ast		(int n);  //???
void   print_node	(char *indent, int n);  //??????????node[]
void   traverse		(char *indent, int n);

//????????
int   init_out_file (char* fn);
void  term_out_file (char * );
void tac();
void start_asm(fourvarcode* );
void start_optimize(fourvarcode* tac_head);
void optimer_tac(fourvarcode* tac_head);
void print_optimize_tac(fourvarcode* tac_head);
char *op_string(int op);
static void start_tac(int n);
static char *deal_expk(int n);
static void MAIN_K(int n);
static void DEFINEPARA_K(int n);
static void ASSIGN_K(int n);
static void get_tac(int op,char a[],char b[],char c[]);
static char * newtemp();

#endif









