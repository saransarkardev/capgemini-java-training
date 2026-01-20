package polymorphism.runtime;

class Test{
	 public static void main(String[]args){
	  Animal animal = new Animal();
	  animal.sound(); //Animals Makes Sound
	  Animal animal1 = new Dog();
	  animal1.sound(); //Dog is Barking
	 }
}
