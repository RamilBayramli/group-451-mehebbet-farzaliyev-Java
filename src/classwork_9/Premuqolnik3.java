package classwork_9;
public class Premuqolnik3 {
double width, height;

public Premuqolnik3(double width, double heigth) {
	this.width = width;
	this.heigth = heigth;
}

public double area() {
	return width * height;
}

public double perimeter() {
	return (2 * (width + height));
}
public void describe() {
	System.out.println(width);
	System.out.println(height);
	System.out.println(perimeter);

}
}
