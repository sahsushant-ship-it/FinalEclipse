package os;

import java.io.FileReader;

public class manoj {

	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("C:\\Users\\Asus\\Desktop\\New folder\\file.txt");
			System.out.println("File is Read");
		
			int a;
			while ((a=f.read())!=-1) {
				System.out.print((char)a);
			}
	System.out.println();
		}    
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Executed Sucessfully");

	}

}

