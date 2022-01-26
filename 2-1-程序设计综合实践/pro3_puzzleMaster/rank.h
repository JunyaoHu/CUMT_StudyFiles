#ifndef RANK_H
#define RANK_H

#include "ui_rank.h"
#include "welcome.h"
#include <qtablewidget.h>
#include <QDialog>
#include <QFile>
#include <QString>
namespace Ui {
class rank;
}

class rank : public QDialog
{
    Q_OBJECT

public:
    explicit rank(QWidget *parent = nullptr);
    void ReadXml();
private slots:
    void on_back3_clicked();
private:
    Ui::rank *ui;
};

#endif // RANK_H
