package Practise;
public class Animal{
	 public void sound(){
	 System.out.println("Animal is making a sound"); 
	 }
	}
	//Horse.java
	class Horse extends Animal{
	 @Override
	 public void sound(){
	 System.out.println("Neigh");
	 }
	 public static void main(String args[]){
	 Animal obj = new Horse();
	 obj.sound();
	 }
	}
	//Cat.java
	public class Cat extends Animal{
	 @Override
	 public void sound(){
	 System.out.println("Meow");
	 }
	 public static void main(String args[]){
	 Animal obj = new Cat();
	 obj.sound();
	 }
	}

