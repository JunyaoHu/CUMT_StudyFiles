#ifndef WELCOME_H
#define WELCOME_H
#include <easy.h>
#include <hard.h>
#include <rank.h>
#include <QMainWindow>

QT_BEGIN_NAMESPACE
namespace Ui { class welcome; }
QT_END_NAMESPACE

class welcome : public QMainWindow
{
    Q_OBJECT

public:
    welcome(QWidget *parent = nullptr);
    ~welcome();

private slots:
    void on_Easy_clicked();
    void on_Hard_clicked();
    void on_Rank_clicked();

private:
    Ui::welcome *ui;
};
#endif // WELCOME_H
