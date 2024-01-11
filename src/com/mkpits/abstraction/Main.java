package com.mkpits.abstraction;

//Abstract class
abstract class Animal {
// Abstract method (does not have a body)
	public abstract void animalSound();

// Regular method
	public void sleep() {
		System.out.println("Zzz");
	}

	public static void main(String[] args) {
		System.out.println("Hello from main");
	}
}

//Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}

class Tiger extends Animal {

	@Override
	public void animalSound() {
		System.out.println("Roar");

	}

}

class Main {
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		myPig.main(null);

		Tiger tiger = new Tiger();
		tiger.animalSound();
	}
}
