//asm.c
#include"parser.h"
#include "stdio.h"
#include "stdlib.h"

void flocal_table(char type[],char name[],char num[],int n);
static void build_asm(fourvarcode* t);
static void build_define(fourvarcode* t);
static void build_assign(fourvarcode* t);
static void build_return(fourvarcode* t);
static void build_muls(fourvarcode* t); ///乘
static void build_divs(fourvarcode* t);  ///除
static void build_adds(fourvarcode* t);
static void build_minu(fourvarcode* t);
static void build_mainfuns(fourvarcode* t);
static void build_mainfuns_end(fourvarcode* t); 
void fglocal_table(char type[],char name[],char num[],int n);
symboltable *lsptempg,*lsptempl;///用于构造符号表的临时变量
fourvarcode* ltag;
char empty[]="\0";
int AX_FLAG=0,BX_FLAG=0,CX_FLAG=0,DX_FLAG=0,SI_FLAG=0;///通用寄存器
char assign_table[20][20];
int num=0;
symboltable *local_table;
int stackn=0;
char function_table[20][20]; ///函数名
int function_num = 0; ///函数个数
FILE *fp;
 
void flocal_table(char type[],char name[],char num[],int n)
{
    symboltable *t;
    t = (symboltable *)malloc(sizeof(symboltable));
    t->next = NULL;
    strcpy(t->type, type);
    strcpy(t->name, name);
    t->location=n;
    lsptempl->next=t;
    lsptempl=t;
}
 
int searchlocal(char a[20])
{
    symboltable *t=local_table->next;
 
    while(t!=NULL)
    {
        if(strcmp(t->name,a)==0)
        {
            return t->location;
            break;
        }
        t=t->next;
    }
    return -1;
}
void registerfree(char b[10])
{
    if(strcmp(b,"AX")==0||strcmp(b,"EAX")==0)
    {
        AX_FLAG=0;
    }
    if(strcmp(b,"BX")==0||strcmp(b,"EBX")==0)
    {
        BX_FLAG=0;
    }
    if(strcmp(b,"CX")==0||strcmp(b,"ECX")==0)
    {
        CX_FLAG=0;
    }
}
void start_asm(fourvarcode* tac_head)
{
   fp = fopen("./output_file/x86.asm","w+");

    printf(".MODEL SMALL\n");
    // printf(".386\n");
    printf(".STACK 100H\n");
    printf(".DATA\n");
    printf(".CODE\n");
    //printf(".STARTUP\n");
    printf("start:mov ax,@data\n");
    printf("mov ds,ax\n");

    fprintf(fp,".MODEL SMALL\n");
    /*fprintf(fp,".386\n");*/
    fprintf(fp,".STACK 100H\n");
    fprintf(fp,".DATA\n");
    fprintf(fp,".CODE\n");
    fprintf(fp,"start:mov ax,@data\n");
    fprintf(fp,"mov ds,ax\n");

    local_table=(symboltable *)malloc(sizeof(symboltable));
    lsptempl=local_table;
    local_table->next=NULL;
 
    fourvarcode* t=tac_head->next;
    if(t->op!=6);
    {
        while(t->op!=6)
        {
            t=t->next;
        }
    }
 
    fourvarcode* q=t->next;
    while(q->op!=7)
    {
        if(q->op==8)
        {
            build_asm(q);
        }
        q=q->next;
    }
 
    build_asm(t); //此时t是mainstart
    printf("push bp\n");
    printf("mov bp,sp\n");
    printf("jmp alloc\n");
    printf("main:\n");

    fprintf(fp,"push bp\n");
    fprintf(fp,"mov bp,sp\n");
    fprintf(fp,"jmp alloc\n");
    fprintf(fp,"main:\n");
 
    t=t->next; 
    while (t->op != 7)
    {
        if (t->op != 8)
        {
            build_asm(t);
        }
        t = t->next;
    }
    build_asm(t);
    printf("jmp over\n");
    fprintf(fp,"jmp over\n");
    int i;
    fprintf(fp,"alloc:\n");
    for(i=num; i>=1; i--)
    {
        if(strcmp(assign_table[i],empty)==0)
        {
            printf("MOV AX,0\n");
            printf("PUSH AX\n");
            fprintf(fp,"MOV AX,0\n");
            fprintf(fp,"PUSH AX\n");
        }
        else 
        {
            fprintf(fp,"MOV AX,%s\n",assign_table[i]);
            fprintf(fp,"PUSH AX\n");
            printf("MOV AX,%s\n",assign_table[i]);
            printf("PUSH AX\n");
        }
    }
    printf("jmp main\n");
    printf("over:\n");
    fprintf(fp,"jmp main\n");
    fprintf(fp,"over:\n");
   // printf(".exit\n");
   // printf("end\n");
   printf("mov ah,4ch\n");
   printf("int 21h\n");
   printf("end start\n");
   fprintf(fp,"mov ah,4ch\n");
   fprintf(fp,"int 21h\n");
   fprintf(fp,"end start\n");
   
   fclose(fp);
 
}

/***********************************************************
* 功能:全局定义的变量
**********************************************************/
void define_para(fourvarcode* tac_head)
{
	fourvarcode *t=tac_head->next;
	int num=0;
	if(t->op!=9&&t->op!=6)
	{
		while(t->op!=9 && t->op!=6)
		{
             flocal_table(t->addr1.name,t->addr2.name,t->addr3.name,num+1);
			t=t->next;
			num++;
		}
	}
	registerfree("AX");
	registerfree("BX");
	registerfree("CX");
}
 
/***********************************************************
* 功能:开始根据op来生成汇编代码
**********************************************************/
void build_asm(fourvarcode* t)
{
    if(t->op==8)
    {
        build_define(t);
        return;
    }
    if(t->op==1)
    {
        build_assign(t);
        return ;
    }
    if(t->op==4)//-
    {
        build_minu(t);
        return ;
    }
    if(t->op==5)//÷
    {
        build_divs(t);
        return ;
    }
    if(t->op==3)//+
    {
        build_adds(t);
        return ;
    }
    if(t->op==2)//*
    {
        build_muls(t);
        return ;
    }
    if(t->op==6)
    {
        build_mainfuns(t);
        return ;
    }
    if(t->op==7)
    {
        build_mainfuns_end(t);
        return ;
    }
}
 
/***********************************************************
* 功能:用于申请寄存器 为0则可以用
**********************************************************/
char *registerspare()
{
    if(AX_FLAG==0)
    {
        AX_FLAG=1;
        return "AX";
    }
    if(BX_FLAG==0)
    {
        BX_FLAG=1;
        return "BX";
    }
 
    if(CX_FLAG==0)
    {
        CX_FLAG=1;
        return "CX";
    }
    return "-1";
}
 
/***********************************************************
* 功能:
        具体建立汇编代码
**********************************************************/
 
void build_define(fourvarcode* t)  ///跟符号表有关了！！
{
    flocal_table(t->addr1.name,t->addr2.name,t->addr3.name,num+1);
    if(strcmp(t->addr3.name,empty)==0)////这一定不是数组定义了
    {
        num++;
    }
}
 
void build_assign(fourvarcode* t)
{
    char b[20], a1[20], a2[20];  ///a1 a2分别用来存储 赋值四元式的 值和变量名
    strcpy(a1, t->addr1.name);
    strcpy(a2, t->addr2.name);
    if (a1[0] >= '0' && a1[0] <= '9')///数字赋给局部变量或者中间变量
    {
        if (((a2[0] >= 'a' && a2[0] <= 'z') || (a2[0] >= 'A' && a2[0] <= 'Z')) && a2[1] != '#')///局部变量 形如这样的四元式= ,1,a,___
        {
            ///找一下当前变量是否在局部变量表
            if (searchlocal(t->addr2.name) != (-1))
            {
                int n = searchlocal(t->addr2.name);
                if (strcmp(assign_table[n], empty) == 0)
                {
                    strcpy(assign_table[n], t->addr1.name);
                    printf("MOV AX,%s\n", assign_table[n]);
                    printf("MOV [BP+%d],AX\n", n * 2);
                    fprintf(fp, "MOV AX,%s\n", assign_table[n]);
                    fprintf(fp, "MOV [BP+%d],AX\n", n * 2);
                }
                else  ///如果不是则为全局变量
                {
                    printf("MOV AX,%s\n", t->addr1.name);
                    printf("MOV [BP+%d],AX\n", n * 2);
                    fprintf(fp, "MOV AX,%s\n", t->addr1.name);
                    fprintf(fp, "MOV [BP+%d],AX\n", n * 2);
                }
            }
        }
        else  ///if(a2[1]=='#'形如 =，1，t#1
        {
            strcpy(b, registerspare());
            printf("MOV %s,%s\n", b, a1);
            fprintf(fp, "MOV %s,%s\n", b, a1);
        }
    }

    else if (((a1[0] >= 'a' && a1[0] <= 'z') || (a1[0] >= 'A' && a1[0] <= 'Z')) && a1[1] != '#')  ///形如这样的四元式 =,a,t#1,___ 主要翻译if while for (a<b)
    {
        ///中间变量寄存器的赋值
        int c1 = searchlocal(a1);
        strcpy(b, registerspare());
        if (c1 != -1)
        {
            printf("MOV %s,[BP+%d]\n", b, c1 * 2);
            fprintf(fp, "MOV %s,[BP+%d]\n", b, c1 * 2);
        }
    }
}
void build_label(fourvarcode* t)
{
    printf("%s:\n",t->addr1.name);
    fprintf(fp,"%s:\n",t->addr1.name);
}
 
void build_jump(fourvarcode* t)
{
    printf("JMP %s\n",t->addr1.name);
    fprintf(fp,"JMP %s\n",t->addr1.name);
}
 
void build_return(fourvarcode* t) ///为函数调用准备
{
    char a1[10];
    strcpy(a1,t->addr1.name);
    if(((a1[0]>='a'&&a1[0]<='z')||(a1[0]>='A'&&a1[0]<='Z'))&&a1[1]!='#')//返回局部变量
    {
        int d;
        //d=searchstack(a1);
        if(d>-1&&d<0)
        {
            d=-(d+2);
            printf("MOV BX,[BP+%d]\n",d);
            printf("MOV BP,SP\n");
            fprintf(fp,"MOV BX,[BP+%d]\n",d);
            fprintf(fp,"MOV BP,SP\n");
        }
        else
        {
            printf("MOV [BP-2],AX \n");
            fprintf(fp,"MOV [BP-2],AX \n");
        }
 
    }
    if(a1[1]=='#')//返回中间变量
    {
 
        if(AX_FLAG==1)
        {
            printf("MOV AX,BX\n");
            fprintf(fp,"MOV AX,BX\n");
            registerfree("AX");
        }
    }
 
}
 
void build_muls(fourvarcode* t) ///乘  x86中乘法的被乘数在AX里  结果在AX中
{
    char a3[10],a1[10],a2[10],axorbx[5];
    strcpy(a1,t->addr1.name);
    strcpy(a2,t->addr2.name);
    strcpy(a3,t->addr3.name);
    if(a1[0]>='0'&&a1[0]<='9'){
        printf("MOV BX,%s\n",a1);
        fprintf(fp,"MOV BX,%s\n",a1);
    }
    if(a2[0]>='0'&&a2[0]<='9'){
        printf("MOV BX,%s\n",a2);
        fprintf(fp,"MOV BX,%s\n",a2);
    }
    if(CX_FLAG==1)//用cx寄存器
    {
        printf("MUL BX,CX\n");
        fprintf(fp,"MUL BX,CX\n");
        strcpy(axorbx,"BX");
    }
    else
    {
        printf("MUL BX\n");
        fprintf(fp,"MUL BX\n");
        AX_FLAG=1;
        strcpy(axorbx,"AX");
    }
    if(a3[1]!='#')//局部变量
    {
        int d = 0;
        //d=searchstack(t->addr3.name);
        if(d>-1&&d<0)
        {
            d=-(d+2);
            printf("MOV [BP+%d],%s\n",d,axorbx);
            printf("MOV BP,SP\n");
            fprintf(fp,"MOV [BP+%d],%s\n",d,axorbx);
            fprintf(fp,"MOV BP,SP\n");
        }
        else
        {
            if(stackn>=2)
                ;
            else
                printf("MOV [BP+%d],%s\n",d,axorbx);
                fprintf(fp,"MOV [BP+%d],%s\n",d,axorbx);
        }
 
        if(strcmp(axorbx,"AX")==0)
        {
            registerfree("AX");
            registerfree("BX");
        }
        else
        {
            registerfree("BX");
            registerfree("CX");
        }
    }
    else//结果仍然留在AX 中
    {
        if(strcmp(axorbx,"AX")==0)
        {
            registerfree("BX");
        }
        else
        {
            registerfree("CX");
        }
    }
}
 
void build_divs(fourvarcode* t)  ///除
{
    char a3[10],a1[10],a2[10],axorbx[5];
    strcpy(a1,t->addr1.name);
    strcpy(a2,t->addr2.name);
    strcpy(a3,t->addr3.name);
    if(a1[0]>='0'&&a1[0]<='9'){
        printf("MOV BX,%s\n",a1);
        fprintf(fp,"MOV BX,%s\n",a1);
    }
    if(a2[0]>='0'&&a2[0]<='9'){
        printf("MOV BX,%s\n",a2);
        fprintf(fp,"MOV BX,%s\n",a2);
    }
    if(CX_FLAG==1)//用到cx寄存器了
    {
        printf("DIV BX,CX\n");
        fprintf(fp,"DIV BX,CX\n");
        strcpy(axorbx,"BX");
    }
    else
    {
        printf("DIV BX\n");
        fprintf(fp,"DIV BX\n");
        strcpy(axorbx,"AX");
    }
    if(a3[1]!='#')
    {
        int d=searchlocal(t->addr3.name);
        if(d==-1)
        {
            printf("MOV [BP+%d],%s\n",d,axorbx);
            printf("MOV BP,SP\n");
            fprintf(fp,"MOV [BP+%d],%s\n",d,axorbx);
            fprintf(fp,"MOV BP,SP\n");
            
        }
        //当数在局部变量符号表里
        else
        {
            printf("MOV [BP+%d],%s\n",d*2,axorbx);
            fprintf(fp,"MOV [BP+%d],%s\n",d*2,axorbx);
        }
 
        if(strcmp(axorbx,"AX")==0)
        {
            registerfree("AX");
            registerfree("BX");
        }
        else
        {
            registerfree("BX");
            registerfree("CX");
        }
    }
    //结果仍然留在AX 中
    else
    {
        if(strcmp(axorbx,"AX")==0)registerfree("BX");
        else registerfree("CX");
    }
}
 
 
 
void build_adds(fourvarcode* t)
{
    char a2[10],a3[10],axorbx[5];
    strcpy(a2,t->addr2.name);
    strcpy(a3,t->addr3.name);
    if(strcmp(a2,"1")!=0)//不是自增运算
    {
        if(CX_FLAG==1)//用到cx寄存器了
        {
            printf("ADD BX,CX\n");
            fprintf(fp,"ADD BX,CX\n");
            strcpy(axorbx,"BX");
        }
        else
        {
            printf("ADD AX,BX\n");
            fprintf(fp,"ADD AX,BX\n");
            strcpy(axorbx,"AX");
        }
        if(a3[1]!='#')///结果赋值给局部变量
        {
            int d=searchlocal(t->addr3.name);
            if(d==-1)
            {;
                printf("MOV [BP+%d],%s\n",d,axorbx);
                printf("MOV BP,SP\n");
                fprintf(fp,"MOV [BP+%d],%s\n",d,axorbx);
                fprintf(fp,"MOV BP,SP\n");
            }
            ///当数在局部变量符号表里
            else
            {
 
                printf("MOV [BP+%d],%s\n",d*2,axorbx);
                fprintf(fp,"MOV [BP+%d],%s\n",d*2,axorbx);
            }
            if(strcmp(axorbx,"AX")==0)
            {
                registerfree("AX");
                registerfree("BX");
            }
            else
            {
                registerfree("BX");
                registerfree("CX");
            }
        }
        ///结果仍然留在AX 中
        else
        {
            if(strcmp(axorbx,"AX")==0)
            {
                registerfree("BX");
            }
            else
            {
                registerfree("CX");
            }
        }
    }
}
 
 
 
void build_minu(fourvarcode* t)
{
    char a2[10],a3[10],axorbx[5];
    strcpy(a2,t->addr2.name);
    strcpy(a3,t->addr3.name);
    if(strcmp(a2,"1")!=0)
    {
        if(CX_FLAG==1)///用到cx寄存器了
        {
            printf("SUB BX,CX\n");
            fprintf(fp,"SUB BX,CX\n");
            strcpy(axorbx,"BX");
        }
        else
        {
            printf("SUB AX,BX\n");
            fprintf(fp,"SUB AX,BX\n");
            strcpy(axorbx,"AX");
        }
        if(a3[1]!='#')
        {
            int d = 0;
            //d=searchstack(t->addr3.name);
            if(d>-1&&d<0)
            {
                d=-(d+2);
                printf("MOV [BP+%d],%s\n",d,axorbx);
                printf("MOV BP,SP\n");
                fprintf(fp,"MOV [BP+%d],%s\n",d,axorbx);
                fprintf(fp,"MOV BP,SP\n");
            }
            else
            {
                printf("MOV [BP+%d],%s\n",d,axorbx);
                fprintf(fp,"MOV [BP+%d],%s\n",d,axorbx);
            }
            if(strcmp(axorbx,"AX")==0)
            {
                registerfree("AX");
                registerfree("BX");
            }
            else
            {
                registerfree("BX");
                registerfree("CX");
            }
        }
        else
        {
            if(strcmp(axorbx,"AX")==0)registerfree("BX");
            else registerfree("CX");
        }
    }
 
}
 
void build_mainfuns(fourvarcode* t)
{
    return;
}
 
void build_mainfuns_end(fourvarcode* t)
{
    return;
}
void build_smas(fourvarcode* t)///<
{
    printf("CMP AX,BX\n");
    printf("JAE %s\n",t->next->addr2.name);///a>=b 则跳走 --所以这里用来处理小于  也能用JNB
    registerfree("BX");
    fprintf(fp,"CMP AX,BX\n");
    fprintf(fp,"JAE %s\n",t->next->addr2.name);
}
 
void build_smas_eqs(fourvarcode* t)///<=
{
    printf("CMP AX,BX\n");
    printf("JA %s\n",t->next->addr2.name);///a<b则跳走  否则继续执行
    registerfree("BX");
    fprintf(fp,"CMP AX,BX\n");
    fprintf(fp,"JA %s\n",t->next->addr2.name);
}
 
void  build_bigs(fourvarcode* t)
{
    printf("CMP AX,BX\n");
    printf("JBE %s\n",t->next->addr2.name); ///A<=B则跳走
    fprintf(fp,"CMP AX,BX\n");
    fprintf(fp,"JBE %s\n",t->next->addr2.name);
}
 
void build_big_equs(fourvarcode* t)
{
    printf("CMP AX,BX\n");
    printf("JB %s\n",t->next->addr2.name); ///A<B则跳走
    fprintf(fp,"CMP AX,BX\n");
    fprintf(fp,"JB %s\n",t->next->addr2.name);
}
void build_eqs_eqs(fourvarcode* t)
{
    printf("CMP AX,BX\n");
    printf("JNE %s\n",t->next->addr2.name);///A!=B则跳走
    fprintf(fp,"CMP AX,BX\n");
    fprintf(fp,"JNE %s\n",t->next->addr2.name);
}
 
void build_not_eqs(fourvarcode* t)
{
    printf("CMP AX,BX\n");
    printf("JE %s\n",t->next->addr2.name); ///相等就跳走
    fprintf(fp,"CMP AX,BX\n");
    fprintf(fp,"JE %s\n",t->next->addr2.name);
}



//  /////////////////////////////////////////////////////
//  //输出到文件
//  FILE* out_file_fp;

//  int   init_asm_file (char* fn)
// {
// 	out_file_fp = fopen (fn, "w");  
// 	if (out_file_fp == NULL){
// 		printf ("\n\nOutput file %s cannot be created.\n\n", fn);
// 		return 0;
// 	}
// 	return 1;
// }

// void  term_out_file (char * filename)
// {
// 	fprintf (out_file_fp, "End of Output.\n");
// 	printf ("Created %s ...\n", filename);
// 	fclose (out_file_fp); 
// }
