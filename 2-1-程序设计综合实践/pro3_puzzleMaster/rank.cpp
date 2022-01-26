#include "rank.h"
#include<QtXml>
#include <QFileDialog>
#include <QMessageBox>
rank::rank(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::rank)
{
    ui->setupUi(this);
    ReadXml();
    ui->showeasy->verticalHeader()->setVisible(true);
    ui->showeasy->horizontalHeader()->setVisible(true);
    ui->showhard->verticalHeader()->setVisible(true);
    ui->showhard->horizontalHeader()->setVisible(true);
}

void rank::on_back3_clicked()
{
    this->close();
    welcome *w = new welcome;
    w->show();
}

void rank::ReadXml()
{
    ui->showeasy->setRowCount(0);
    ui->showeasy->clearContents();
    //打开或创建文件
    QFile file("easydata.xml"); //相对路径、绝对路径、资源路径都行
    if(!file.open(QFile::ReadOnly)) return;
    QDomDocument doc;
    if(!doc.setContent(&file)){file.close();return;}
    file.close();

    QDomElement games=doc.documentElement(); //返回根节点
    QDomNode game=games.firstChild(); //获得第一个子节点
    int i=0;
    while(!game.isNull())  //如果节点不空
    {
        if(game.isElement()) //如果节点是元素
        {
            QDomElement g=game.toElement(); //转换为元素，注意元素和节点是两个数据结构，其实差不多
            QDomNodeList gFactors=g.childNodes();//得到了stu的属性列表
            ui->showeasy->insertRow(i);
            ui->showeasy->setItem(i,0,new QTableWidgetItem(gFactors.at(0).toElement().text()));
            int temp = gFactors.at(1).toElement().text().toInt();
            ui->showeasy->setItem(i,1,new QTableWidgetItem(QString("%1").arg(temp, 3, 10, QChar(' '))));
            i++;
        }
        game=game.nextSibling(); //下一个兄弟节点
    }

    {
        //打开或创建文件
        QFile file1("harddata.xml"); //相对路径、绝对路径、资源路径都行
        if(!file1.open(QFile::ReadOnly)) return;
        QDomDocument doc1;
        if(!doc1.setContent(&file1)){file1.close();return;}
        file1.close();

        QDomElement games1=doc1.documentElement(); //返回根节点
        QDomNode game1=games1.firstChild(); //获得第一个子节点
        int i=0;
        while(!game1.isNull())  //如果节点不空
        {
            if(game1.isElement()) //如果节点是元素
            {
                QDomElement g1=game1.toElement(); //转换为元素，注意元素和节点是两个数据结构，其实差不多
                QDomNodeList g1Factors=g1.childNodes();//得到了stu的属性列表
                ui->showhard->insertRow(i);
                ui->showhard->setItem(i,0,new QTableWidgetItem(g1Factors.at(0).toElement().text()));
                int temp = g1Factors.at(1).toElement().text().toInt();
                ui->showhard->setItem(i,1,new QTableWidgetItem(QString("%1").arg(temp, 3, 10, QChar(' '))));
                i++;
            }
            game1=game1.nextSibling(); //下一个兄弟节点
        }
    }
}
