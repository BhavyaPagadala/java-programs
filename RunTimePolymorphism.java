class Animal{
	void sound(){
		System.out.println("Animal makes sound");
	}
}
class Dog extends Animal{
	void sound(){
		System.out.println("Dog sounds like: BOW..BOW..");
	}
}
class Cat extends Animal{
	void sound(){
		System.out.println("Cat sounds like: MEOW..MEOW..");
	}
}
class Duck extends Animal{
	void sound(){
		System.out.println("DUCK sounds like: QUACK..QUACK..");
	}
}
public class RunTimePolymorphism{
	public static void main(String args[]){
		Animal a;
		a= new Dog();
		a.sound();
		a=new Cat();
		a.sound();
		a=new Duck();
		a.sound();
	}
}
