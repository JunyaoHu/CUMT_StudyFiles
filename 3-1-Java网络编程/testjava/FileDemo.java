import java.io.*;  //File类所属包
public class FileDemo {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("用法：FileDemo 命令 参数");
		    return;
	    } 
		//查看文件或目录的属性
	    else if (args[0].toUpperCase().equals("ATTRIBUTE")) {
			File file = new File(args[1]);
			if (file.exists()) {
				System.out.println("绝对路径："+file.getAbsolutePath());
				System.out.println("是否可读：" + file.canRead());
				System.out.println("是否可写：" + file.canWrite());
				System.out.println("文件名字：" + file.getName());
				System.out.println("文件路径：" + file.getPath());
				System.out.println("文件大小: " + file.length());
				System.out.println("修改时间：" + file.lastModified());
				System.out.println((file.isFile()?"文件" : (file.isDirectory()? "目录" : "未知")));
			} 
			else  System.out.println(args[1] + "不存在！");
		} 
		//创建新目录
		else if (args[0].toUpperCase().equals("MKDIR")) {
			(new File(args[1])).mkdirs();
		}		
		//删除文件或者目录
        else if (args[0].toUpperCase().equals("DELETE")) {
			File file = new File(args[1]);
			if (file.exists())  file.delete();
			else  System.out.println(args[1] + "不存在！");
		} 
		//重命名
		else if (args[0].toUpperCase().equals("RENAME")) {
			if (args.length != 3) {
				System.out.println("缺少指定的参数！");
				return;
			}
			File oldFile = new File(args[1]);
			File newFile = new File(args[2]);
			oldFile.renameTo(newFile); 
		} 
  }
}
