package Overriding;

public class Overrid {
	public static void main(String[] args) {
		System.out.println("take talk of cat");
		Cat c=new Cat();
		c.talk();
		System.out.println("take talk of Dog");
		Dog d=new Dog();
		d.talk();
	}
}
