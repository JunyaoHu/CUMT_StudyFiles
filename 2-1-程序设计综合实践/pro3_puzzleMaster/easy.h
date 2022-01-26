#ifndef EASY_H
#define EASY_H
#include <QDialog>
#include "ui_easy.h"
#include "welcome.h"
#include<QMediaPlayer>
#include<QMediaPlaylist>
#include<QTimer>
#include<QTime>
struct pair
{
    int x;
    int y;
};

class easy : public QDialog
{
    Q_OBJECT

public:
    explicit easy(QWidget *parent = nullptr);


private:
    void random();
    int map[3][3];
    double h=0;
    double w=0;
    struct pair selected;
    QString OpenFile = "";
    Ui::easy *ui;
    QImage image,i1,i2,i3,i4,i5,i6,i7,i8,i9;
    QImage list[9];
    QMediaPlaylist *playlist = new QMediaPlaylist();
    QMediaPlayer *music = new QMediaPlayer();
    int count = 0;
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


#endif // EASY_H
