package os;

import java.util.Scanner;

	class Task1 extends Thread{
		
		public void run() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Username: ");
			String name = sc.next();
			System.out.println("Enter pswrd: ");
			int pwd = sc.nextInt();
			System.out.println("collect your cash....");
		}
	}

	class Task2 extends Thread{
		public void run () {
			try {
				for (int i=0;i<=1;i++) {
					
					System.out.println("Dhee Coding Lab ");
					Thread.sleep(3000);
				}
			}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		class Task3 extends Thread{
			public void run() {
				int x,y,z;
				x=10000;
				y=20000;
				z=x+y;
				System.out.println(z);
				
			}
		}
		public class Test9 {
			public static void main(String[] args) {
				Task1 t1=new Task1();
				Task2 t2 = new Task2();
				Task3 t3 = new Task3();
				t1.start();
				t2.start();
				t3.start();
			}
		}
		
		
	
		
		
		

