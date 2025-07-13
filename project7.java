public class Main
{
	public static void main(String[] args) {
	 class Animal{
	         void eat(){
	             System.out.println("Aniaml eat");
	         }
	     } 
	     class Dog extends Animal{
	         void bark(){
	             System.out.println("Dog bark");
	         }
	     } 
	      Dog j = new Dog();
	      j.eat();
	      j.bark();
	}
}
