

%{

#include "parser.h"

extern int yylineno;
extern int root;

extern int yylex();
extern void addchild( Node * node1, Node * node2 );
Node * link(int tid, Node * rExp, ... );

struct Node * parse_tree;
%}

%union {
  struct Node * node;
}

%left '?'
%left COLON
%left OR_OP
%left AND_OP
%left '|'
%left '^'
%left '&'
%left EQ_OP  NE_OP
%left '<'   '>'   LE_OP   GE_OP
%left LEFT_OP  RIGHT_OP
%left '+'   '-'
%left '*'   '/'   '%'

%token IDENTIFIER CONSTANT STRING_LITERAL SIZEOF
%token PTR_OP INC_OP DEC_OP LEFT_OP RIGHT_OP LE_OP GE_OP EQ_OP NE_OP
%token AND_OP OR_OP MUL_ASSIGN DIV_ASSIGN MOD_ASSIGN ADD_ASSIGN
%token SUB_ASSIGN LEFT_ASSIGN RIGHT_ASSIGN AND_ASSIGN
%token XOR_ASSIGN OR_ASSIGN TYPE_NAME

%token TYPEDEF EXTERN STATIC AUTO REGISTER
%token CHAR SHORT INT LONG SIGNED UNSIGNED FLOAT DOUBLE CONST VOLATILE VOID
%token STRUCT UNION ENUM ELLIPSIS

%token CASE DEFAULT IF ELSE SWITCH WHILE DO FOR GOTO CONTINUE BREAK RETURN

%type <node> PrimaryExp  IDENTIFIER  CONSTANT  STRING_LITERAL  Exp  TYPE_NAME

%type <node> PostfixExp  ArgExpList  AssignExp  CondExp  UnaryExp  CastExp ConstExp
//Decl : declaration的缩写, 表示声明  decl : declarator的缩写, 表示声明符
%type <node> Declaration  Declaration_Spec  init_decl_s  init_decl  TypeSpec  StorageSpec

%type <node> StructUnionSpec  struct_Declaration_s  struct_Declaration  SpecQua_s  struct_decl_s  struct_decl

%type <node> EnumSpec  Enum  Enum_s

%type <node> declarator  direct_decl  pointer  TypeQua  TypeQua_s  ParamType_s  Param_s  Param_Declaration   Ident_s  type_name  Declaration_s  

%type <node> abs_decl  direct_abs_decl  Init  Init_s

%type <node>  Stmt_s Stmt  Block
%type <node> Exp1  Exp2  Exp3  
%type <node>  TransUnit  ExternalDef  FunctionDef  FunctionDecl  FunctionBody

%start TransUnit
%nonassoc LOWER_THAN_ELSE
%nonassoc ELSE
%%

PrimaryExp
	: IDENTIFIER  { $$ = $1; }
	| CONSTANT    { $$ = $1; }
	| STRING_LITERAL  { $$ = $1; }
	| '(' Exp ')'  { $$ = link(exp_, $2, 0); }
	;

PostfixExp
	: PrimaryExp  { $$ = $1; }
	| PostfixExp '[' Exp ']' { $$ = link(array_, $1, $3, 0); }
	| PostfixExp '(' ')'  { $$ = link(funccall_, $1, 0); }
	| PostfixExp '(' ArgExpList ')' { $$ = link(funccall_, $1, $3, 0); }
	| PostfixExp '.' IDENTIFIER  { $$ = link(member_, $1, $3, 0); }
	| PostfixExp PTR_OP IDENTIFIER  { $$ = link(ptrto_, $1, $3, 0); }
	| PostfixExp INC_OP  { $$ = link(postinc_, $1, 0); }
	| PostfixExp DEC_OP  { $$ = link(postdec_, $1, 0); }
	;

ArgExpList
	: AssignExp  { $$ = link(arguments_, $1, 0); }
	| ArgExpList ',' AssignExp  { $$ = $1; addchild($1, $3); }
	;

UnaryExp
	: PostfixExp  { $$ = $1; }
	| INC_OP UnaryExp  { $$ = link(preinc_, $2, 0); }
	| DEC_OP UnaryExp  { $$ = link(predec_, $2, 0); }
	| '&' CastExp  { $$ = link(addressof_, $2, 0); }
	| '*' CastExp  { $$ = link(contentsof_, $2, 0); }
	| '+' CastExp  { $$ = link(positive_, $2, 0); }
	| '-' CastExp  { $$ = link(negative_, $2, 0); }
	| '~' CastExp  { $$ = link(complement_, $2, 0); }
	| '!' CastExp  { $$ = link(not_, $2, 0); }
	| SIZEOF UnaryExp  { $$ = link(sizeof_, $2, 0); }
	| SIZEOF '(' type_name ')'  { $$ = link(sizeof_, $3, 0); }
	;

CastExp
	: UnaryExp  { $$ = $1; }
	| '(' type_name ')' CastExp  { $$ = link(cast_, $2, $4, 0); }
	;

CondExp
	: CastExp  { $$ = $1; }
	| CondExp '?' Exp ':' CondExp { $$ = link(question_, $1, $3, $5, 0); }  %prec COLON
	| CondExp OR_OP CondExp	{ $$ = link(or_, $1, $3, 0);}
  | CondExp AND_OP CondExp	{ $$ = link(and_, $1, $3, 0);}  
  | CondExp '|'  CondExp	{ $$ = link(bitor_, $1, $3, 0);} 
  | CondExp '^'  CondExp	{ $$ = link(bitxor_, $1, $3, 0);} 
  | CondExp '&'  CondExp	{ $$ = link(bitand_, $1, $3, 0);} 
  | CondExp EQ_OP CondExp	{ $$ = link(eq_, $1, $3, 0);} 
  | CondExp NE_OP CondExp	{ $$ = link(ne_, $1, $3, 0);} 
  | CondExp '<'  CondExp	{ $$ = link(lt_, $1, $3, 0);} 
  | CondExp '>'  CondExp	{ $$ = link(gt_, $1, $3, 0);} 
  | CondExp LE_OP CondExp	{ $$ = link(le_, $1, $3, 0);} 
  | CondExp GE_OP CondExp	{ $$ = link(ge_, $1, $3, 0);} 
  | CondExp LEFT_OP CondExp	{ $$ = link(shl_, $1, $3, 0);} 
  | CondExp RIGHT_OP CondExp	{ $$ = link(shr_, $1, $3, 0);} 
  | CondExp '+'  CondExp	{ $$ = link(add_, $1, $3, 0);} 
  | CondExp '-'  CondExp	{ $$ = link(sub_, $1, $3, 0);} 
  | CondExp '*'  CondExp	{ $$ = link(mul_, $1, $3, 0);} 
  | CondExp '/'  CondExp	{ $$ = link(div_, $1, $3, 0);} 
  | CondExp '%'  CondExp  { $$ = link(mod_, $1, $3, 0);} 
	;

AssignExp
	: CondExp { $$ = $1; }
	| UnaryExp '=' AssignExp 	{ $$ = link(equals_, $1, $3, 0); } 
	| UnaryExp MUL_ASSIGN AssignExp 	{ $$ = link(muleq_, $1, $3, 0); } 
	| UnaryExp DIV_ASSIGN AssignExp 	{ $$ = link(diveq_, $1, $3, 0); } 
	| UnaryExp MOD_ASSIGN AssignExp 	{ $$ = link(modeq_, $1, $3, 0); } 
	| UnaryExp ADD_ASSIGN AssignExp 	{ $$ = link(addeq_, $1, $3, 0); } 
	| UnaryExp SUB_ASSIGN AssignExp 	{ $$ = link(subeq_, $1, $3, 0); } 
	| UnaryExp LEFT_ASSIGN AssignExp 	{ $$ = link(shleq_, $1, $3, 0); } 
	| UnaryExp RIGHT_ASSIGN AssignExp 	{ $$ = link(shreq_, $1, $3, 0); } 
	| UnaryExp AND_ASSIGN AssignExp 	{ $$ = link(andeq_, $1, $3, 0); } 
	| UnaryExp XOR_ASSIGN AssignExp 	{ $$ = link(xoreq_, $1, $3, 0); } 
	| UnaryExp OR_ASSIGN AssignExp 	{ $$ = link(oreq_, $1, $3, 0); } 
	;

Exp
	: AssignExp  { $$ = link(assignment_, $1, 0); }
	| Exp ',' AssignExp { $$ = link(comma_, $1, $3, 0); }
	;

ConstExp
	: CondExp  { $$ = link(condexp_, $1, 0); }
	;

Declaration
	: Declaration_Spec ';'  { $$ = link(decl_, $1, 0); }
	| Declaration_Spec init_decl_s ';'  { $$ = link(decl_init_, $1, $2, 0); adjust_term($$, 4) }
	;

Declaration_Spec
	: StorageSpec  { $$ = link(decl_spec_, $1, 0); }
	| StorageSpec Declaration_Spec  { $$ = $1; addchild($1, $2); }
	| TypeSpec  { $$ = link(decl_spec_, $1, 0); }
	| TypeSpec Declaration_Spec  { $$ = $1; addchild($1, $2); }
	| TypeQua  { $$ = link(decl_spec_, $1, 0); }
	| TypeQua Declaration_Spec  { $$ = $1; addchild($1, $2); }
	;

init_decl_s
	: init_decl  { $$ = link(init_declarators_, $1, 0); }
	| init_decl_s ',' init_decl  { $$ = $1; addchild($1, $3); } 
	;

init_decl
	: declarator  { $$ = link(declarator_, $1, 0); }
	| declarator '=' Init  { $$ = link(declaratorinit_, $1, $3, 0); } 
	;

StorageSpec
	: TYPEDEF  { $$ = link(typedef_, 0); }
	| EXTERN  { $$ = link(extern_, 0); }
	| STATIC  { $$ = link(static_, 0); }
	| AUTO  { $$ = link(auto_, 0); }
	| REGISTER  { $$ = link(register_, 0); }
	;
	
TypeSpec
	: VOID    { $$ = link(void_, 0); }
	| CHAR    { $$ = link(char_, 0); }
	| SHORT   { $$ = link(short_, 0); }
	| INT     { $$ = link(int_, 0); }
	| LONG    { $$ = link(long_, 0); }
	| FLOAT   { $$ = link(float_, 0); }
	| DOUBLE  { $$ = link(double_, 0); }
	| SIGNED  { $$ = link(signed_, 0); }
	| UNSIGNED         { $$ = link(unsigned_, 0); }
	| StructUnionSpec  { $$ = link(struct_or_union_, $1, 0); }
	| EnumSpec         { $$ = link(enum_, $1, 0); }
	| TYPE_NAME        { $$ = $1; }
	;

TypeQua
	: CONST  { $$ = link(const_, 0); }
	| VOLATILE  { $$ = link(volatile_, 0); }
	;

TypeQua_s
	: TypeQua  { $$ = link(type_qualifiers_, $1, 0); }
	| TypeQua_s TypeQua  { $$ = $1; addchild($1, $2); }
	;

StructUnionSpec
	: STRUCT IDENTIFIER '{' struct_Declaration_s '}'  { $$ = link(struct_, $2, $4, 0); } 
	| STRUCT '{' struct_Declaration_s '}' { $$ = link(struct_, $3, 0); } 
	| STRUCT IDENTIFIER  { $$ = link(struct_, $2, 0); } 
	| UNION IDENTIFIER '{' struct_Declaration_s '}'  { $$ = link(union_, $2, $4, 0); } 
	| UNION '{' struct_Declaration_s '}' { $$ = link(union_, $3, 0); } 
	| UNION IDENTIFIER  { $$ = link(union_, $2, 0); } 
	;


struct_Declaration_s
	: struct_Declaration  { $$ = link(struct_declarations_, $1, 0); }
	| struct_Declaration_s struct_Declaration  { $$ = $1; addchild($1, $2); }
	;

struct_Declaration
	: SpecQua_s struct_decl_s ';'  { $$ = link(struct_declaration_, $1, $2, 0); }
	;

SpecQua_s
	: TypeSpec SpecQua_s  { $$ = $1; addchild($1, $2); }
	| TypeSpec  { $$ = link(spec_qua_s_, $1, 0); }
	| TypeQua SpecQua_s  { $$ = $1; addchild($1, $2); }
	| TypeQua  { $$ = link(spec_qua_s_, $1, 0); }
	;

struct_decl_s
	: struct_decl  { $$ = link(struct_declarators_, $1, 0); }
	| struct_decl_s ',' struct_decl  { $$ = $1; addchild($1, $3); }
	;

struct_decl
	: declarator  { $$ = link(struct_declarator_, $1, 0); }
	| ':' ConstExp  { $$ = link(struct_declarator_, $2, 0); }
	| declarator ':' ConstExp  { $$ = link(struct_declarator_, $1, $3, 0); }
	;

EnumSpec
	: ENUM '{' Enum_s '}'  { $$ = link(enum_spec_, $3, 0); }
	| ENUM IDENTIFIER '{' Enum_s '}'  { $$ = link(enum_spec_, $2, $4, 0); }
	| ENUM IDENTIFIER  { $$ = link(enum_spec_, $2, 0); }
	;

Enum_s
	: Enum  { $$ = link(enumerators_, $1, 0); }
	| Enum_s ',' Enum  { $$ = $1; addchild($1, $3); }
	;

Enum
	: IDENTIFIER  { $$ = link(enumident_, $1, 0); }
	| IDENTIFIER '=' ConstExp  { $$ = link(enumequals_, $1, $3, 0); }
	;

declarator
	: pointer direct_decl  { $$ = link(direct_decl_, $1, $2, 0); }
	| direct_decl  { $$ = link(direct_decl_, $1, 0); }
	;

direct_decl
	: IDENTIFIER  { $$ = link(ident_, $1, 0); }
	| '(' declarator ')'  { $$ = link(declarator_, $2, 0); }
	| direct_decl '[' ConstExp ']'  { $$ = link(arraydecl_, $1, $3, 0); }
	| direct_decl '[' ']'  { $$ = link(arraydecl_, $1, 0); }
	| direct_decl '(' ParamType_s ')'  { $$ = link(funcdecl_, $1, $3, 0); }
	| direct_decl '(' Ident_s ')'  { $$ = link(funcdecl_, $1, $3, 0); }
	| direct_decl '(' ')'  { $$ = link(funcdecl_, $1, 0); }
	;

pointer
	: '*'  {$$ = link(pointer_, 0); }
	| '*' TypeQua_s  { $$ = link(pointer_, $2, 0); }
	| '*' pointer  { $$ = link(pointer_, $2, 0); }
	| '*' TypeQua_s pointer  { $$ = link(pointer_, $2, $3, 0); }
	;

ParamType_s
	: Param_s  { $$ = link(param_types_, $1, 0); }
	| Param_s ',' ELLIPSIS  { $$ = link(param_types_ellipsis_, $1, 0); }
	;

Param_s
	: Param_Declaration  { $$ = link(param_declarations_, $1, 0); }
	| Param_s ',' Param_Declaration  { $$ = $1; addchild($1, $3); }
	;

Param_Declaration
	: Declaration_Spec declarator { $$ = link(declarator_, $1, $2, 0); }
	| Declaration_Spec abs_decl  { $$ = link(absarg_, $1, $2, 0); }
	| Declaration_Spec  { $$ = link(declarator_, $1, 0); }
	;

Ident_s
	: IDENTIFIER  { $$ = link(idents_, $1, 0); }
	| Ident_s ',' IDENTIFIER  { $$ = $1; addchild($1, $3); }
	;

type_name
	: SpecQua_s  { $$ = link(typespec_, $1, 0); }
	| SpecQua_s abs_decl  { $$ = link(typespec_, $1, $2, 0); }
	;

abs_decl
	: pointer  { $$ = link(abstract_declarator_, $1, 0); }
	| direct_abs_decl  { $$ = link(abstract_declarator_, $1, 0); }
	| pointer direct_abs_decl  { $$ = link(abstract_declarator_, $1, $2, 0); }
	;

direct_abs_decl
	: '(' abs_decl ')'  { $$ = link(abstract_declarator_, $2, 0); }
	| '[' ']'  { $$ = link(constexp_, 0); }
	| '[' ConstExp ']' { $$ = link(constexp_, $2, 0); }
	| direct_abs_decl '[' ']' { $$ = link(absarray_, $1, 0); }
	| direct_abs_decl '[' ConstExp ']'  { $$ = link(absarray_, $1, $3, 0); }
	| '(' ')'  { $$ = link(absfunc_, 0); }
	| '(' ParamType_s ')'  { $$ = link(absfunc_, $2, 0); }
	| direct_abs_decl '(' ')'  { $$ = link(absfunc_, $1, 0); }
	| direct_abs_decl '(' ParamType_s ')'  { $$ = link(absfunc_, $1, $3, 0); }
	;

Init
	: AssignExp  { $$ = link(assign_, $1, 0); }
	| '{' Init_s '}'  { $$ = link(Init_, $2, 0); }
	| '{' Init_s ',' '}'  { $$ = link(Init_comma_, $2, 0); }
	;

Init_s
	: Init  { $$ = link(init_s_, $1, 0); }
	| Init_s ',' Init  { $$ = $1; addchild($1, $3); }
	;

Stmt
	: IDENTIFIER ':' Stmt { $$ = link(labeledstmt_, $1, $3, 0); }
	| CASE ConstExp ':' Stmt { $$ = link(case_, $2, $4, 0); }
	| DEFAULT ':' Stmt { $$ = link(default_, $3, 0); }
	
	| Block { $$ = link(block_, $1, 0); }	
	| ';' { $$ = link(empty_stmt_, 0); }
	| Exp ';' { $$ = link(exp_, $1, 0); } 
	
	| IF '(' Exp ')' Stmt Stmt %prec LOWER_THAN_ELSE{ $$ = link(if_, $3, $5, 0); }
	| IF '(' Exp ')' Stmt ELSE Stmt { $$ = link(ifelse_, $3, $5, $7, 0); }
	| SWITCH '(' Exp ')' Stmt { $$ = link(switch_, $3, $5, 0);}
	
	| WHILE '(' Exp ')' Stmt { $$ = link(while_, $3, $5, 0); }
	| DO Stmt WHILE '(' Exp ')' ';' { $$ = link(do_, $2, $5, 0); }
	| FOR '(' Exp1 ';' Exp2 ';' Exp3 ')' Stmt { $$ = link(for_, $3, $5, $7, $9, 0); }
	
	| GOTO IDENTIFIER ';' { $$ = link(goto_, $2, 0); }
	| CONTINUE ';' { $$ = link(continue_, 0); }
	| BREAK ';' { $$ = link(break_, 0); }
	| RETURN ';' { $$ = link(return_, 0); }
	| RETURN Exp ';' { $$ = link(return_exp_, $2, 0); }
	| error ';' {yyerrok;}
	;

Exp1
   :  { $$ = link(no_stmt_, 0); }
   | Exp { $$ = link(exp1_, $1, 0); }
   ;

Exp2
   :  { $$ = link(no_stmt_, 0); }
   | Exp { $$ = link(exp2_, $1, 0); }
   ;

Exp3
   : { $$ = link(no_stmt_, 0); }
   | Exp { $$ = link(exp3_, $1, 0); }
   ;

Block
	: '{' '}'  { $$ = link(compound_stmt_, 0); }
	| '{' Stmt_s '}'  { $$ = link(compound_stmt_, $2, 0); }
	| '{' Declaration_s '}'  { $$ = link(compound_stmt_, $2, 0); }
	| '{' Declaration_s Stmt_s '}'  { $$ = link(compound_stmt_, $2, $3, 0); }
	;

Declaration_s
	: Declaration  { $$ = link(declarations_, $1, 0); }
	| Declaration_s Declaration  { $$ = $1; addchild($1, $2); }
	;

Stmt_s
	: Stmt  { $$ = link(statements_, $1, 0); }
	| Stmt_s Stmt  {$$ = $1; addchild($1, $2); }
	;

TransUnit
	: ExternalDef  { $$ = link(goal_, $1, 0); parse_tree = $$; root = $$->node_index; }
	| TransUnit ExternalDef  { $$ = $1; addchild($1, $2); parse_tree = $$; root = $$->node_index; }
	;

ExternalDef
	: FunctionDef  { $$ = link(extdef_, $1, 0); }
	| Declaration  { $$ = link(extdef_, $1, 0); }
	;

FunctionDef
	: FunctionDecl FunctionBody { $$ = link(funcdef_, $1, $2, 0); }
	;

FunctionDecl
	: Declaration_Spec declarator Declaration_s { $$ = link(funcdecl_, $1, $2, $3, 0); }
	| Declaration_Spec declarator { $$ = link(funcdecl_, $1, $2, 0); }
	| declarator Declaration_s { $$ = link(funcdecl_, $1, $2, 0); }
	| declarator { $$ = link(funcdecl_, $1, 0); }
	;
	
FunctionBody
	: Block { $$ = link(funcbody_, $1, 0); }
	;

%%
#include <stdio.h>

extern char yytext[];
extern int column;

Node * link(int tid, Node * rExp, ... )
{
	Node * node1;
	Node * node2;
	va_list exps;
  Node * parent_node = new_node();
  
	parent_node->id = tid; 
	parent_node->line = yylineno;

	if( rExp == NULL ) return parent_node;

	va_start(exps,rExp);
	node1 = rExp;  //第一个子节点
	parent_node->child = node1->node_index; 
	node1->parent = parent_node->node_index;

	node2=va_arg(exps,Node *);

	while(node2!=NULL){
		node1->next = node2->node_index; 
		node2->prev = node1->node_index;

		node1 = node2; 
		node2=va_arg(exps,Node *);
	}

	va_end( exps ); 
  
  return parent_node;
  
}

