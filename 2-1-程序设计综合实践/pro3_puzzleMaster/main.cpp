#include "welcome.h"

#include <QApplication>

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    welcome w;
    w.show();
    return a.exec();
}
