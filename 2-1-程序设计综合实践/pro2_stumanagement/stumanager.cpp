#include "stumanager.h"
#include "ui_stumanager.h"


StuManager::StuManager(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::StuManager)
{
    ui->setupUi(this);
}

StuManager::~StuManager()
{
    delete ui;
}


void StuManager::on_AddStu_clicked()
{
    AddStu *addstu = new AddStu();
    this->close();
    addstu->show();

}

void StuManager::on_EditStu_clicked()
{
    EditStu *editstu = new EditStu();
    this->close();
    editstu->show();
}
