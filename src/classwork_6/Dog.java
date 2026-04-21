package classwork_6;
public class Dog {
	String name;
	int age;
	
	//1
	public Dog(String name, int age) {
		this.name = name;
	    this.age = age;	
	}
	
	public void bark() {
		System.out.println("woff i am " + this.name);
	}

}