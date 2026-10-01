package DCLcource;

import java.util.Scanner;

public abstract class Abstcls {
	float a;

	abstract void input();

	abstract void calc();

	void disp() {
		System.out.println("area is " + a);
	}

	Scanner sc = new Scanner(System.in);
}

class Square extends Abstcls {

	float l;

	@Override
	void input() {
		l = sc.nextFloat();

	}

	@Override
	void calc() {
		a = l * l;

	}

}

class Circle extends Abstcls {
	float r;

	@Override
	void input() {
		r = sc.nextFloat();

	}

	@Override
	void calc() {
		a = 3.14f * r * r;

	}

}

class rectangle extends Abstcls {
	float l, b;

	@Override
	void input() {
		System.out.println("enter the length");
		l = sc.nextFloat();
		System.out.println("enter the breadth");
		b = sc.nextFloat();
		
	}

	@Override
	void calc() {
		a = l*b;

	}
}


