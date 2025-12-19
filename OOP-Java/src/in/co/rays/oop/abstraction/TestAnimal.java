package in.co.rays.oop.abstraction;

public class TestAnimal {
	public static void main(String[] args) {

		Animal a1 = new Cat();
		
		Cat c = (Cat) a1;
		System.out.println(c.voice());
		
		Animal a2 = new Dog();
		Dog d = (Dog) a2;
		System.out.println(d.voice());
		}

}
