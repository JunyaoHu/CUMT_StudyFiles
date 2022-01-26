#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
class MdiChild;

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT
public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();
private slots:
    MdiChild *createMdiChild(); // 创建子窗口

    void on_actionNew_triggered();
    void on_actionOpen_triggered();
    void on_actionSave_triggered();
    void on_actionSaveAs_triggered();
    void on_actionExit_triggered();
    void on_actionUndo_triggered();
    void on_actionRedo_triggered();
    void on_actionCut_triggered();
    void on_actionCopy_triggered();
    void on_actionClose_triggered();
    void on_actionPaste_triggered();
    void on_actionNext_triggered();
    void on_actionPrevious_triggered();
    void on_actionAbout_triggered();
    void on_actionCloseAll_triggered();
    void showTextRowAndCol(); // 显示文本的行号和列号
    void on_actionTile_triggered();//平铺
    void on_actionCascade_triggered();//层叠

    void on_boldAct_triggered();
    void on_italicAct_triggered();
    void on_underlineAct_triggered();

    void on_action_yangshi_triggered();//样式
    void on_actioncolor_triggered();//颜色
private:
    Ui::MainWindow *ui;
    void readSettings();  // 读取窗口设置
    void writeSettings(); // 写入窗口设置
    void initWindow(); // 初始化窗口
    MdiChild *activeMdiChild(); // 活动窗口
protected:
    void closeEvent(QCloseEvent *event);  // 关闭事件
};

#endif // MAINWINDOW_H
