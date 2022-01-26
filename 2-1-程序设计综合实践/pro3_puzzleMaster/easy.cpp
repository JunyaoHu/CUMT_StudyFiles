#include<QtGui>
#include<cstdlib>
#include "easy.h"
#include<QFileDialog>
#include<time.h>
#include<QDebug>
#include<QMessageBox>
#include<QMediaPlaylist>
#include<QMediaPlayer>
#include<QtXml>

easy::easy(QWidget *parent):
    QDialog(parent),
    ui(new Ui::easy)
{
    ui->setupUi(this);
    {
        playlist->addMedia(QUrl("qrc:/main.mp3"));
        playlist->setPlaybackMode(QMediaPlaylist::Loop);
        music->setPlaylist(playlist);
        music->play();
    }
    {
        ui->showstep->setText("0");
        ui->showtime->setText("00:00.0");
        this->pTimer = new QTimer;
        //绑定定时器的信号
        connect(this->pTimer,SIGNAL(timeout()),this,SLOT(updateDisplay()));
    }




    for (int i = 0; i < 3; ++i)
        for (int j = 0; j < 3; ++j)
            map[i][j] = 3 * i + j;
    selected.x = -1;
    selected.y = -1;
    random();
    showp();
    connect(this,SIGNAL(success()),this,SLOT(succeed()));
}

void easy::random()
{
    int temp = -1;
    int randData1 = -1;
    int randData2 = -1;
    srand(time(NULL));
    for (int i=0; i<9; ++i)
    {
        randData1 = rand() % 9;
        randData2 = rand() % 9;
        temp = map[randData1/3][randData1%3];
        map[randData1/3][randData1%3] = map[randData2/3][randData2%3];
        map[randData2/3][randData2%3] = temp;
    }
    for (int i = 0; i < 3; ++i)
        for (int j = 0; j < 3; ++j)
            qDebug()<<map[i][j];
}

void easy::showp()
{
    ui->p1->setPixmap(QPixmap::fromImage(list[map[0][0]]));
    ui->p2->setPixmap(QPixmap::fromImage(list[map[0][1]]));
    ui->p3->setPixmap(QPixmap::fromImage(list[map[0][2]]));
    ui->p4->setPixmap(QPixmap::fromImage(list[map[1][0]]));
    ui->p5->setPixmap(QPixmap::fromImage(list[map[1][1]]));
    ui->p6->setPixmap(QPixmap::fromImage(list[map[1][2]]));
    ui->p7->setPixmap(QPixmap::fromImage(list[map[2][0]]));
    ui->p8->setPixmap(QPixmap::fromImage(list[map[2][1]]));
    ui->p9->setPixmap(QPixmap::fromImage(list[map[2][2]]));

    // 选中的图像块突出显示
    if (selected.x != -1 && selected.y != -1)
    {
        int num= selected.x + selected.y * 3;
        switch (num)
        {
            case 0: ui->p1->setMargin(3);break;
            case 1: ui->p2->setMargin(3);break;
            case 2: ui->p3->setMargin(3);break;
            case 3: ui->p4->setMargin(3);break;
            case 4: ui->p5->setMargin(3);break;
            case 5: ui->p6->setMargin(3);break;
            case 6: ui->p7->setMargin(3);break;
            case 7: ui->p8->setMargin(3);break;
            case 8: ui->p9->setMargin(3);break;
        }
    }
}

void easy::mousePressEvent(QMouseEvent *event)
{
    int x = event->pos().x();
    int y = event->pos().y();
    if(20 < x && x < 401 && 20 < y && y < 401 && !end) // 127*3+20=401
    {
        int indX = (x - 20) / 127;
        int indY = (y - 20) / 127;
        if(-1 < selected.x && selected.x < 3 && -1 < selected.y && selected.y < 3)
        {
            if ((indX == selected.x && -2 < indY - selected.y && indY - selected.y < 2) ||
                (-2 < indX - selected.x && indX - selected.x < 2 && indY == selected.y))
            {
                // 可以交换就交换

                int temp = map[indY][indX];
                map[indY][indX] = map[selected.y][selected.x];
                map[selected.y][selected.x] = temp;
                int num= selected.x + selected.y * 3;
                switch (num)
                {
                    case 0: ui->p1->setMargin(0);break;
                    case 1: ui->p2->setMargin(0);break;
                    case 2: ui->p3->setMargin(0);break;
                    case 3: ui->p4->setMargin(0);break;
                    case 4: ui->p5->setMargin(0);break;
                    case 5: ui->p6->setMargin(0);break;
                    case 6: ui->p7->setMargin(0);break;
                    case 7: ui->p8->setMargin(0);break;
                    case 8: ui->p9->setMargin(0);break;
                }
                count++;
                ui->showstep->setText(QString::number(count));
                selected.x = -1;
                selected.y = -1;
            }
            else
            {
                int num= selected.x + selected.y * 3;
                switch (num)
                {
                    case 0: ui->p1->setMargin(0);break;
                    case 1: ui->p2->setMargin(0);break;
                    case 2: ui->p3->setMargin(0);break;
                    case 3: ui->p4->setMargin(0);break;
                    case 4: ui->p5->setMargin(0);break;
                    case 5: ui->p6->setMargin(0);break;
                    case 6: ui->p7->setMargin(0);break;
                    case 7: ui->p8->setMargin(0);break;
                    case 8: ui->p9->setMargin(0);break;
                }
                selected.x = indX;
                selected.y = indY;

            }
        }
        else
        {
            int num= selected.x + selected.y * 3;
            switch (num)
            {
                case 0: ui->p1->setMargin(0);break;
                case 1: ui->p2->setMargin(0);break;
                case 2: ui->p3->setMargin(0);break;
                case 3: ui->p4->setMargin(0);break;
                case 4: ui->p5->setMargin(0);break;
                case 5: ui->p6->setMargin(0);break;
                case 6: ui->p7->setMargin(0);break;
                case 7: ui->p8->setMargin(0);break;
                case 8: ui->p9->setMargin(0);break;
            }
            selected.x = indX;
            selected.y = indY;
        }
    }
    else
    {
        int num= selected.x + selected.y * 3;
        switch (num)
        {
            case 0: ui->p1->setMargin(0);break;
            case 1: ui->p2->setMargin(0);break;
            case 2: ui->p3->setMargin(0);break;
            case 3: ui->p4->setMargin(0);break;
            case 4: ui->p5->setMargin(0);break;
            case 5: ui->p6->setMargin(0);break;
            case 6: ui->p7->setMargin(0);break;
            case 7: ui->p8->setMargin(0);break;
            case 8: ui->p9->setMargin(0);break;
        }
        selected.x = -1;
        selected.y = -1;
    }
    showp();

    // 判断是否成功，成功的话就弹出提示成功了
    int i = 0;
    for (; i < 9; ++i)
        if (map[i/3][i%3] == i);
        else break;
    if(i == 9 && !end)
    {
        pTimer->stop();
        end=1;
        emit success();
    }
}

void easy::on_vol_clicked()
{
    music->setVolume(0);
    ui->volslider->setValue(0);
}

void easy::on_volslider_valueChanged(int value)
{
    music->setVolume(value);
    ui->volslider->setValue(value);
}

void easy::on_back1_clicked()
{
    this->close();
    welcome *w = new welcome;
    w->show();
    music->pause();
}

void easy::on_showpic_pressed(){ui->yuantu->setPixmap(QPixmap::fromImage(image));}

void easy::on_showpic_clicked(){ui->yuantu->clear();}

void easy::on_setpic_clicked()
{
    OpenFile = QFileDialog::getOpenFileName(this,
                                            "请选择照片",
                                            "C://Qt//pro3_puzzleMaster",
                                            "Image Files(*.jpg *.png *.bmp *.pgm *.pbm);;All(*.*)");
    if(OpenFile.isEmpty()){return;}
    else image.load(OpenFile);
    h = image.height();
    w = image.width();
    list[0]  = i1  = image.copy(0*w/3, 0*h/3, w/3, h/3);
    list[1]  = i2  = image.copy(1*w/3, 0*h/3, w/3, h/3);
    list[2]  = i3  = image.copy(2*w/3, 0*h/3, w/3, h/3);

    list[3]  = i4  = image.copy(0*w/3, 1*h/3, w/3, h/3);
    list[4]  = i5  = image.copy(1*w/3, 1*h/3, w/3, h/3);
    list[5]  = i6  = image.copy(2*w/3, 1*h/3, w/3, h/3);

    list[6]  = i7  = image.copy(0*w/3, 2*h/3, w/3, h/3);
    list[7]  = i8  = image.copy(1*w/3, 2*h/3, w/3, h/3);
    list[8]  = i9  = image.copy(2*w/3, 2*h/3, w/3, h/3);


    showp();
    if (!end)
    {
        baseTime = this->baseTime.currentTime();
        pTimer->start(1);
    }
}

void easy::on_restart_clicked()
{
    this->close();
    easy *e = new easy;
    e->show();
    music->pause();
}

void easy::succeed()
{
    QString dlgTitle="游戏成功";
    QString strInfo="NB! U r forever god!";
    QMessageBox::information(this, dlgTitle, strInfo,
                             QMessageBox::Ok,QMessageBox::NoButton);

    QFile file("easydata.xml"); //相对路径、绝对路径、资源路径都行
    if(!file.open(QFile::ReadOnly))
    {
        QFile file("easydata.xml"); //相对路径、绝对路径、资源路径都可以
            if(!file.open(QFile::WriteOnly|QFile::Truncate)) //可以用QIODevice，Truncate表示清空原来的内容
                return;
            QDomDocument doc;
            //写入xml头部
            QDomProcessingInstruction instruction; //添加处理命令
            instruction=doc.createProcessingInstruction("xml","version=\"1.0\" encoding=\"UTF-8\"");
            doc.appendChild(instruction);
            //添加根节点
            QDomElement games=doc.createElement("games");
            doc.appendChild(games);
            //输出到文件
            QTextStream out_stream(&file);
            doc.save(out_stream,4); //缩进4格
            file.close();
    }

    QFile file1("easydata.xml");
    if(!file1.open(QFile::ReadOnly)) return;
    //增加一个一级子节点以及元素
    QDomDocument doc;
    if(!doc.setContent(&file)){file1.close();return;}
    file1.close();

    QDomElement games=doc.documentElement();
    QDomElement game=doc.createElement("game");

    QDomElement time=doc.createElement("time"); //创建子元素
    QDomText text;
    text=doc.createTextNode(timeStr);
    game.appendChild(time);
    time.appendChild(text);

    QDomElement step=doc.createElement("step"); //创建子元素
    text=doc.createTextNode(QString::number(count));
    game.appendChild(step);
    step.appendChild(text);



    games.appendChild(game);
    if(!file1.open(QFile::WriteOnly))return; //先读进来
    QTextStream out_stream(&file1);
    doc.save(out_stream,4); //缩进4格
    file1.close();



}


void easy::updateDisplay()
{
    QTime currTime = QTime::currentTime();
    int t = this->baseTime.msecsTo(currTime);
    QTime showTime(0,0,0);
    showTime = showTime.addMSecs(t);
    timeStr = showTime.toString("mm:ss.z");
    ui->showtime->setText(timeStr);
}
