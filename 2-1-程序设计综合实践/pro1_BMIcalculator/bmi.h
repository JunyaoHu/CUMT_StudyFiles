#ifndef BMI_H
#define BMI_H

#include <QMainWindow>

QT_BEGIN_NAMESPACE
namespace Ui { class BMI; }
QT_END_NAMESPACE

class BMI : public QMainWindow
{
    Q_OBJECT

public:
    BMI(QWidget *parent = nullptr);
    ~BMI();
    void calculate(double &w, double &h);

private slots:
    void on_weight_textChanged();
    void on_height_textChanged();

    void on_calculate_clicked();

private:
    QString tmp="";
    Ui::BMI *ui;
};
#endif // BMI_H
