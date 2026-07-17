package classwork_13;
public class Geters {
  private String name;
  private int age;
private Geters(String name, int age) {
	this.name = name;
    this.age = age;	
}
private String name() {
	return name;
}
private int age() {
	return age;
}
if (age >= 0) {
	this.age = age;
} else {
	System.out.println("Нет")
}
}
 