package chapter05_initialization.practices;

//practice5,practice6
//reloading
public class Practice05 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark(5, true);
		dog.bark('c', 5.5f);
		dog.bark("String");
	}

}

class Dog{
	public void bark(int i, boolean b){
		System.out.println("barking");
	}
	public void bark(String str){
		System.out.println(str);
	}
	public void bark(char c, float f){
		System.out.println("howling");
	}
}