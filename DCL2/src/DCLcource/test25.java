package DCLcource;

		class Atm implements Runnable{
			Atm(){
			Thread t1 = new Thread(this);
			Thread t2 = new Thread(this);
			Thread t3 = new Thread(this);
			t1.setName("Alex");
			t2.setName("Bobby");
			t3.setName("Jason");
			
			t1.start();
			t2.start();
			t3.start();
			t1.setPriority(10);
			}


			synchronized public void run() {
				try {
					System.err.println(Thread.currentThread().getName()+" Has Entered Atm ");
					Thread.sleep(4000);
					System.out.println(Thread.currentThread().getName()+" is inserting card and entered pin ");
					Thread.sleep(3000);
					System.out.println(Thread.currentThread().getName()+" is selecting withdrawal amount ");
					Thread.sleep(3000);
					System.out.println(Thread.currentThread().getName()+" Took the cash for counting ");
					Thread.sleep(3000);
					System.out.println(Thread.currentThread().getName()+" Took the cardout");
					Thread.sleep(3000);
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
		public class test25 {

			public static void main(String[] args) {
				Atm a = new Atm();

			}

		
	}


