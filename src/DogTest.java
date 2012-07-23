

public class DogTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.bark("big dog");
	}

}

class Dog{
	public void bark(String str){
		System.out.println(str + "bark");
	}
}