import java.io.*;
public class StreamReaderWriterDemo {
	public static void main(String[] args) {
             
		try {
			FileInputStream fileInputStream = new FileInputStream(args[0]);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			FileOutputStream fileOutputStream = new FileOutputStream(args[0] + ".bak");
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
			
			int ch;
			// 以字符格式显示文档内容，同时将其备份
			while((ch = inputStreamReader.read()) != -1)
				{
				System.out.print((char)ch);
			        outputStreamWriter.write(ch);
				} 

			    System.out.println();
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

