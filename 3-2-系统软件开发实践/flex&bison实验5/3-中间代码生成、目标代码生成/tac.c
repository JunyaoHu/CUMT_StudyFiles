#include "parser.h"
#include <string.h>

extern int root;
extern Node*   node;
extern char * node_name[140];
extern struct Symbol*  symbol;

char *op_string(int op);
static void start_tac(int n);
static char *deal_expk(int n);   //处理算术表达式
static void MAIN_K(int n);       //处理main
static void DEFINEPARA_K(int n); //处理定义结点
static void ASSIGN_K(int n);     //处理赋值结点
//static void IF_K(treenode *lnode);          ///处理if结点
static void get_tac(int op,char a[],char b[],char c[]);  //产生四元式
static char * newtemp();    //申请临时寄存器
fourvarcode *tac_temp;      //四元式链表的一个变量指针
fourvarcode *tac_head;      //四元式链表头指针
static int newtemp_no=0;
static char adr[10]= {'\0'};
static char empty[10]= "\0";
void print_tac();

void  tac()
{
    tac_head=(fourvarcode*)malloc(sizeof(fourvarcode));
    tac_temp=tac_head;
    start_tac(root);
	print_tac();
	start_optimize(tac_head);
	start_asm(tac_head);
	printf("\nOK\n");
}

void start_tac(int n)
{
	//暂时只做了简单的main函数、变量定义和简单语句的节点处理
    while(n!=0)
    {
		char *start=node_name[node[n].id];  //取出结点name
        if(strcmp(start,"funcdecl_")==0)    //main方法体
        {
            MAIN_K(n);
			break;
        }
        if(strcmp(start,"declarations_")==0)  //变量定义
        {
            DEFINEPARA_K(n);
			n = node[n].next;    //下一个兄弟结点
			continue;
        }
        if(strcmp(start,"statements_")==0)  //算术表达式
        {
            ASSIGN_K(n);
			n = node[n].next;  //下一个兄弟结点
			continue;
        }
		n = node[n].child;  //下一个子结点
    }
}

//处理main结点
void MAIN_K(int n)
{
    char a[10];
    a[0]='0';
    a[1]='\0';
    get_tac(6,adr,adr,adr);   //main函数开始
    start_tac(node[n].next);  //递归进入main结构
    get_tac(7,adr,adr,adr);   //main函数结束
}

//处理变量定义结点
void DEFINEPARA_K(int n)
{
	char a[10];
	char b[10];
	n = node[n].child;//decl_init_
	while(n!=0)
	{
		int i=node[n].child;//decl_spec_
		char *d1=node_name[node[node[i].child].id];//type
		strcpy(a,d1);
		i=node[i].next; //init_declarators_
		i=node[i].child; //declarator_
		while(i!=0)
		{
			int j=node[i].child;//direct_decl_
			j=node[j].child; //ident
			j=node[j].child; //name
			int sti = node[j].sti;
			char* d2= symbol[sti].name;
			strcpy(b,d2);
			get_tac(8,a,b,adr);  //生成变量定义四元式
			i=node[i].next;//next declarator_
		}
		n=node[n].next;//next decl_init_
	}
}

//处理赋值结点
void ASSIGN_K(int n)
{
	char t1[10],t2[10];
	n = node[n].child;//exp_
	while(n!=0)
	{
		strcpy(t1,newtemp());
		int i=node[n].child;//assignment_
		i=node[i].child;//equals_
		i=node[i].child;//IDENT_
		strcpy(t2,deal_expk(node[i].next));
        get_tac(1,t2,t1,adr);
		int sti = node[i].sti;
		char* q= symbol[sti].name;
		get_tac(1,t1,q,adr);
		n=node[n].next;
	}
}

//建立四元式方法
void get_tac(int op,char a[],char b[],char c[])
{
    fourvarcode* t=NULL;
    t=(fourvarcode*)malloc(sizeof(fourvarcode));
    t->op=op;

    if(a[0]=='\0')
    {
		strcpy(t->addr1.kind,"emptys");
        strcpy(t->addr1.name,"\0");
    }
    else if((a[0]>='a'&&a[0]<='z')||(a[0]>='A'&&a[0]<='Z'))
    {
        strcpy(t->addr2.kind,"strings");
        strcpy(t->addr1.name,a);
    }
    else
    {
        strcpy(t->addr2.kind,"consts");
        strcpy(t->addr1.name,a);
    }


    if(b[0]=='\0')
    {
		strcpy(t->addr2.kind,"emptys");
        strcpy(t->addr2.name,"\0");
    }
    else if((b[0]>='a'&&b[0]<='z')||(b[0]>='A'&&b[0]<='Z'))
    {
        strcpy(t->addr2.kind,"strings");
        strcpy(t->addr2.name,b);
    }
    else
    {
		strcpy(t->addr2.kind,"consts");
        strcpy(t->addr2.name,b);
    }


    if(c[0]=='\0')
    {
        strcpy(t->addr3.kind,"emptys");
        strcpy(t->addr3.name,"\0");
    }
    else if((c[0]>='a'&&c[0]<='z')||(c[0]>='A'&&c[0]<='Z'))
    {
        strcpy(t->addr3.kind,"strings");
        strcpy(t->addr3.name,c);
    }
    else
    {
        strcpy(t->addr3.kind,"consts");
        strcpy(t->addr3.name,c);
    }

    t->next=NULL;
    tac_temp->next=t;
    tac_temp=t;
}

char *newtemp()
{
    static char s[10];
    sprintf(s,"t#%d",newtemp_no);
    newtemp_no++;
    return s;
}

char* deal_expk(int n) //处理expk式子
{
	char empty[10];
    empty[0]='\0';
	char *e=node_name[node[n].id];
	static char t1[10],t2[10],t3[10];
    if(strcmp(e,"IDENT_")==0)
	{
		int sti = node[n].sti;
		char* e1= symbol[sti].name;
		strcpy(t1,newtemp());
		get_tac(1,e1,t1,adr);
		return t1;
	}
	if(strcmp(e,"CONST_")==0)
	{
		int sti = node[n].sti;
		char* e1= symbol[sti].name;
		return e1;
	}
	if(strcmp(e,"add_")==0)
	{
		int i=node[n].child;
		int j=node[i].next;
		strcpy(t1,deal_expk(i));
		strcpy(t2,deal_expk(j));
		strcpy(t3,newtemp());
        get_tac(3,t1,t2,t3);
        return t3;
	}
	if(strcmp(e,"sub_")==0)
	{
		int i=node[n].child;
		int j=node[i].next;
		strcpy(t1,deal_expk(i));
		strcpy(t2,deal_expk(j));
		strcpy(t3,newtemp());
        get_tac(4,t1,t2,t3);
        return t3;
	}
	if(strcmp(e,"mul_")==0)
	{
		int i=node[n].child;
		int j=node[i].next;
		strcpy(t1,deal_expk(i));
		strcpy(t2,deal_expk(j));
		strcpy(t3,newtemp());
        get_tac(2,t1,t2,t3);
        return t3;
	}
	if(strcmp(e,"div_")==0)
	{
		int i=node[n].child;
		int j=node[i].next;
		strcpy(t1,deal_expk(i));
		strcpy(t2,deal_expk(j));
		strcpy(t3,newtemp());
        get_tac(5,t1,t2,t3);
        return t3;
	}
	if(strcmp(e,"exp_")==0)
	{
		n=node[n].child;//assignment_
		n=node[n].child;
		deal_expk(n);
	}
}

void print_tac()
{
	char s[10] = { 0 };
	int line = 100;
	FILE* fp = fopen("./output_file/tac.txt", "w");
	fourvarcode* t = tac_head->next;
	while (t != NULL)
	{
		sprintf(s, "%d ", line);
		fprintf(fp, s);
		printf("%d ",line);
		line++;

		fprintf(fp, "(");
		printf("(");

		fprintf(fp, op_string(t->op));
		fprintf(fp, " , ");
	    
		printf("%s ,",op_string(t->op));


		if (t->addr1.name == "\0"){
			fprintf(fp, "_ , ");
			printf("_ ,");
		}	
		else {
			fprintf(fp, t->addr1.name);
			fprintf(fp, " , ");
			printf("%s ,",t->addr1.name);
		}
		if (t->addr2.name == "\0") {
			fprintf(fp, "_ , ");
			printf("_ ,");
		}
		else {
			fprintf(fp, t->addr2.name);
			fprintf(fp, " , ");
			printf("%s ,",t->addr2.name);
		}
		if (t->addr3.name == "\0"){
			fprintf(fp, "_ ");
			printf("_ ");
		}
		else {
			fprintf(fp, t->addr3.name);
			printf("%s ",t->addr3.name);
		}
		t = t->next;
		fprintf(fp, ")");
		fprintf(fp, "\n");
		printf(")");
		printf("\n");
	}
	fclose(fp);
}


char *op_string(int op)
{
    switch (op)
    {
    case (1):
        return "=";
    case (2):
        return "*";
    case (3):
        return "+";
    case (4):
        return "-";
	case (5):
        return "/";
    case (6):
        return "mainfun";
    case(7):
        return "mainfun_end";
    case(8):
        return "definepara";
    default:
        printf("匹配有误");
		return 0;
    }
}
