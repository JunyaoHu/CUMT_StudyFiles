#include "editstu.h"
#include "ui_editstu.h"
#include <QFileDialog>
#include <QMessageBox>
#include <QtXml>


EditStu::EditStu(QWidget *parent):
    QDialog(parent),
    ui(new Ui::EditStu)
{
    ui->setupUi(this);
    ui->showtable->verticalHeader()->setVisible(true);
    ui->showtable->horizontalHeader()->setVisible(true);
    ui->showtable->setColumnHidden(6,1);
}

EditStu::~EditStu()
{
    delete ui;
}

void EditStu::on_back_clicked()
{
    StuManager *main = new StuManager();
    this->close();
    main->show();
}

void EditStu::on_search_clicked()
{
    ReadXml();
    int row = ui->showtable->rowCount();
    for(int i = 0; i<row;i++) ui->showtable->item(i, 0)->setFlags(Qt::NoItemFlags);
}

void EditStu::ReadXml()
{
    ui->showtable->setRowCount(0);
    ui->showtable->clearContents();
    ui->showtable->setColumnHidden(6,1);
    QString s = ui->searchword->text();
    //打开或创建文件
    QFile file("database.xml"); //相对路径、绝对路径、资源路径都行
    if(!file.open(QFile::ReadOnly)) return;
    QDomDocument doc;
    if(!doc.setContent(&file)){file.close();return;}
    file.close();

    QDomElement students=doc.documentElement(); //返回根节点
    QDomNode student=students.firstChild(); //获得第一个子节点
    while(!student.isNull())  //如果节点不空
    {
        if(student.isElement()) //如果节点是元素
        {
            QDomElement stu=student.toElement(); //转换为元素，注意元素和节点是两个数据结构，其实差不多
            QDomNodeList stuFactors=stu.childNodes();//得到了stu的属性列表
            for (int index=0; index<stuFactors.count();index++)
            {
                QDomNode factor=stuFactors.at(index);//stuFactor
                int i=0;
                if(((factor.toElement().text().contains(s)||stu.attribute("学号").contains(s)))
                        && !(factor.toElement().nodeName()=="照片"))
                {
                    ui->showtable->insertRow(i);
                    ui->showtable->setItem(i,0,new QTableWidgetItem(stu.attribute("学号")));
                    for (int m=0; m<stuFactors.count(); m++)
                    ui->showtable->setItem(i,m+1,new QTableWidgetItem(stuFactors.at(m).toElement().text()));
                    i++;
                    break;
                }
            }
        }
        student=student.nextSibling(); //下一个兄弟节点
    }
}

void EditStu::on_showtable_cellClicked(int row, int column)
{
    QString filename(ui->showtable->item(row,6)->text());
            QImage* img=new QImage;
            if(! ( img->load(filename) ) ) //加载图像
            {delete img;return;}
            ui->showpic->setPixmap(QPixmap::fromImage(*img));
}

void EditStu::on_remove_clicked()
{
    if (ui->showtable->currentItem()!=nullptr)
    {
        QString s =  ui->showtable->item(ui->showtable->currentRow(),0)->text();
        QFile file("database.xml"); //相对路径、绝对路径、资源路径都可以
            if(!file.open(QFile::ReadOnly))return;
            //删除一个一级子节点及其元素，外层节点删除内层节点于此相同
            QDomDocument doc;
            if(!doc.setContent(&file))
            {file.close();return;}file.close();

            QDomElement root=doc.documentElement();
            QDomNodeList list=doc.elementsByTagName("学生"); //由标签名定位
            for(int i=0;i<list.count();i++)
            {
                QDomElement e=list.at(i).toElement();
                if(e.attribute("学号")==s)
                    root.removeChild(list.at(i));
            }

            if(!file.open(QFile::WriteOnly|QFile::Truncate))
                return;
            //输出到文件
            QTextStream out_stream(&file);
            doc.save(out_stream,4); //缩进4格
            file.close();
            on_search_clicked();
    }
}

void EditStu::on_update_clicked()
{
    QFile file("database.xml"); //相对路径、绝对路径、资源路径都行
    {
        QFile file("database.xml"); //相对路径、绝对路径、资源路径都可以
            if(!file.open(QFile::WriteOnly|QFile::Truncate)) //可以用QIODevice，Truncate表示清空原来的内容
                return;
            QDomDocument doc;
            //写入xml头部
            QDomProcessingInstruction instruction; //添加处理命令
            instruction=doc.createProcessingInstruction("xml","version=\"1.0\" encoding=\"UTF-8\"");
            doc.appendChild(instruction);
            //添加根节点
            QDomElement students=doc.createElement("总学生");
            doc.appendChild(students);
            //输出到文件
            QTextStream out_stream(&file);
            doc.save(out_stream,4); //缩进4格
            file.close();
    }


    for (int i=0; i<ui->showtable->rowCount(); i++)
            {
                QFile file("database.xml");
                if(!file.open(QFile::ReadOnly)) return;
                //增加一个一级子节点以及元素
                QDomDocument doc;
                if(!doc.setContent(&file)){file.close();return;}
                file.close();

                QDomElement students=doc.documentElement();
                QDomElement student=doc.createElement("学生");
                student.setAttribute("学号", ui->showtable->item(i,0)->text());
                //方式一：创建属性  其中键值对的值可以是各种类型，如果学号0开头必须加引号，否则认为是八进制数字

                QDomElement stuName=doc.createElement("姓名"); //创建子元素
                QDomText text; //设置括号标签中间的值
                text=doc.createTextNode(ui->showtable->item(i,1)->text());
                student.appendChild(stuName);
                stuName.appendChild(text);

                QDomElement grade=doc.createElement("年级"); //创建子元素
                text=doc.createTextNode(ui->showtable->item(i,2)->text());
                student.appendChild(grade);
                grade.appendChild(text);

                QDomElement part=doc.createElement("学院"); //创建子元素
                text=doc.createTextNode(ui->showtable->item(i,3)->text());
                student.appendChild(part);
                part.appendChild(text);

                QDomElement stuclass=doc.createElement("班级"); //创建子元素
                text=doc.createTextNode(ui->showtable->item(i,4)->text());
                student.appendChild(stuclass);
                stuclass.appendChild(text);

                QDomElement tel=doc.createElement("电话"); //创建子元素
                text=doc.createTextNode(ui->showtable->item(i,5)->text());
                student.appendChild(tel);
                tel.appendChild(text);

                QDomElement pic=doc.createElement("照片"); //创建子元素
                text=doc.createTextNode(ui->showtable->item(i,6)->text());
                student.appendChild(pic);
                pic.appendChild(text);

                students.appendChild(student);
                if(!file.open(QFile::WriteOnly))return; //先读进来
                QTextStream out_stream(&file);
                doc.save(out_stream,4); //缩进4格
                file.close();
        }
    QString dlgTitle="更新成功";
    QString strInfo="学生信息更新成功！";
    QMessageBox::information(this, dlgTitle, strInfo,
                             QMessageBox::Ok,QMessageBox::NoButton);
}
