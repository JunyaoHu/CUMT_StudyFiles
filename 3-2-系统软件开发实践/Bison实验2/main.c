
#include "main.h"


extern int yyparse();

extern FILE *yyin;

extern char * term_symb[];

extern void init_parser(int, int);
extern void   printast		();
extern int   init_out_file (char* fn);
extern void  term_out_file (char * );
extern void  print_symtab (char ** );


void  main (int na, char *arg[])
{
	char *filename = "test.c";
	char * outfilename = "out.txt";

	//指向文件
	if(!(yyin = fopen(filename,"r"))) {
		printf("the file not exist\n");
		exit(0);
	}

	//初始化
	init_parser(100, 1000);

	if(yyparse())exit(1);
    
	//打开输出文件
	init_out_file(outfilename);

	print_symtab (term_symb);  // Print the symbol table contents.
    
	//遍历ast树
	printast();	   // Print the AST, if ast option indicates.


	//关闭输出文件
	term_out_file(outfilename);

	return ;

}


void  quit ()
{
		#ifdef WAIT_ON_KEY
   // Wait until key is pressed ...
	  	printf( "Press any key to continue ...\n");
	  	while( !_kbhit() );
		#endif
		exit (0);
}

















