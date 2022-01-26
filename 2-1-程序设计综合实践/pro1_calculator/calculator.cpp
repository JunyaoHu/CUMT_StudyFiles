#include "calculator.h"
#include "ui_calculator.h"
#include <iostream>
#include <stack>
#include <string>
using namespace std;

calculator::calculator(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::calculator)
{
    ui->setupUi(this);
    this->tmp = "";
}

calculator::~calculator()
{
    delete ui;
}


void calculator::on_num0_clicked()
{
    if(this->tmp != "")
    {
        this->tmp += this->ui->num0->text();
        this->ui->resultbox->setText(this->tmp);
    }
}
void calculator::on_num1_clicked()
{
    this->tmp += this->ui->num1->text();
    this->ui->resultbox->setText(this->tmp);
}
void calculator::on_num2_clicked()
{
    this->tmp += this->ui->num2->text();
    this->ui->resultbox->setText(this->tmp);
}
void calculator::on_num3_clicked()
{
    this->tmp += this->ui->num3->text();
    this->ui->resultbox->setText(this->tmp);
}
void calculator::on_num4_clicked()
{
    this->tmp += this->ui->num4->text();
    this->ui->resultbox->setText(this->tmp);
}
void calculator::on_num5_clicked()
{
    this->tmp += this->ui->num5->text();
    this->ui->resultbox->setText(this->tmp);
}
void calculator::on_num6_clicked()
{
    this->tmp += this->ui->num6->text();
    this->ui->resultbox->setText(this->tmp);
}
void calculator::on_num7_clicked()
{
    this->tmp += this->ui->num7->text();
    this->ui->resultbox->setText(this->tmp);
}
void calculator::on_num8_clicked()
{
    this->tmp += this->ui->num8->text();
    this->ui->resultbox->setText(this->tmp);
}
void calculator::on_num9_clicked()
{
    this->tmp += this->ui->num9->text();
    this->ui->resultbox->setText(this->tmp);
}
void calculator::on_op_add_clicked()
{
    if(tmp.endsWith("-") || tmp.endsWith("*") || tmp.endsWith("/"))
    {
        this->tmp = this->tmp.replace(tmp.length()-1,1,"+");
        this->ui->resultbox->setText(this->tmp);
    }
    else if(tmp != "" && !tmp.endsWith("+"))
    {
        this->tmp += this->ui->op_add->text();
        this->ui->resultbox->setText(this->tmp);
    }

}
void calculator::on_op_sub_clicked()
{
    if(tmp.endsWith("+") || tmp.endsWith("*") || tmp.endsWith("/"))
    {
        this->tmp = this->tmp.replace(tmp.length()-1,1,"-");
        this->ui->resultbox->setText(this->tmp);
    }
    else if(tmp != "" && !tmp.endsWith("-"))
    {
        this->tmp += this->ui->op_sub->text();
        this->ui->resultbox->setText(this->tmp);
    }
}
void calculator::on_op_mul_clicked()
{
    if(tmp.endsWith("+") || tmp.endsWith("-") || tmp.endsWith("/"))
    {
        this->tmp = this->tmp.replace(tmp.length()-1,1,"*");
        this->ui->resultbox->setText(this->tmp);
    }
    else if(tmp != "" && !tmp.endsWith("*"))
    {
        this->tmp += this->ui->op_mul->text();
        this->ui->resultbox->setText(this->tmp);
    }
}
void calculator::on_op_dvd_clicked()
{
    if(tmp.endsWith("+") || tmp.endsWith("-") || tmp.endsWith("*"))
    {
        this->tmp = this->tmp.replace(tmp.length()-1,1,"/");
        this->ui->resultbox->setText(this->tmp);
    }
    else if(tmp != "" && !tmp.endsWith("/"))
    {
        this->tmp += this->ui->op_dvd->text();
        this->ui->resultbox->setText(this->tmp);
    }
}

void calculator::on_op_eqa_clicked()
{
    if(tmp != "")
    {
         calculator::calculate(tmp);
         this->ui->resultbox->setText(this->tmp);
         this->tmp = "";
    }
}

void calculator::on_op_pnt_clicked()
{
    if(tmp != " " && tmp != "" && !tmp.endsWith("."))
    {
        this->tmp += this->ui->op_pnt->text();
        this->ui->resultbox->setText(this->tmp);
    }
}
void calculator::on_op_lf_clicked()
{
    if(tmp != " ")
    {
        this->tmp += this->ui->op_lf->text();
        this->ui->resultbox->setText(this->tmp);
    }
}
void calculator::on_op_rt_clicked()
{
    if(tmp != " ")
    {
        this->tmp += this->ui->op_rt->text();
        this->ui->resultbox->setText(this->tmp);
    }
}
void calculator::on_op_del_clicked()
{
    if(tmp != " ")
    {
        tmp = tmp.left(tmp.length()-1);
        this->ui->resultbox->setText(this->tmp);
    }
}

void calculator::on_op_AC_clicked()
{
    tmp.clear();
    this->ui->resultbox->setText(0);
    this->tmp = "";
}


int calculator::priority(int state,char a)
{//计算操作符优先级的函数，注意state表示运算符状态：
//这个state只对‘（’起作用
    int result=0;
    switch (a){
    case '+':
    case '-':
        result = 1;
        break;
    case '*':
    case '/':
        result = 2;
        break;
    case '(':
        if (state == 0)
            result = 3;//（括号在栈里，等级高
        else
            result = 0;
        break;
    case '#':
        result = 0; //类似头结点和基准的作用
        break;
    default:
        break;
    }
    return result;
}
double calculator::calculate(char op, double op1, double op2)
{
    double result=0;
    switch (op){
    case '+':
        result = op1 + op2;
        break;
    case '-':
        result = op1 - op2;
        break;
    case '*':
        result = op1 * op2;
        break;
    case '/':
        result = op1 / op2;
        break;
    default:
        break;
    }
    return result;
}

void calculator::calculate(QString &tmp)
{
    string s;
    s = tmp.toStdString();
    stack<char> operation;//存放操作符的栈
    stack<double> operand;//存放操作数的栈
    operation.push('#');//先将‘#’压栈
    string num;//临时存放一个操作数，确保多位数和有小数点的数为一体
    for (int i = 0; i < int(s.length()) ; i++){
        if (isdigit(s[i])){//出现数字
            while (isdigit(s[i]) || s[i] == '.'){//将操作数提取完全
                num.push_back(s[i]);
                i++;
            }
            double a = atof(num.c_str());//string->double
            cout<<"in num: "<<a<<endl;
            operand.push(a);//操作数入栈
            num.clear();//num临时变量清空以备下次使用
            i--;//位置还原
        }
        else if (s[i] == '+' || s[i] == '-' || s[i] == '*' || s[i] == '/' || s[i] == '('){//出现运算符
            if (priority(0, s[i])>priority(1, operation.top()))
                //优先级比较，计算操作符优先级的函数，注意state表示运算符状态：state=1表示还未进栈，state=0表示栈内优先级，注意
            {
                cout<<"in op: "<<s[i]<<endl;
                operation.push(s[i]);}
                //当当前的符号放在栈内，比前一个符号等级高时，直接入栈，比如+比#等级高，*比+等级高，（比*等级高
            else{
                while (priority(0, s[i]) <= priority(1, operation.top()))
                {
                    //当当前的符号放在栈内，比前一个符号等级（对于（括号是在栈外的等级）低时，出栈并进行计算直至>
                    char temp = operation.top();
                    cout<<"out op: "<<temp<<endl;
                    operation.pop();
                    double op2 = operand.top();
                    cout<<"out op2: "<<op2<<endl;
                    operand.pop();
                    double op1 = operand.top();
                    cout<<"out op1: "<<op1<<endl;
                    operand.pop();
                    operand.push(calculate(temp, op1, op2));
                    cout<<"in result: "<<operand.top()<<endl;
                }
                operation.push(s[i]);//不要忘了最后操作符入栈！！！！！特别是在左括号时特别重要
                cout<<"in op: "<<s[i]<<endl;
            }
        }
        else if (s[i] == ')'){//扫描到‘）’
            while (operation.top() != '('){//出栈直至‘（’
                char temp = operation.top();
                cout<<"out op: "<<temp<<endl;
                operation.pop();
                double op2 = operand.top();
                cout<<"out op2: "<<op2<<endl;
                operand.pop();
                double op1 = operand.top();
                cout<<"out op1: "<<op1<<endl;
                operand.pop();
                operand.push(calculate(temp, op1, op2));
                cout<<"in result: "<<operand.top()<<endl;
            }
            operation.pop();//‘（’出栈
            cout<<"out op: "<<s[i]<<endl;
        }
        else{//非法字符的处理比如字母
            this->tmp = "error!";
            this->ui->resultbox->setText(this->tmp);
            break;
        }
    }
    while (operation.top() != '#'){//扫尾工作
        char temp = operation.top();
        cout<<"out op: "<<temp<<endl;
        operation.pop();
        double op2 = operand.top();
        cout<<"out op2: "<<op2<<endl;
        operand.pop();
        double op1 = operand.top();
        cout<<"out op1: "<<op1<<endl;
        operand.pop();
        operand.push(calculate(temp, op1, op2));
        cout<<"in result: "<<operand.top()<<endl;
    }
    this->tmp = QString("=");
    this->tmp += tmp.number(operand.top());
    this->ui->resultbox->setText(this->tmp);
}
