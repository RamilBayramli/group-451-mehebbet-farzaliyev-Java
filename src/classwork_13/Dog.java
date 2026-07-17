package classwork_13;
public class Dog {
	String name;
	int age;
	public Dog(String name, int age) {
		this.name = name;
	    this.age = age;	
	}
	public void bark() {
		System.out.println("woff i am " + this.name);
	}
}
