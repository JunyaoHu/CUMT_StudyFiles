#include "welcome.h"
#include "ui_welcome.h"

welcome::welcome(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::welcome)
{
    ui->setupUi(this);
}

welcome::~welcome()
{
    delete ui;
}


void welcome::on_Easy_clicked()
{
    this->close();
    easy *e = new easy();
    e->show();
}

void welcome::on_Hard_clicked()
{
    this->close();
    hard *h = new hard();
    h->show();
}

void welcome::on_Rank_clicked()
{
    this->close();
    rank *r = new rank();
    r->show();
}
