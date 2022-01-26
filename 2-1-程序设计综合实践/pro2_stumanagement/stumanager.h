#ifndef STUMANAGER_H
#define STUMANAGER_H
#include <addstu.h>
#include <editstu.h>
#include <QMainWindow>

QT_BEGIN_NAMESPACE
namespace Ui { class StuManager; }
QT_END_NAMESPACE

class StuManager : public QMainWindow
{
    Q_OBJECT

public:
    StuManager(QWidget *parent = nullptr);
    ~StuManager();

private slots:
    void on_AddStu_clicked();
    void on_EditStu_clicked();

private:
    Ui::StuManager *ui;
};
#endif // STUMANAGER_H
