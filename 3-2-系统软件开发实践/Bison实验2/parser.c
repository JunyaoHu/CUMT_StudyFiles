

#include "parser.h"

////////////////////////////////////////////
//在cpp中声明

#define ARRAY_ALLOC(A_TYPE, P, M) \
if ((P = (A_TYPE*) malloc(M*sizeof(A_TYPE))) == NULL) \
{ fprintf(stderr, "Out of memory\n"); exit(-1); }


struct Symbol*  symbol;			// Symbols.
int      n_symbols;		// Number of symbols.
int      n_keywords;	// Number of keywords in symbol table.
short    length;			// Current length of symbol name.
int      cell;			// Current hash cell number.
int      sti;				// Current symbol-table index.
unsigned long    hashdiv;		// Hash divisor. 
int*     hashvec;		// Hash vector.
int      max_symbols;	// Maximum number of symbols.
int      max_cells;    // Maximum number of cells in the hash vector. 


Node*   node;				// AST node array.
Node*   sim_node;      //将block节点省略，简化树的层次结构
int     root;				// Root node number.
int     n_nodes;			// Number of nodes.
int     max_nodes;		// Maximum number of nodes.

/////////////////////////////////////////
////for printing tree
char draw_plus [] = "+ ";                     
char draw_vbar [] = "| ";
char draw_last [] = "+ ";
char draw_space[] = "  ";


char tmp_string[1000];  //

FILE* out_file_fp;

// Node Names
char * node_name[140] = 
{
	"not_type_",
	"IDENT_",
	"CONST_",
	"STRING_",
	"ident_",
	"constant_",
	"string_",
	"exp_",
	"array_",
	"funccall_",
	"member_",
	"ptrto_",
	"postinc_",
	"postdec_",
	"arguments_",
	"preinc_",
	"predec_",
	"addressof_",
	"contentsof_",
	"positive_",
	"negative_",
	"complement_",
	"not_",
	"sizeof_",
	"cast_",
	"or_",
	"and_",
	"bitor_",
	"bitxor_",
	"bitand_",
	"eq_",
	"ne_",
	"lt_",
	"gt_",
	"le_",
	"ge_",
	"shl_",
	"shr_",
	"add_",
	"sub_",
	"mul_",
	"div_",
	"mod_",
	"question_",
	"equals_",
	"muleq_",
	"diveq_",
	"modeq_",
	"addeq_",
	"subeq_",
	"shleq_",
	"shreq_",
	"andeq_",
	"xoreq_",
	"oreq_",
	"assignment_",
	"comma_",
	"condexp_",
	"decl_",
	"decl_init_",
	"decl_spec_",
	"init_declarators_",
	"declarator_",
	"declaratorinit_",
	"typedef_",
	"extern_",
	"static_",
	"auto_",
	"register_",
	"void_",
	"char_",
	"short_",
	"int_",
	"long_",
	"float_",
	"double_",
	"signed_",
	"unsigned_",
	"struct_or_union_",
	"enum_",
	"type_name_",
	"const_",
	"volatile_",
	"type_qualifiers_",
	"struct_",
	"union_",
	"struct_declarations_",
	"struct_declaration_",
	"spec_qua_s_",
	"struct_declarators_",
	"struct_declarator_",
	"enum_spec_",
	"enumerators_",
	"enumident_",
	"enumequals_",
	"direct_decl_",
	"arraydecl_",
	"funcdecl_",
	"pointer_",
	"param_types_",
	"param_types_ellipsis_",
	"param_declarations_",
	"absarg_",
	"idents_",
	"typespec_",
	"abstract_declarator_",
	"constexp_",
	"absarray_",
	"absfunc_",
	"assign_",
	"Init_",
	"Init_comma_",
	"init_s_",
	"labeledstmt_",
	"case_",
	"default_",
	"block_",
	"empty_stmt_",
	"if_",
	"ifelse_",
	"switch_",
	"while_",
	"do_",
	"for_",
	"goto_",
	"continue_",
	"break_",
	"return_",
	"return_exp_",
	"no_stmt_",
	"exp1_",
	"exp2_",
	"exp3_",
	"compound_stmt_",
	"declarations_",
	"statements_",
	"goal_",
	"extdef_",
	"funcdef_",
	"funcbody_"
};


// Terminal symbols of the grammar. 
char * term_symb[91] = 
{
	"<error>",
	"<identifier>",
	"<constant>",
	"<string>",
	"{typedef}",
	"<eof>",
	"auto",
	"break",
	"case",
	"cdecl",
	"char",
	"const",
	"continue",
	"default",
	"do",
	"double",
	"else",
	"enum",
	"extern",
	"far",
	"float",
	"for",
	"goto",
	"huge",
	"if",
	"int",
	"interrupt",
	"long",
	"near",
	"pascal",
	"register",
	"return",
	"short",
	"signed",
	"sizeof",
	"static",
	"struct",
	"switch",
	"typedef",
	"union",
	"unsigned",
	"void",
	"volatile",
	"while",
	"\'?\'",
	"\'||\'",
	"\'&&\'",
	"\'|\'",
	"\'^\'",
	"\'&\'",
	"\'==\'",
	"\'!=\'",
	"\'<\'",
	"\'>\'",
	"\'<=\'",
	"\'>=\'",
	"\'<<\'",
	"\'>>\'",
	"\'+\'",
	"\'-\'",
	"\'*\'",
	"\'/\'",
	"\'%\'",
	"<preprocessor>",
	"\',\'",
	"\';\'",
	"\'=\'",
	"\'{\'",
	"\'}\'",
	"\':\'",
	"\'(\'",
	"\')\'",
	"\'[\'",
	"\']\'",
	"\'...\'",
	"\'*=\'",
	"\'/=\'",
	"\'%=\'",
	"\'+=\'",
	"\'-=\'",
	"\'<<=\'",
	"\'>>=\'",
	"\'&=\'",
	"\'^=\'",
	"\'|=\'",
	"\'++\'",
	"\'--\'",
	"\'~\'",
	"\'!\'",
	"\'.\'",
	"\'->\'"
};  


////////////////////////////////////////////

int yyerror(char *str)
{
 	printf("Error: %s\n",str);
	return 1;      
}

void  init_ast (int max_node)
{
	max_nodes = max_node;

	//node      = new Node[max_nodes];
	ARRAY_ALLOC(Node, node, max_nodes);

	//sim_node      = new Node[max_nodes];
	ARRAY_ALLOC(Node, sim_node, max_nodes);

	root          = 0;   // In case of internal error.
	node[0].id    = -1;  // Undefined.
	node[0].prod  = 0;          
	node[0].sti   = 0;          
	node[0].next  = 0;          
	node[0].child = 0;
	node[0].layer = 0;
	node[0].bsource = 0;
	n_nodes       = 1;  
}


void init_parser (int max_symb, int max_node)
{
	init_symtab (max_symb);                            // Initialize the symbol table.
	init_ast    (max_node);                            // Initialize the AST. 
	add_symbol  (0, "");
}


/////////////////////////////////////////////////////////////////////////////////////////////////////
//    init_symtab

void  init_symtab (int max_symb) 
{
	int i; 
	max_symbols   = max_symb;
	max_cells     = 2*max_symbols;

	//symbol        = new Symbol[max_symbols];
	ARRAY_ALLOC(struct Symbol, symbol, max_symbols);

	//hashvec       = new int[max_cells];
	ARRAY_ALLOC(int, hashvec, max_cells);

	hashdiv       = ULONG_MAX / max_cells + 1;
	n_symbols	  = 0;
	n_keywords	  = 0;
	if (hashvec == NULL)
	{
		printf (                  "Not enough memory available for Symbol Table.\n");
		//fprintf (Output.filedesc, "Not enough memory available for Symbol Table.\n");
		//quit();
		exit(0);
	}
	for (i = 0; i < max_cells; i++) 
	{
		hashvec[i] = -1;//每个格初始值为-1
	}
}

void  term_symtab () 
{
	free(symbol);
	free(hashvec);
}


Node*  new_node()
{											            // Parse Stack Index.
	Node *ret; 
	if (n_nodes >= max_nodes)						      // If too many nodes?  
	{
		//printf  (                 "Number of AST nodes exceeds limit of %d.\n", max_nodes);
		//fprintf (Output.filedesc, "Number of AST nodes exceeds limit of %d.\n", max_nodes);
		//quit();
		return NULL;
	}

	//node[n_nodes].id     = node_numb[p];			   // Set node id. 
	//node[n_nodes].prod   = p;							   // Put production (rule) number in node.
	node[n_nodes].sti    = 0;    					      // Set symbol-table index to zero.
	node[n_nodes].prev   = 0;							   // Set prev to nonexistent.
	node[n_nodes].next   = 0;							   // Set next to nonexistent.
	node[n_nodes].child  = 0;							   // Set child to nonexistent.
	node[n_nodes].parent = 0;							   // Set parent to nonexistent.
	//node[n_nodes].bsource = is_source;
	node[n_nodes].node_index = n_nodes;

	ret = node + n_nodes;
	//ret = &node[n_nodes];
	n_nodes++;
	return ret;
}

//node2作为子节点加入node1
void addchild( Node * node1, Node * node2 )
{
	int m;    
	m = node1->child;
	if(m>0){
		while(node[m].next > 0){
			m = node[m].next;  //向后追溯到最后一个兄弟节点
		}
		node[m].next = node2->node_index;
		node2->prev = node[m].node_index;
	}
	else{
		//没有子节点
		node1->child = node2->node_index;
		node2->parent = node1->node_index;
	}
}


//再关联一个hash表，检查是否有重复的
int	add_symbol (short t, char* token) 
{
	char *p;
	sti = get_symbol (token);
	  
	length  = strlen(token);
	p = (char*) malloc( (length+1)*sizeof(char) );  //加不加1似乎没影响, 注意释放
	if(p == NULL){
		printf("out of memory for add_symbol\n\n");
	}
	strcpy(p, token);

	if (sti < 0) 
	{
		sti = n_symbols; //符号的序号 sti
		if (n_symbols >= max_symbols)				// Reached maximum number? 
		{
			printf (                  "Number of symbols exceeds %d.\n", max_symbols);
			//fprintf ("out.txt", "Number of symbols exceeds %d.\n", max_symbols);
			quit();
		}

		hashvec[cell] = n_symbols;					// Put symbol number into hash vector.     //hash table中存储了符号的序号，cell的值关联符号的序号值

		//symbol[n_symbols].name = token;	// Define pointer to symbol name.
		symbol[n_symbols].name = p;	// Define pointer to symbol name.
		symbol[n_symbols].length = length;		//	Define symbol name length.
		symbol[n_symbols].term = t;				// Define terminal number (<identifier>, <string>, <number>, ...)
		symbol[n_symbols].type = 0;				// Define type as undefined (zero).
		symbol[n_symbols].cell = cell;			// Define hash vector cell number for this symbol.  //符号的cell值关联到hash表中的数组下标，循环引用
		n_symbols++;									// Increment number of symbols.
	}
	return (sti);									// Return symbol-table index.
}


int   get_symbol (char* token) 
{
	char* p = token;					 	// Point at start.
	unsigned long hash;
	int i = 0;

	length  = strlen(token);  	// Set length. //足够了
	hash = length;         	   		// Set hash to length. 
	// Set shift value to 0.
	do									      		// Assume length != 0
	{
		hash += *p << i;
		i += 4;		                  		
		i %= 32;
		p++;
	}
	while ( *p != '\0' );
	cell = hash % max_cells; 					// Get first cell.
	i = hashvec [cell];				   		// Get symbol index.
	if (i >= 0) 
	{
		p = token;						   // Point at token start.
		do
		{
			if (symbol[i].length == length)	// If lengths are equal ...
			{
				char* q = symbol[i].name;		// Point at symbol name.
				unsigned short j = 0; 
				do 
				{
					if (p[j] != q[j]) goto Cont;	// If characters not equal ...		
				}
				while (++j < length);				// while end not reached. 
				return (i);								// Found it.  //相同的名字，则不会重新存储
			}
Cont:    cell = (hash *= 65549)/hashdiv;	// Get new cell number.
			i = hashvec [cell];					// Get symbol index.
		}
		while (i >= 0);      					// While not empty slot.  //直到i<0,找到一个新的，此时cell指向一个新的空位置(数组下标)
	}
	return (i);										// Return symbol number.
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
//    symname - get symbol name. 

char* symbol_name (short i, FILE * filedesc)
{
	static char name[2000];
	char* p;
	short L;

	if (i == 0) 
	{
		name[0] = 0;
		return name;
	}

	p = symbol[i].name;
	L = symbol[i].length;

	if (L >= 2000) 
	{
		for (i = 0; i < 100; i++) name[i] = p[i];
		name[i] = 0;
		printf  (                 "Symbol length of %d is too big (>= 2000).\n", L);
		fprintf (filedesc, "Symbol length of %d is too big (>= 2000).\n", L);
		printf  (                 "for '%s'\n.", name);
		fprintf (filedesc, "for '%s'\n.", name);
		quit();
	}
	for (i = 0; i < L; i++) name[i] = p[i];
	name[i] = 0;
	return name;
}


/////////////////////////////////////////////////////////////////////////////////////////////////////
//    print - print symbol table contents.     										                        

void  print_symtab (char* term_symb[])
{
	short i;
	FILE* filedesc = out_file_fp;
	if (n_symbols > 1)
	{
		fprintf (filedesc, "Symbol Table ...\n\n");
		fprintf (filedesc, "  sti  leng  type  term  \n");

		for (i = 1; i < n_symbols; i++)
		{
			fprintf (filedesc, "%5d %5d %5d %5d   %-30s  %s\n",
				i,
				symbol[i].length,
				symbol[i].type,
				symbol[i].term, 
				term_symb[symbol[i].term],
				symbol_name(i, filedesc)); 
		}   
		fprintf (filedesc, "\n");
	}
	else
	{
		fprintf (filedesc, "Symbol Table is empty!\n\n");
	}
}


///打印ast
/////////////////////////////////////////////////////////////////////////////////////////////////////
//    print_ast ()  n_nodes为树的所有节点                                                                               

void  printast ()
{
	if (n_nodes > 1)
		print_ast (root);
	else
		//fprintf (Output.filedesc, "AST is empty.\n\n");
		fprintf (out_file_fp, "AST is empty.\n\n");
	printf ("%s", "AST is empty.\n\n");
} 

/////////////////////////////////////////////////////////////////////////////////////////////////////
//    print_ast (n)                                                                                

void  print_ast (int n) // Print subtree.
{
	if (n < n_nodes && n > 0)
	{
		char indent [512];
		strcpy (indent, draw_space);
		//fprintf (Output.filedesc, "Abstract Syntax Tree ...\n\n");
		//fprintf (Output.filedesc, "  node  prev  next parent child  line   sti \n");

		fprintf (out_file_fp, "Abstract Syntax Tree ...\n\n");
		fprintf (out_file_fp, "  node  prev  next parent child  line   sti \n");

		printf ("Abstract Syntax Tree ...\n\n");
		printf ("  node  prev  next parent child  line   sti \n");

		traverse (indent, n); // Start AST traversal.    
		//fprintf (Output.filedesc, "\n");

		fprintf (out_file_fp, "\n");
		printf("\n");
	}
	else 
	{
		//fprintf (Output.filedesc, "Internal error, node %d is not in AST.\n\n", n);

		fprintf (out_file_fp, "Internal error, node %d is not in AST.\n\n", n);
		printf ("Internal error, node %d is not in AST.\n\n", n); 
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
//    traverse                                                                                     

void  traverse (char *indent, int n)
{
	while (node[n].next > 0)                
	{
		strcat (indent, draw_plus); 
		print_node (indent, n);                
		indent [strlen(indent)-2] = 0;
		if (node[n].child > 0)                
		{
			strcat (indent, draw_vbar);
			traverse (indent, node[n].child);  
			indent [strlen(indent)-2] = 0;
		}
		n = node[n].next;                    
	}

	strcat (indent, draw_last); 
	print_node (indent, n);                   
	indent [strlen(indent)-2] = 0;
	if (node[n].child > 0)                   
	{
		strcat (indent, draw_space); 
		traverse (indent, node[n].child);     
		indent [strlen(indent)-2] = 0;
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
//    print_node                                                                                   

void  print_node (char *indent, int n)  /* Print this node function. */
{
	int i; //int  i; 不能改为size_t
	short sti;
	sti = node[n].sti;	
	//fprintf (Output.filedesc, " %5d %5d %5d %6d %5d %5d %5d %5d %5d %s%s",
	printf (" %5d %5d %5d %6d %5d %5d %5d %5d %5d %s%s",
		n, 
		node[n].prev, 
		node[n].next, 
		node[n].parent, 
		node[n].child, 
		node[n].line, 
		sti, 
		node[n].layer,
		node[n].bsource,
		indent, 
		node_name[node[n].id]
	);


	fprintf (out_file_fp, " %5d %5d %5d %6d %5d %5d %5d %5d %5d %s%s",	    
		n, 
		node[n].prev, 
		node[n].next, 
		node[n].parent, 
		node[n].child, 
		node[n].line, 
		sti, 
		node[n].layer,
		node[n].bsource,
		indent, 
		node_name[node[n].id]
	);


	if (sti != 0) // zero means no symbol.
	{
		char* q;
		short L; //short L;
		//char string[100]; 
		if (sti > 0) // a symbol found in the input file?
		{
			q = symbol[sti].name;
			L = symbol[sti].length;
		}
		else // a terminal symbol of the grammar!
		{	
			//q = term_symb[-sti];  //待修改
			q = "tmp_终结符";
			L = strlen(q);
		}
		if (L > 99) L = 99;
		for (i = 0; i < L; i++, q++) // Replace '\n' with \1
		{
			if (*q == '\n') tmp_string[i] =  1; // one = happy face.
			else            tmp_string[i] = *q;
		}
		tmp_string[i] = 0;		
		//fprintf (Output.filedesc, " (%s)", tmp_string);

		fprintf (out_file_fp, " (%s)", tmp_string);
		printf (" (%s)", tmp_string);
	}
	//fprintf (Output.filedesc, "\n");

	fprintf (out_file_fp, "\n");
	printf ("\n");
}


//打开关闭输出文件
int   init_out_file (char* fn)
{
	//strcpy (filename, fn);        
	//filedesc = fopen (filename, "w");  //返回一个文件指针
	out_file_fp = fopen (fn, "w");  //返回一个文件指针

	if (out_file_fp == NULL){
		printf ("\n\nOutput file %s cannot be created.\n\n", fn);
		return 0;
	}
	return 1;
}


void  term_out_file (char * filename)
{
	fprintf (out_file_fp, "End of Output.\n");
	printf ("Created %s ...\n", filename);
	fclose (out_file_fp);  //关闭文件
}


void adjust_term( Node * node1, int term )
{
    int m, r, s, t, u, v, sti;
	m = node1->child;

	if(strcmp(node_name[node[m].id], "typedef_") == 0){  //typedef_  // && node[m].bsource 并且是被分析文件的节点
		r = node[m].next;
		if(r>0 && strcmp(node_name[node[r].id], "init_declarators_") == 0){    //init_declarators_
			s = node[r].child;
			if(s>0 && strcmp(node_name[node[s].id], "declarator_") == 0){    //declarator_
				t = node[s].child;
				if(t>0 && strcmp(node_name[node[t].id], "direct_decl_") == 0){    //direct_decl_
					u = node[t].child;
					if(u>0 && strcmp(node_name[node[u].id], "ident_") == 0){    //ident_
						v = node[u].child;
						if(v>0 && strcmp(node_name[node[v].id], "IDENT_") == 0){    //IDENT_
							sti = node[v].sti;
                             symbol[sti].term = term;  // Define terminal number ({typedef})

						}  //IDENT_
					}  //ident_
				}    //direct_decl_
			}    //declarator_
		}    //init_declarators_
	}

}















