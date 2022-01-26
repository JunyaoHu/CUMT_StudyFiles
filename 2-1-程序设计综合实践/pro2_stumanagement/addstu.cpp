#include "addstu.h"
#include "ui_addstu.h"
#include <QFileDialog>
#include <QMessageBox>
#include <QtXml>

AddStu::AddStu(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::AddStu)
{
    ui->setupUi(this);
}

AddStu::~AddStu()
{
    delete ui;
}

void AddStu::on_back_clicked()
{
    StuManager *main = new StuManager();
    this->close();
    main->show();
}

void AddStu::on_yes_clicked()
{
    QFile file("database.xml"); //相对路径、绝对路径、资源路径都行
    if(!file.open(QFile::ReadOnly))
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

    if   ( ui->NumText->text()=="" ||
           ui->NameText->text()=="" ||
           ui->GradeBox->currentText()=="请选择年级" ||
           ui->PartBox->currentText()=="请选择学院" ||
           ui->ClassBox->currentText()=="请先选择学院" ||
           ui->TelText->text()=="" ||
           OpenFile=="")
    {
            QString dlgTitle="输入不完整";
            QString strInfo="请确认学生信息输入完整";
            QMessageBox::warning(this, dlgTitle, strInfo);
            flag= false;
    }


        QFile file1("database.xml"); //相对路径、绝对路径、资源路径都行
        if(!file1.open(QFile::ReadOnly))
            return;

        QDomDocument doc;
        if(!doc.setContent(&file1))
        {
            file.close();
            return;
        }
        file1.close();
        QDomElement students=doc.documentElement();
        QDomElement student= students.firstChildElement();
        while(!student.isNull())
        {
            qDebug()<<student.attribute("学号");
            qDebug()<<ui->NumText->text();

            if (student.attribute("学号")==ui->NumText->text())
            {
                QString dlgTitle="学号重复";
                QString strInfo="请重新确认学号是否有误";
                QMessageBox::warning(this, dlgTitle, strInfo);
                flag= false;
                break;
            }
        student = student.nextSiblingElement();
        }



    if (flag)
    {
        QFile file("database.xml");
        if(!file.open(QFile::ReadOnly)) return;
        //增加一个一级子节点以及元素
        QDomDocument doc;
        if(!doc.setContent(&file)){file.close();return;}
        file.close();

        QDomElement students=doc.documentElement();
        QDomElement student=doc.createElement("学生");
        student.setAttribute("学号", ui->NumText->text());
        //方式一：创建属性  其中键值对的值可以是各种类型，如果学号0开头必须加引号，否则认为是八进制数字

        QDomElement stuName=doc.createElement("姓名"); //创建子元素
        QDomText text; //设置括号标签中间的值
        text=doc.createTextNode(ui->NameText->text());
        student.appendChild(stuName);
        stuName.appendChild(text);

        QDomElement grade=doc.createElement("年级"); //创建子元素
        text=doc.createTextNode(ui->GradeBox->currentText());
        student.appendChild(grade);
        grade.appendChild(text);

        QDomElement part=doc.createElement("学院"); //创建子元素
        text=doc.createTextNode(ui->PartBox->currentText());
        student.appendChild(part);
        part.appendChild(text);

        QDomElement stuclass=doc.createElement("班级"); //创建子元素
        text=doc.createTextNode(ui->ClassBox->currentText());
        student.appendChild(stuclass);
        stuclass.appendChild(text);

        QDomElement tel=doc.createElement("电话"); //创建子元素
        text=doc.createTextNode(ui->TelText->text());
        student.appendChild(tel);
        tel.appendChild(text);

        QDomElement pic=doc.createElement("照片"); //创建子元素
        text=doc.createTextNode(OpenFile);
        student.appendChild(pic);
        pic.appendChild(text);

        students.appendChild(student);
        if(!file.open(QFile::WriteOnly))return; //先读进来
        QTextStream out_stream(&file);
        doc.save(out_stream,4); //缩进4格
        file.close();

        QString dlgTitle="新建成功";
        QString strInfo="学生新建成功！";
        QMessageBox::information(this, dlgTitle, strInfo,
                                 QMessageBox::Ok,QMessageBox::NoButton);
        ui->NumText->clear();
        ui->NameText->clear();
        ui->GradeBox->setCurrentIndex(0);
        ui->PartBox->setCurrentIndex(0);
        ui->ClassBox->clear();ui->ClassBox->addItem("请先选择学院",0);
        ui->TelText->clear();
        ui->showpic->clear();ui->showpic->setText("未上传照片");
    }
    flag=1;
}



void AddStu::on_picture_clicked()
{
    OpenImg();
}

void AddStu::OpenImg()
{
    QImage image;
    //打开文件夹中的图片文件
    OpenFile = QFileDialog::getOpenFileName(this,
                                              "请选择照片",
                                              "",
                                              "Image Files(*.jpg *.png *.bmp *.pgm *.pbm);;All(*.*)");
    if( OpenFile != "" )
    {
        if( image.load(OpenFile) )
        {
            ui->showpic->setPixmap(QPixmap::fromImage(image));
        }
    }
}

void AddStu::on_PartBox_activated(QString s)
{
    if (s==QString("请选择学院") ) {ui->ClassBox->clear();ui->ClassBox->addItem("请先选择学院",0);}
    if (s==QString("计算机学院") )
    {
        ui->ClassBox->clear();
        ui->ClassBox->addItem("计科1班",11);
        ui->ClassBox->addItem("计科2班",12);
        ui->ClassBox->addItem("计科3班",13);
        ui->ClassBox->addItem("计科4班",14);
        ui->ClassBox->addItem("信安1班",21);
        ui->ClassBox->addItem("信安2班",12);
    }
    if (s==QString("化工学院"))
    {
        ui->ClassBox->clear();
        ui->ClassBox->addItem("化工1班",11);
        ui->ClassBox->addItem("化工2班",12);
        ui->ClassBox->addItem("化工3班",13);
        ui->ClassBox->addItem("应化1班",21);
        ui->ClassBox->addItem("应化2班",22);
        ui->ClassBox->addItem("生工1班",31);
    }
}


