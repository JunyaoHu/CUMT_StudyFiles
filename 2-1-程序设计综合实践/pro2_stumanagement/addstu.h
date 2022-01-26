#ifndef ADDSTU_H
#define ADDSTU_H
#include <stumanager.h>
#include <QDialog>

namespace Ui {
class AddStu;
}

class AddStu : public QDialog
{
    Q_OBJECT

public:
    explicit AddStu(QWidget *parent = nullptr);
    ~AddStu();


private slots:
    void on_back_clicked();
    void on_PartBox_activated(QString s);
    void on_picture_clicked();
    void on_yes_clicked();

private:
    Ui::AddStu *ui;

private:
    void OpenImg();
    QString OpenFile = "";
    bool flag=1;

};

#endif // ADDSTU_H
