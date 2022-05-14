
#include "main.h"


extern int yyparse();

extern FILE *yyin;

extern char * term_symb[];

extern void init_parser(int, int);
extern void   printast		();
extern int   init_out_file (char* fn);
extern void  term_out_file (char * );
extern void  print_symtab (char **);

void __yufa(char* file_name)
{
	char *filename = file_name;
	char * outfilename = "./output_file/parser_output.txt";
	if(!(yyin = fopen(filename,"r"))) {
		printf("the file not exist\n");
		exit(0);
	}
	init_parser(100, 1000);
	if(yyparse())return;
	init_out_file(outfilename);
	print_symtab (term_symb);  // Print the symbol table contents.
	printast();	   // Print the AST, if ast option indicates.
	term_out_file(outfilename);
	return ;

}

// void  main (int na, char *arg[])
// {
// 	__yufa("test2.txt");
// }


void  quit ()
{
		#ifdef WAIT_ON_KEY
   // Wait until key is pressed ...
	  	printf( "Press any key to continue ...\n");
	  	while( !_kbhit() );
		#endif
		exit (0);
}

















