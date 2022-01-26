/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 5.14.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QLabel>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMdiArea>
#include <QtWidgets/QMenu>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QToolBar>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QAction *actionOpen;
    QAction *actionSave;
    QAction *actionSaveAs;
    QAction *actionExit;
    QAction *actionUndo;
    QAction *actionRedo;
    QAction *actionCut;
    QAction *actionCopy;
    QAction *actionPaste;
    QAction *actionClose;
    QAction *actionCloseAll;
    QAction *actionTile;
    QAction *actionCascade;
    QAction *actionNext;
    QAction *actionPrevious;
    QAction *actionAbout;
    QAction *boldAct;
    QAction *italicAct;
    QAction *underlineAct;
    QAction *action_yangshi;
    QAction *actioncolor;
    QAction *actionNew;
    QWidget *centralWidget;
    QMdiArea *mdiArea;
    QLabel *bgpic;
    QLabel *bgwhite;
    QMenuBar *menuBar;
    QMenu *menu_F;
    QMenu *menu_E;
    QMenu *menu_W;
    QMenu *menu_H;
    QToolBar *mainToolBar;
    QStatusBar *statusBar;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName(QString::fromUtf8("MainWindow"));
        MainWindow->setEnabled(true);
        MainWindow->resize(1080, 679);
        QSizePolicy sizePolicy(QSizePolicy::Fixed, QSizePolicy::Fixed);
        sizePolicy.setHorizontalStretch(0);
        sizePolicy.setVerticalStretch(0);
        sizePolicy.setHeightForWidth(MainWindow->sizePolicy().hasHeightForWidth());
        MainWindow->setSizePolicy(sizePolicy);
        MainWindow->setStyleSheet(QString::fromUtf8("QToolBar\n"
"{\n"
"	background-color: rgba(0, 0, 0,0.8);\n"
"}\n"
"QToolBar::separator\n"
"{\n"
"	background-color: rgba(255, 255, 255,0.2);\n"
"	width:2px;height:11;\n"
"}\n"
"QMenuBar{\n"
"	background-color: rgba(0, 0, 0,0.8);\n"
"	font:  16pt  \"\346\226\207\346\202\246\346\226\260\351\235\222\345\271\264\344\275\223 W8\" ;\n"
"    color:white ;\n"
"\n"
"spacing:10;}\n"
"\n"
"QMenuBar::item{background-color:rgba(255, 255, 255,0);color:white ;}\n"
"QMenu{background-color:rgba(255, 255, 255,0.2);color:white ;}\n"
"QMenu::item{background-color:rgba(255, 255, 255,0.4);color:white ;}\n"
"QMenu::item:selected{background-color:rgba(255, 255, 255,0.6);color:black ;}\n"
"QStatusBar\n"
"{\n"
"background-color: rgba(255, 255, 255,0.2);\n"
"}"));
        MainWindow->setAnimated(true);
        actionOpen = new QAction(MainWindow);
        actionOpen->setObjectName(QString::fromUtf8("actionOpen"));
        QIcon icon;
        icon.addFile(QString::fromUtf8(":/myImage/images/open.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionOpen->setIcon(icon);
        actionSave = new QAction(MainWindow);
        actionSave->setObjectName(QString::fromUtf8("actionSave"));
        QIcon icon1;
        icon1.addFile(QString::fromUtf8(":/myImage/images/save.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionSave->setIcon(icon1);
        actionSaveAs = new QAction(MainWindow);
        actionSaveAs->setObjectName(QString::fromUtf8("actionSaveAs"));
        QIcon icon2;
        icon2.addFile(QString::fromUtf8(":/myImage/images/saveAs.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionSaveAs->setIcon(icon2);
        actionExit = new QAction(MainWindow);
        actionExit->setObjectName(QString::fromUtf8("actionExit"));
        QIcon icon3;
        icon3.addFile(QString::fromUtf8(":/myImage/images/exit.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionExit->setIcon(icon3);
        actionUndo = new QAction(MainWindow);
        actionUndo->setObjectName(QString::fromUtf8("actionUndo"));
        QIcon icon4;
        icon4.addFile(QString::fromUtf8(":/myImage/images/undo.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionUndo->setIcon(icon4);
        actionRedo = new QAction(MainWindow);
        actionRedo->setObjectName(QString::fromUtf8("actionRedo"));
        QIcon icon5;
        icon5.addFile(QString::fromUtf8(":/myImage/images/redo.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionRedo->setIcon(icon5);
        actionCut = new QAction(MainWindow);
        actionCut->setObjectName(QString::fromUtf8("actionCut"));
        QIcon icon6;
        icon6.addFile(QString::fromUtf8(":/myImage/images/cut.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionCut->setIcon(icon6);
        actionCopy = new QAction(MainWindow);
        actionCopy->setObjectName(QString::fromUtf8("actionCopy"));
        QIcon icon7;
        icon7.addFile(QString::fromUtf8(":/myImage/images/copy.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionCopy->setIcon(icon7);
        actionPaste = new QAction(MainWindow);
        actionPaste->setObjectName(QString::fromUtf8("actionPaste"));
        QIcon icon8;
        icon8.addFile(QString::fromUtf8(":/myImage/images/paste.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionPaste->setIcon(icon8);
        actionClose = new QAction(MainWindow);
        actionClose->setObjectName(QString::fromUtf8("actionClose"));
        actionCloseAll = new QAction(MainWindow);
        actionCloseAll->setObjectName(QString::fromUtf8("actionCloseAll"));
        actionTile = new QAction(MainWindow);
        actionTile->setObjectName(QString::fromUtf8("actionTile"));
        actionCascade = new QAction(MainWindow);
        actionCascade->setObjectName(QString::fromUtf8("actionCascade"));
        actionNext = new QAction(MainWindow);
        actionNext->setObjectName(QString::fromUtf8("actionNext"));
        QIcon icon9;
        icon9.addFile(QString::fromUtf8(":/myImage/images/next.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionNext->setIcon(icon9);
        actionPrevious = new QAction(MainWindow);
        actionPrevious->setObjectName(QString::fromUtf8("actionPrevious"));
        QIcon icon10;
        icon10.addFile(QString::fromUtf8(":/myImage/images/previous.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionPrevious->setIcon(icon10);
        actionAbout = new QAction(MainWindow);
        actionAbout->setObjectName(QString::fromUtf8("actionAbout"));
        QIcon icon11;
        icon11.addFile(QString::fromUtf8(":/myImage/images/about.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionAbout->setIcon(icon11);
        boldAct = new QAction(MainWindow);
        boldAct->setObjectName(QString::fromUtf8("boldAct"));
        boldAct->setCheckable(true);
        QIcon icon12;
        icon12.addFile(QString::fromUtf8(":/myImage/images/bold.png"), QSize(), QIcon::Normal, QIcon::Off);
        boldAct->setIcon(icon12);
        italicAct = new QAction(MainWindow);
        italicAct->setObjectName(QString::fromUtf8("italicAct"));
        italicAct->setCheckable(true);
        italicAct->setChecked(false);
        QIcon icon13;
        icon13.addFile(QString::fromUtf8(":/myImage/images/Italic.png"), QSize(), QIcon::Normal, QIcon::Off);
        italicAct->setIcon(icon13);
        underlineAct = new QAction(MainWindow);
        underlineAct->setObjectName(QString::fromUtf8("underlineAct"));
        underlineAct->setCheckable(true);
        QIcon icon14;
        icon14.addFile(QString::fromUtf8(":/myImage/images/under-line.png"), QSize(), QIcon::Normal, QIcon::Off);
        underlineAct->setIcon(icon14);
        action_yangshi = new QAction(MainWindow);
        action_yangshi->setObjectName(QString::fromUtf8("action_yangshi"));
        QIcon icon15;
        icon15.addFile(QString::fromUtf8(":/myImage/images/language.png"), QSize(), QIcon::Normal, QIcon::Off);
        action_yangshi->setIcon(icon15);
        actioncolor = new QAction(MainWindow);
        actioncolor->setObjectName(QString::fromUtf8("actioncolor"));
        QIcon icon16;
        icon16.addFile(QString::fromUtf8(":/myImage/images/product.png"), QSize(), QIcon::Normal, QIcon::Off);
        actioncolor->setIcon(icon16);
        actionNew = new QAction(MainWindow);
        actionNew->setObjectName(QString::fromUtf8("actionNew"));
        QIcon icon17;
        icon17.addFile(QString::fromUtf8(":/myImage/images/add.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionNew->setIcon(icon17);
        centralWidget = new QWidget(MainWindow);
        centralWidget->setObjectName(QString::fromUtf8("centralWidget"));
        mdiArea = new QMdiArea(centralWidget);
        mdiArea->setObjectName(QString::fromUtf8("mdiArea"));
        mdiArea->setGeometry(QRect(0, 0, 1081, 541));
        mdiArea->setStyleSheet(QString::fromUtf8(""));
        mdiArea->setFrameShape(QFrame::NoFrame);
        QBrush brush(QColor(255, 191, 28, 255));
        brush.setStyle(Qt::NoBrush);
        mdiArea->setBackground(brush);
        bgpic = new QLabel(centralWidget);
        bgpic->setObjectName(QString::fromUtf8("bgpic"));
        bgpic->setGeometry(QRect(0, -90, 1081, 631));
        bgpic->setStyleSheet(QString::fromUtf8(""));
        bgpic->setPixmap(QPixmap(QString::fromUtf8(":/myImage/images/bg.jpg")));
        bgpic->setScaledContents(true);
        bgwhite = new QLabel(centralWidget);
        bgwhite->setObjectName(QString::fromUtf8("bgwhite"));
        bgwhite->setGeometry(QRect(-10, 0, 1091, 541));
        bgwhite->setStyleSheet(QString::fromUtf8("\n"
"background-color: rgba(255, 255, 255,0.35);"));
        MainWindow->setCentralWidget(centralWidget);
        bgpic->raise();
        bgwhite->raise();
        mdiArea->raise();
        menuBar = new QMenuBar(MainWindow);
        menuBar->setObjectName(QString::fromUtf8("menuBar"));
        menuBar->setGeometry(QRect(0, 0, 1080, 39));
        QSizePolicy sizePolicy1(QSizePolicy::Fixed, QSizePolicy::Fixed);
        sizePolicy1.setHorizontalStretch(1);
        sizePolicy1.setVerticalStretch(50);
        sizePolicy1.setHeightForWidth(menuBar->sizePolicy().hasHeightForWidth());
        menuBar->setSizePolicy(sizePolicy1);
        QFont font;
        font.setFamily(QString::fromUtf8("\346\226\207\346\202\246\346\226\260\351\235\222\345\271\264\344\275\223 W8"));
        font.setPointSize(16);
        font.setBold(false);
        font.setItalic(false);
        font.setWeight(50);
        menuBar->setFont(font);
        menuBar->setMouseTracking(true);
        menuBar->setLayoutDirection(Qt::LeftToRight);
        menuBar->setAutoFillBackground(false);
        menu_F = new QMenu(menuBar);
        menu_F->setObjectName(QString::fromUtf8("menu_F"));
        menu_E = new QMenu(menuBar);
        menu_E->setObjectName(QString::fromUtf8("menu_E"));
        menu_W = new QMenu(menuBar);
        menu_W->setObjectName(QString::fromUtf8("menu_W"));
        menu_H = new QMenu(menuBar);
        menu_H->setObjectName(QString::fromUtf8("menu_H"));
        MainWindow->setMenuBar(menuBar);
        mainToolBar = new QToolBar(MainWindow);
        mainToolBar->setObjectName(QString::fromUtf8("mainToolBar"));
        mainToolBar->setEnabled(true);
        sizePolicy.setHeightForWidth(mainToolBar->sizePolicy().hasHeightForWidth());
        mainToolBar->setSizePolicy(sizePolicy);
        mainToolBar->setMovable(false);
        mainToolBar->setOrientation(Qt::Horizontal);
        mainToolBar->setIconSize(QSize(38, 38));
        mainToolBar->setToolButtonStyle(Qt::ToolButtonIconOnly);
        mainToolBar->setFloatable(false);
        MainWindow->addToolBar(Qt::TopToolBarArea, mainToolBar);
        statusBar = new QStatusBar(MainWindow);
        statusBar->setObjectName(QString::fromUtf8("statusBar"));
        QSizePolicy sizePolicy2(QSizePolicy::Preferred, QSizePolicy::Preferred);
        sizePolicy2.setHorizontalStretch(0);
        sizePolicy2.setVerticalStretch(33);
        sizePolicy2.setHeightForWidth(statusBar->sizePolicy().hasHeightForWidth());
        statusBar->setSizePolicy(sizePolicy2);
        QFont font1;
        font1.setFamily(QString::fromUtf8("\346\226\207\346\202\246\346\226\260\351\235\222\345\271\264\344\275\223 W8"));
        font1.setPointSize(18);
        statusBar->setFont(font1);
        statusBar->setSizeGripEnabled(false);
        MainWindow->setStatusBar(statusBar);

        menuBar->addAction(menu_F->menuAction());
        menuBar->addAction(menu_E->menuAction());
        menuBar->addAction(menu_W->menuAction());
        menuBar->addAction(menu_H->menuAction());
        menu_F->addAction(actionNew);
        menu_F->addAction(actionOpen);
        menu_F->addSeparator();
        menu_F->addAction(actionSave);
        menu_F->addAction(actionSaveAs);
        menu_F->addAction(actionExit);
        menu_E->addAction(actionUndo);
        menu_E->addAction(actionRedo);
        menu_E->addSeparator();
        menu_E->addAction(actionCut);
        menu_E->addAction(actionCopy);
        menu_E->addAction(actionPaste);
        menu_W->addAction(actionClose);
        menu_W->addAction(actionCloseAll);
        menu_W->addSeparator();
        menu_W->addAction(actionTile);
        menu_W->addAction(actionCascade);
        menu_W->addAction(actionNext);
        menu_W->addAction(actionPrevious);
        menu_H->addAction(actionAbout);
        mainToolBar->addAction(actionNew);
        mainToolBar->addAction(actionOpen);
        mainToolBar->addSeparator();
        mainToolBar->addAction(actionSave);
        mainToolBar->addAction(actionSaveAs);
        mainToolBar->addSeparator();
        mainToolBar->addAction(actionCut);
        mainToolBar->addAction(actionCopy);
        mainToolBar->addAction(actionPaste);
        mainToolBar->addSeparator();
        mainToolBar->addAction(actionUndo);
        mainToolBar->addAction(actionRedo);
        mainToolBar->addSeparator();
        mainToolBar->addAction(boldAct);
        mainToolBar->addAction(italicAct);
        mainToolBar->addAction(underlineAct);
        mainToolBar->addAction(action_yangshi);
        mainToolBar->addAction(actioncolor);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QCoreApplication::translate("MainWindow", "MainWindow", nullptr));
        actionOpen->setText(QCoreApplication::translate("MainWindow", "\346\211\223\345\274\200\346\226\207\344\273\266(&O)...", nullptr));
#if QT_CONFIG(tooltip)
        actionOpen->setToolTip(QCoreApplication::translate("MainWindow", "\346\211\223\345\274\200\346\226\207\344\273\266(O)", nullptr));
#endif // QT_CONFIG(tooltip)
#if QT_CONFIG(shortcut)
        actionOpen->setShortcut(QCoreApplication::translate("MainWindow", "Ctrl+O", nullptr));
#endif // QT_CONFIG(shortcut)
        actionSave->setText(QCoreApplication::translate("MainWindow", "\344\277\235\345\255\230(&S)", nullptr));
#if QT_CONFIG(shortcut)
        actionSave->setShortcut(QCoreApplication::translate("MainWindow", "Ctrl+S", nullptr));
#endif // QT_CONFIG(shortcut)
        actionSaveAs->setText(QCoreApplication::translate("MainWindow", "\345\217\246\345\255\230\344\270\272(&A)...", nullptr));
        actionExit->setText(QCoreApplication::translate("MainWindow", "\351\200\200\345\207\272(&X)", nullptr));
        actionUndo->setText(QCoreApplication::translate("MainWindow", "\346\222\244\351\224\200(&U)", nullptr));
#if QT_CONFIG(shortcut)
        actionUndo->setShortcut(QCoreApplication::translate("MainWindow", "Ctrl+Z", nullptr));
#endif // QT_CONFIG(shortcut)
        actionRedo->setText(QCoreApplication::translate("MainWindow", "\346\201\242\345\244\215(&R)", nullptr));
#if QT_CONFIG(shortcut)
        actionRedo->setShortcut(QCoreApplication::translate("MainWindow", "Ctrl+Y", nullptr));
#endif // QT_CONFIG(shortcut)
        actionCut->setText(QCoreApplication::translate("MainWindow", "\345\211\252\345\210\207(&T)", nullptr));
#if QT_CONFIG(shortcut)
        actionCut->setShortcut(QCoreApplication::translate("MainWindow", "Ctrl+X", nullptr));
#endif // QT_CONFIG(shortcut)
        actionCopy->setText(QCoreApplication::translate("MainWindow", "\345\244\215\345\210\266(&C)", nullptr));
#if QT_CONFIG(shortcut)
        actionCopy->setShortcut(QCoreApplication::translate("MainWindow", "Ctrl+C", nullptr));
#endif // QT_CONFIG(shortcut)
        actionPaste->setText(QCoreApplication::translate("MainWindow", "\347\262\230\350\264\264(&P)", nullptr));
#if QT_CONFIG(shortcut)
        actionPaste->setShortcut(QCoreApplication::translate("MainWindow", "Ctrl+V", nullptr));
#endif // QT_CONFIG(shortcut)
        actionClose->setText(QCoreApplication::translate("MainWindow", "\345\205\263\351\227\255(&O)", nullptr));
        actionCloseAll->setText(QCoreApplication::translate("MainWindow", "\345\205\263\351\227\255\346\211\200\346\234\211\347\252\227\345\217\243(&A)", nullptr));
        actionTile->setText(QCoreApplication::translate("MainWindow", "\345\271\263\351\223\272(&T)", nullptr));
        actionCascade->setText(QCoreApplication::translate("MainWindow", "\345\261\202\345\217\240(&C)", nullptr));
        actionNext->setText(QCoreApplication::translate("MainWindow", "\344\270\213\344\270\200\344\270\252(&X)", nullptr));
#if QT_CONFIG(shortcut)
        actionNext->setShortcut(QCoreApplication::translate("MainWindow", "Ctrl+Tab", nullptr));
#endif // QT_CONFIG(shortcut)
        actionPrevious->setText(QCoreApplication::translate("MainWindow", "\345\211\215\344\270\200\344\270\252(&V)", nullptr));
#if QT_CONFIG(shortcut)
        actionPrevious->setShortcut(QCoreApplication::translate("MainWindow", "Ctrl+Shift+Backtab", nullptr));
#endif // QT_CONFIG(shortcut)
        actionAbout->setText(QCoreApplication::translate("MainWindow", "\345\205\263\344\272\216(&A)", nullptr));
        boldAct->setText(QCoreApplication::translate("MainWindow", "\345\212\240\347\262\227", nullptr));
        italicAct->setText(QCoreApplication::translate("MainWindow", "\346\226\234\344\275\223", nullptr));
        underlineAct->setText(QCoreApplication::translate("MainWindow", "\344\270\213\345\210\222\347\272\277", nullptr));
        action_yangshi->setText(QCoreApplication::translate("MainWindow", "\346\240\267\345\274\217", nullptr));
        actioncolor->setText(QCoreApplication::translate("MainWindow", "\351\242\234\350\211\262", nullptr));
        actionNew->setText(QCoreApplication::translate("MainWindow", "\346\226\260\345\273\272(&N)", nullptr));
#if QT_CONFIG(tooltip)
        actionNew->setToolTip(QCoreApplication::translate("MainWindow", "\346\226\260\345\273\272(N)", nullptr));
#endif // QT_CONFIG(tooltip)
#if QT_CONFIG(shortcut)
        actionNew->setShortcut(QCoreApplication::translate("MainWindow", "Ctrl+N", nullptr));
#endif // QT_CONFIG(shortcut)
        bgpic->setText(QString());
        bgwhite->setText(QString());
        menu_F->setTitle(QCoreApplication::translate("MainWindow", "\346\226\207\344\273\266(&F)", nullptr));
        menu_E->setTitle(QCoreApplication::translate("MainWindow", "\347\274\226\350\276\221(&E)", nullptr));
        menu_W->setTitle(QCoreApplication::translate("MainWindow", "\347\252\227\345\217\243(&W)", nullptr));
        menu_H->setTitle(QCoreApplication::translate("MainWindow", "\345\270\256\345\212\251(&H)", nullptr));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
