#include "main.h"
#include "parser.h"

extern int yyparse();
extern FILE *yyin;
extern char * term_symb[];
extern void init_parser(int, int);
extern void   printast		();
extern int   init_out_file (char* fn);
extern void  term_out_file (char * );
extern fourvarcode* tac_head;

void __asm_x86(char* file_name)
{
	char *filename = file_name;
	char * outfilename = "./output_file/ast.txt";

	char * asmfilename = "./output_file/x86.asm";
	if(!(yyin = fopen(filename,"r"))) {
		printf("the file not exist\n");
		exit(0);
	}
	init_parser(100, 1000);
	if(yyparse()) exit(1);
    tac();
	init_out_file(outfilename);
	print_symtab (term_symb);
	printast();
	term_out_file(outfilename);

}

// void  main (int na, char *arg[])
// {
// 	__asm_x86("test.txt");
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
