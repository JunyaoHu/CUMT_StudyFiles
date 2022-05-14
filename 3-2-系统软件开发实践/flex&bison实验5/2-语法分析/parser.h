
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


typedef struct Node                
{
	unsigned short id;		 // Node id number    (65535 max).					2	 2	  //id��node_name�������, �������͵�node��node_name����ĵ�i������ͬ����id��Ϊi //��Ҫ�޸ķ�Χ
	unsigned short prod;	 // Production number (65535 max).					2	 4
	int node_index;   //node ��node�����е�����
	int    sti;     // Symbol-table index (perm or temp var).		4	 8        //sti��symbol�������
	int    prev;	 // Previous node.			   						4  12
	int    next;	 // Next node.												4  16   //node�������±���id ��sti����
	int    line;    // Line number.                                4  20 
	int    child;   // Child node.                                	4  24 
	int    parent;  // Parent node.                             	4  28 bytes per node
	unsigned short layer;	//�ڵ����ڵĲ�(��block�йأ���Ƶ�������������ʹ�õķ�Χ,��uchar��Ҳ���ԣ�һ�㲻��ﵽ255��)
	unsigned char  bsource;  //��ʾ�Ƿ��Ǳ������ĳ���Ľڵ�(Դ�������ͷ�ļ���Ԥ����֮�󣬱�������ͷ�ļ���Դ��������ͬһ���м��ļ��н��д�����uchar(unsigned char)Ҳ����)
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
void   init_ast		(int);   //��ʼast��

Node*  new_node();

void addchild( Node * node1, Node * node2 );

void adjust_term( Node * node1, int term );

//AST
void   printast		();  //��ӡast����Ϣ, ��ں���
void   print_ast		(int n);  //�ݹ�
void   print_node	(char *indent, int n);  //��ӡ�ڵ㣬����node[]            
void   traverse		(char *indent, int n);

//������ļ�
int   init_out_file (char* fn);
void  term_out_file (char * );

#endif









