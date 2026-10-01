package javainterface;

public class bulb implements Switch {

	@Override
	public void switchOn() {
		System.out.println("Bulb turns on");
		
	}

	@Override
	public void Switchoff() {
		System.out.println("Bulb turns off");
		
	}

}
