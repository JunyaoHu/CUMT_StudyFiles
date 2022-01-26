#ifndef MDICHILD_H
#define MDICHILD_H

#include <QTextEdit>
#include <QCloseEvent>

class MdiChild : public QTextEdit
{
    Q_OBJECT
public:
    explicit MdiChild(QWidget *parent = 0);
    void newFile();                         // 新建操作
    bool loadFile(const QString &fileName); // 加载文件
    bool save();                            // 保存操作
    bool saveAs();                          // 另存为操作
    bool saveFile(const QString &fileName); // 保存文件
    void mergeFormatOnWordOrSelection(const QTextCharFormat &format);
protected:
    void closeEvent(QCloseEvent *event);    // 关闭
private slots:
    void documentWasModified();             // 文档被更改时，显示更改状态标志
private:
    void setCurrentFile(const QString &fileName);  // 设置当前文件
    QString curFile;                               // 保存当前文件路径
    bool isUntitled;                               // 作为当前文件是否被保存到硬盘上的标志
};

#endif // MDICHILD_H
