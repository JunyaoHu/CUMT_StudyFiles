import java.io.*;
public class ReaderWriterArray {
	public static void main(String[] args) {
             
		try {
			FileInputStream fileInputStream = new FileInputStream(args[0]);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			FileOutputStream fileOutputStream = new FileOutputStream(args[0] + ".bak");
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
			
		
			// ���ַ���ʽ��ʾ�ĵ����ݣ�ͬʱ���䱸��
	
                            char[] chs=new char[100];
                            inputStreamReader.read(chs);
                            System.out.print(chs);
                            outputStreamWriter.write(chs);
			    inputStreamReader.close();
			    outputStreamWriter.close();
			}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			}
		catch(IOException e) {
			e.printStackTrace();
			}
		}
	}