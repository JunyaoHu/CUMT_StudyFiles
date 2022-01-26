#include "calculator.h"

#include <QApplication>

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    calculator w;
    w.show();
    return a.exec();
}
