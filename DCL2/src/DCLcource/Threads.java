package DCLcource;


class 	MsWord extends  Thread {
	public void run() {
		if(getName().equals("Typing")) {
			Typing();
		}
		else if (getName().equals("SpellCheck")) {
			spellcheck();
		}
		else {
			AutoSave();
		}
}
			
	void Typing() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("Typing is in Progress...");
				Thread.sleep(4000);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}}
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
class Threads{
		public static void main(String[] args) {
			MsWord m1 = new MsWord();
			MsWord m2 = new MsWord();
			MsWord m3 = new MsWord();
			
			m1.setName("Typing");
			m2.setName("SpellCheck");
			m3.setName("Autosave");
			
			
			m1.start();
			m2.start();
			m3.start();
			
			
		}
	}
