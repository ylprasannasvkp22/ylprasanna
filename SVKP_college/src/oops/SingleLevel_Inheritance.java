package oops;
class Animal
{
	String name="Animal";
	
	void eat()
	{
		System.out.println(name +" is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
public class SingleLevel_Inheritance {
public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.eat();
		dog.bark();

	}
}
