#ifndef HARD_H
#define HARD_H
#include <QDialog>
#include "ui_hard.h"
#include "welcome.h"
#include<QMediaPlayer>
#include<QMediaPlaylist>
#include<QTimer>
#include<QTime>
struct pair1
{
    int x;
    int y;
};

class hard : public QDialog
{
    Q_OBJECT

public:
    explicit hard(QWidget *parent = nullptr);


private:
    void random();
    int map[4][4];
    double h=0;
    double w=0;
    struct pair1 selected;
    QString OpenFile = "";
    Ui::hard *ui;
    QImage image,i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16;
    QImage list[16];
    QMediaPlaylist *playlist = new QMediaPlaylist();
    QMediaPlayer *music = new QMediaPlayer();
    int count = 40;
    int t = 0;
    bool end = 0;
    QTimer *pTimer;
    QTime baseTime;
    QString timeStr;



signals:
    void success();

private slots:
    void succeed();
    void on_back1_clicked();
    void on_showpic_pressed();
    void on_showpic_clicked();
    void on_setpic_clicked();
    void on_restart_clicked();
    void showp();
    void mousePressEvent(QMouseEvent *event);
    void on_vol_clicked();
    void on_volslider_valueChanged(int value);
    void updateDisplay();


};


#endif // HARD_H
