package punithsirjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo6 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("final.2.txt");
			String text ="RCB are Back-2-Back champions";
			byte[] b=text.getBytes();
			fos.write(b);
			System.out.println("file is written");
			FileInputStream fis=new FileInputStream("final.2.txt");
			int ch ;
			while((ch=fis.read())!=-1) {
				System.out.print((char)ch);
			}
		}
			
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}