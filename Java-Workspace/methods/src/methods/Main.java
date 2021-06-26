package methods;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Dog doggy = new Dog();
		
		doggy.name = "Daisy";
		doggy.size = 45.48;
		
		Dog otherDoggy = new Dog();
		otherDoggy.name = "spot";
		otherDoggy.size = 80.0;
		System.out.println(doggy.name);
		System.out.println(doggy.size);
		System.out.println(otherDoggy.name);
		System.out.println(otherDoggy.size);
		
		otherDoggy.bark();
		otherDoggy.changeName("sparky");
		System.out.println(otherDoggy.name);
		
		
		double answer = doggy.doggyAdd(10, 10);
		System.out.println(answer);
	}


}
