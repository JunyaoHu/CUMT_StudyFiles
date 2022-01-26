#include "stumanager.h"
#include <QApplication>
int main(int argc, char *argv[])
{
    QApplication a(argc, argv);

    StuManager w;
    w.show();
    return a.exec();
}
