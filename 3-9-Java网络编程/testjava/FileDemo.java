import java.io.*;  //File��������
public class FileDemo {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("�÷���FileDemo ���� ����");
		    return;
	    } 
		//�鿴�ļ���Ŀ¼������
	    else if (args[0].toUpperCase().equals("ATTRIBUTE")) {
			File file = new File(args[1]);
			if (file.exists()) {
				System.out.println("����·����"+file.getAbsolutePath());
				System.out.println("�Ƿ�ɶ���" + file.canRead());
				System.out.println("�Ƿ��д��" + file.canWrite());
				System.out.println("�ļ����֣�" + file.getName());
				System.out.println("�ļ�·����" + file.getPath());
				System.out.println("�ļ���С: " + file.length());
				System.out.println("�޸�ʱ�䣺" + file.lastModified());
				System.out.println((file.isFile()?"�ļ�" : (file.isDirectory()? "Ŀ¼" : "δ֪")));
			} 
			else  System.out.println(args[1] + "�����ڣ�");
		} 
		//������Ŀ¼
		else if (args[0].toUpperCase().equals("MKDIR")) {
			(new File(args[1])).mkdirs();
		}		
		//ɾ���ļ�����Ŀ¼
        else if (args[0].toUpperCase().equals("DELETE")) {
			File file = new File(args[1]);
			if (file.exists())  file.delete();
			else  System.out.println(args[1] + "�����ڣ�");
		} 
		//������
		else if (args[0].toUpperCase().equals("RENAME")) {
			if (args.length != 3) {
				System.out.println("ȱ��ָ���Ĳ�����");
				return;
			}
			File oldFile = new File(args[1]);
			File newFile = new File(args[2]);
			oldFile.renameTo(newFile); 
		} 
  }
}
