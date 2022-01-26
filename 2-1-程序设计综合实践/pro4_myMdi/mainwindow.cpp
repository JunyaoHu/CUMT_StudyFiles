#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "mdichild.h"
#include <QFileDialog>
#include <QSettings>
#include <QCloseEvent>
#include <QLabel>
#include <QMdiSubWindow>
#include <QMessageBox>
#include <QFontDialog>
#include <QColorDialog>

MainWindow::MainWindow(QWidget *parent) :QMainWindow(parent),ui(new Ui::MainWindow){ui->setupUi(this);readSettings();initWindow();}
MainWindow::~MainWindow(){delete ui;}

void MainWindow::on_actionNew_triggered()
{
    MdiChild *child = createMdiChild(); // 创建MdiChild   
    child->newFile();// 新建文件
    child->show();// 显示子窗口
}

void MainWindow::on_actionOpen_triggered()
{
    QString fileName = QFileDialog::getOpenFileName(this,"打开文件嘤\(￣︶￣*))"); // 获取文件路径
    if(fileName.isEmpty()) return;
    MdiChild *child = createMdiChild(); // 如果没有打开，则新建子窗口
    if (child->loadFile(fileName)){ui->statusBar->showMessage("打开文件成功嘞！ouo", 2000);child->show();}
    else child->close();
}

void MainWindow::on_actionSave_triggered(){if (activeMdiChild() && activeMdiChild()->save()) ui->statusBar->showMessage("文件保存成功啦！O(∩_∩)O",2000);}

void MainWindow::on_actionSaveAs_triggered(){if (activeMdiChild() && activeMdiChild()->saveAs()) ui->statusBar->showMessage("另存为文件保存成功啦！O(∩_∩)O",2000);}

void MainWindow::on_actionExit_triggered() {qApp->closeAllWindows();}  // 退出菜单

MdiChild * MainWindow::createMdiChild()
{
    MdiChild *child = new MdiChild; // 创建MdiChild部件
    ui->mdiArea->addSubWindow(child); // 向多文档区域添加子窗口，child为中心部件

    // 根据QTextEdit类的是否可以复制信号设置剪切复制动作是否可用
    connect(child,SIGNAL(copyAvailable(bool)),ui->actionCut, SLOT(setEnabled(bool)));
    connect(child,SIGNAL(copyAvailable(bool)),ui->actionCopy,SLOT(setEnabled(bool)));

    // 每当编辑器中的光标位置改变，就重新显示行号和列号
    connect(child,SIGNAL(cursorPositionChanged()),this,SLOT(showTextRowAndCol()));
    return child;
}

void MainWindow::readSettings()
{
    QSettings settings("windows", "myWord");
    QPoint pos = settings.value("pos", QPoint(200, 200)).toPoint();
    QSize size = settings.value("size", QSize(600, 400)).toSize();
    move(pos);
    resize(size);
}

void MainWindow::writeSettings()
{
    QSettings settings("windows", "myWord");
    settings.setValue("pos", pos());   // 写入位置信息
    settings.setValue("size", size()); // 写入大小信息
}

void MainWindow::initWindow()
{
    setWindowTitle("myWord");

    // 我们在工具栏上单击鼠标右键时，可以关闭工具栏
    ui->mainToolBar->setWindowTitle(tr("工具栏"));

    // 当多文档区域的内容超出可视区域后，出现滚动条
    ui->mdiArea->setHorizontalScrollBarPolicy(Qt::ScrollBarAsNeeded);
    ui->mdiArea->setVerticalScrollBarPolicy(Qt::ScrollBarAsNeeded);

    ui->statusBar->showMessage(tr("啊啊啊欢迎使用bug制造器！（划掉"));

    // 动作的状态提示
    ui->actionNew->setStatusTip(tr("我们来建立一个新的文件叭！d=====(￣▽￣*)b"));
    ui->actionOpen->setStatusTip(tr("打开之前有的文件嘤嘤"));
    ui->actionSave->setStatusTip(tr("直接保存捏O(∩_∩)O"));
    ui->actionSaveAs->setStatusTip(tr("另存为吖(ง •_•)ง"));
    ui->actionExit->setStatusTip(tr("溜啦溜啦ε=ε=ε=(~￣▽￣)~"));
    ui->actionUndo->setStatusTip(tr("撤销＞﹏＜"));
    ui->actionRedo->setStatusTip(tr("重做Σ(っ °Д °;)っ"));
    ui->actionCut->setStatusTip(tr("剪切嘻嘻(。>︿<)_θ"));
    ui->actionCopy->setStatusTip(tr("复制咔咔(⊙﹏⊙)"));
    ui->actionPaste->setStatusTip(tr("粘贴嘟嘟(。・∀・)ノ"));
    ui->actionClose->setStatusTip(tr("关闭当前窗口呢（*゜——゜*）"));
    ui->actionCloseAll->setStatusTip(tr("关闭所有窗口捏？w(ﾟДﾟ)w"));
    ui->actionTile->setStatusTip(tr("平铺所有滴cuang口哈~＞︿＜"));
    ui->actionCascade->setStatusTip(tr("层叠所有滴cuang口哈~o(*////▽////*)q"));
    ui->actionNext->setStatusTip(tr("移动到下一个窗口o_o ...."));
    ui->actionPrevious->setStatusTip(tr("移动到前一个窗口( ´･･)ﾉ(._.`)"));
    ui->actionAbout->setStatusTip(tr("我来介绍一下软件nia nia nia（兴奋大叫=￣ω￣="));
}

MdiChild *MainWindow::activeMdiChild()
{
    // 如果有活动窗口，则将其内的中心部件转换为MdiChild类型
    if(QMdiSubWindow *activeSubWindow = ui->mdiArea->activeSubWindow())
        return qobject_cast<MdiChild*>(activeSubWindow->widget());
    return 0;// 没有活动窗口，直接返回0
}

void MainWindow::closeEvent(QCloseEvent *event)
{
    ui->mdiArea->closeAllSubWindows(); // 先执行多文档区域的关闭操作
    if (ui->mdiArea->currentSubWindow()){event->ignore();}  // 如果还有窗口没有关闭，则忽略该事件
    else { writeSettings(); event->accept();}// 在关闭前写入窗口设置
}

void MainWindow::on_actionUndo_triggered(){ if(activeMdiChild()) activeMdiChild()->undo();} // 撤销菜单
void MainWindow::on_actionRedo_triggered(){if(activeMdiChild()) activeMdiChild()->redo();}// 恢复菜单
void MainWindow::on_actionCut_triggered(){if(activeMdiChild()) activeMdiChild()->cut();}// 剪切菜单
void MainWindow::on_actionCopy_triggered() {if(activeMdiChild()) activeMdiChild()->copy();}// 复制菜单
void MainWindow::on_actionPaste_triggered(){if(activeMdiChild()) activeMdiChild()->paste();}// 粘贴菜单
void MainWindow::on_actionClose_triggered() {ui->mdiArea->closeActiveSubWindow();}// 关闭菜单
void MainWindow::on_actionCloseAll_triggered(){ui->mdiArea->closeAllSubWindows();}// 关闭所有窗口菜单

void MainWindow::showTextRowAndCol()
{
    // 如果有活动窗口，则显示其中光标所在的位置
    if(activeMdiChild())
    {
        // 因为获取的行号和列号都是从0开始的，所以我们这里进行了加1
        int rowNum = activeMdiChild()->textCursor().blockNumber()+1;
        int colNum = activeMdiChild()->textCursor().columnNumber()+1;
        ui->statusBar->showMessage(tr("%1行 %2列").arg(rowNum).arg(colNum),2000);
    }
}

void MainWindow::on_actionNext_triggered(){ui->mdiArea->activateNextSubWindow();}// 下一个菜单
void MainWindow::on_actionTile_triggered(){ui->mdiArea->tileSubWindows();}// 平铺菜单
void MainWindow::on_actionCascade_triggered(){ui->mdiArea->cascadeSubWindows();}// 层叠菜单
void MainWindow::on_actionPrevious_triggered(){ui->mdiArea->activatePreviousSubWindow();}// 前一个菜单
void MainWindow::on_actionAbout_triggered(){QMessageBox::about(this,"这是一个作业","程序设计综合实践课程\n姓名：胡钧耀\n学号：06192081");} // 关于菜单

void MainWindow::on_boldAct_triggered()
{   
    ui->statusBar->showMessage(tr("加粗！"),2000);
    QFont bold;
    bold.setBold(true);
    ui->boldAct->setFont(bold);
    QTextCharFormat fmt;
    fmt.setFontWeight(ui->boldAct->isChecked() ? QFont::Bold : QFont::Normal);
    if(activeMdiChild())  activeMdiChild()->mergeFormatOnWordOrSelection(fmt);
}

void MainWindow::on_italicAct_triggered()
{
    ui->statusBar->showMessage(tr("斜体！"),2000);
    QTextCharFormat fmt;
    fmt.setFontItalic(ui->italicAct->isChecked());
    if(activeMdiChild())  activeMdiChild()->mergeFormatOnWordOrSelection(fmt);
}

void MainWindow::on_underlineAct_triggered()
{
    ui->statusBar->showMessage(tr("下划线！"),2000);
    QTextCharFormat fmt;
    fmt.setFontUnderline(ui->underlineAct->isChecked());
    if(activeMdiChild())  activeMdiChild()->mergeFormatOnWordOrSelection(fmt);
}

void MainWindow::on_action_yangshi_triggered()
{
    ui->statusBar->showMessage(tr("修改字体样式！"),2000);
    bool ok = false;
    QFont font = QFontDialog::getFont(&ok,this);
    QTextCharFormat fmt;
    fmt.setFont(font);

    if(ok) this->activeMdiChild()->mergeFormatOnWordOrSelection(fmt);
}

void MainWindow::on_actioncolor_triggered()
{
    if(activeMdiChild())
    {
        QColor col = QColorDialog::getColor(activeMdiChild()->textColor(), this);
        if (!col.isValid())  return;
        QTextCharFormat fmt;
        fmt.setForeground(col);
        activeMdiChild()->mergeFormatOnWordOrSelection(fmt);
    }

}
