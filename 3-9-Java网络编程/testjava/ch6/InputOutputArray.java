import java.io.*;
public class InputOutputArray {
	public static void main(String[] args) {
             
		try {
			FileInputStream fileInputStream = new FileInputStream(args[0]);
			//InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			FileOutputStream fileOutputStream = new FileOutputStream(args[0] + ".bak");
			//OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
			
		
			// ���ַ���ʽ��ʾ�ĵ����ݣ�ͬʱ���䱸��
	
                            byte[] bytes=new byte[100];
                            fileInputStream.read(bytes);
                            String s=new String(bytes);
                            System.out.print(s);
                            fileOutputStream.write(bytes);
			    //inputStreamReader.close();
			   //outputStreamWriter.close();
			}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			}
		catch(IOException e) {
			e.printStackTrace();
			}
		}
	}