package polymorphism.runtime;

class Test{
	 public static void main(String[]args){
	  Animal animal = new Animal();
	  animal.sound(); //Animals Makes Sound
	  Animal animal1 = new Dog(); // decided at the runtime which method implemention to use.
	  animal1.sound(); //woof woof
	 }
}
