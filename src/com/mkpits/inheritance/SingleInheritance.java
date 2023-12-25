package com.mkpits.inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubDemo demo = new SubDemo();
		demo.getData(34, 12);
		demo.add();
		demo.sub();

	}

}

class AddDemo {

	int x, y;

	public void getData(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public void add() {
		int z = x + y;
		System.out.println("The Addition is " + z);
	}
}

class SubDemo extends AddDemo {

	public void sub() {
		int z = x - y;
		System.out.println("Subtraction is " + z);
	}
}
