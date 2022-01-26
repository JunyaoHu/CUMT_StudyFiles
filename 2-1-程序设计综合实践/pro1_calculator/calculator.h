#ifndef CALCULATOR_H
#define CALCULATOR_H

#include <QMainWindow>
#include <QDialog>

QT_BEGIN_NAMESPACE
namespace Ui { class calculator; }
QT_END_NAMESPACE

class calculator : public QMainWindow
{
    Q_OBJECT

public:
    calculator(QWidget *parent = nullptr);
    ~calculator();

private slots:
    void on_num0_clicked();
    void on_num1_clicked();
    void on_num2_clicked();
    void on_num3_clicked();
    void on_num4_clicked();
    void on_num5_clicked();
    void on_num6_clicked();
    void on_num7_clicked();
    void on_num8_clicked();
    void on_num9_clicked();

    void on_op_add_clicked();
    void on_op_sub_clicked();
    void on_op_mul_clicked();
    void on_op_dvd_clicked();
    void on_op_eqa_clicked();
    void on_op_AC_clicked();

    void on_op_pnt_clicked();
    void on_op_lf_clicked();
    void on_op_rt_clicked();
    void on_op_del_clicked();

    int priority(int state,char a);
    double calculate(char op, double op1, double op2);
    void calculate(QString &tmp);


private:
    QString tmp="";
    Ui::calculator *ui;// 界面对象和核心功能对象
};
#endif // CALCULATOR_H
