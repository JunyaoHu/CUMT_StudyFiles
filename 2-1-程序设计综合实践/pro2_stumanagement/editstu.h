#ifndef EDITSTU_H
#define EDITSTU_H
#include <stumanager.h>
#include <QDialog>
#include <QFile>
#include <QList>
#include <QString>
#include <qtablewidget.h>

namespace Ui {
class EditStu;
}

class EditStu : public QDialog
{
    Q_OBJECT

public:
    explicit EditStu(QWidget *parent = nullptr);
    ~EditStu();
    void ReadXml();

private slots:
    void on_back_clicked();
    void on_search_clicked();
    void on_showtable_cellClicked(int row, int column);
    void on_remove_clicked();

    void on_update_clicked();

public:
    Ui::EditStu *ui;
    QList<QString> stu_lines;
};

#endif // EDITSTU_H
