#include "bmi.h"
#include "ui_bmi.h"
double wei, hei;

BMI::BMI(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::BMI)
{
    ui->setupUi(this);
}

BMI::~BMI()
{
    delete ui;
}


void BMI::on_weight_textChanged()
{
    wei = this->ui->weight->text().toFloat();
}

void BMI::on_height_textChanged()
{

    hei = this->ui->height->text().toFloat();
}

void BMI::calculate(double &w, double &h)
{
    if (w<=0 && h <=0)
    {
        this->tmp = "ERROR";
        this->ui->BMIresult->setText(this->tmp);
        this->ui->advice->setText("input legal data!");
    }
    else
    {
        this->tmp = tmp.number(w/h/h*10000,'f',2);
        this->ui->BMIresult->setText(this->tmp);
        if (w/h/h*10000<=18.4)
        {
            this->ui->advice->setText("Eat more!");
        }
        else if (w/h/h*10000>18.4 && w/h/h*10000<=23.9 )
        {
            this->ui->advice->setText("Keep it!");
        }
        else if (w/h/h*10000>23.9 && w/h/h*10000<=27.9 )
        {
            this->ui->advice->setText("Eat less!");
        }
        else
        {
            this->ui->advice->setText("Lose weight now!");
        }
    }
}


void BMI::on_calculate_clicked()
{
    on_weight_textChanged();
    on_height_textChanged();
    calculate(wei,hei);
}
