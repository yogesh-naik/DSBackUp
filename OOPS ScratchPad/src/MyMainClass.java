class MyMainClass {

	static class Animal {
		public void animalSound2() {
			System.out.println("The animal makes a sound");
		}
		
		public void display(){
			System.out.println("Animal CLASS");
		}
	}

	static class Pig extends Animal {
		public void animalSound() {
			System.out.println("The pig says: wee wee");
		}
	}

	static class Dog extends Animal {
		public void animalSound2() {
			System.out.println("The dog says: bow wow");
		}
	}

	public static void main(String[] args) {
		Animal myAnimal = new Animal(); // Create a Animal object
		Animal myPig = new Pig(); // Create a Pig object
		Dog myDog = new Dog(); // Create a Dog object
		myAnimal.animalSound2();
		myPig.animalSound2();
		myDog.animalSound2();
		myDog.display();
	}
}