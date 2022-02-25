import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class Main{
	public static void main(String[] args){
		if(args.length!=1){
			System.err.println("Usage:java Main <file>");
			System.exit(-1);
		}
		try{
			FileInputStream in=new FileInputStream(args[0]);
			BufferedInputStream bufin=new BufferedInputStream(in,1024);
			int count,half=bufin.available()/2;
			bufin.skip(half);
			byte[] buf=new byte[1025];
			while((count=bufin.read(buf,0,buf.length))>0)
			for(int i=0;i<count;i++)
			     System.out.print((char)buf[i]);
			     System.out.flush();
			     bufin.close();
			     }catch(IOException e){
			     	e.printStackTrace();
			     }
	}
}