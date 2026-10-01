package DCLcource;


class MsWord1 extends  Thread {
	public void run() {
		
		 if (getName().equals("SpellCheck")) {
			spellcheck();
		}
		else {
			AutoSave();
		}
}
			
	
	void spellcheck() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("spellCheck is in Progress...");
				Thread.sleep(4000);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}}
	void AutoSave() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("AutoSave is in Progress...");
				Thread.sleep(4000);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
class test18{
		public static void main(String[] args) {
			MsWord1 m1 = new MsWord1();
			MsWord1 m2 = new MsWord1();
			
			m1.setName("SpellCheck");
			m2.setName("Autosave");
			
			m2.setDaemon(true);
			
			
			m2.setPriority(10);

		
			
			
			m1.start();
			m2.start();
			
			
			
		}
	}

