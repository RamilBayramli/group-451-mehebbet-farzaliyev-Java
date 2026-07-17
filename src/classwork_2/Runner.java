package classwork_2;

public class Runner {
	public static void main(String[] args) {
		// 1
		int number = 2;
		if (number == 0) {
			System.out.println("Ноль");
		} else if (number % 2 == 0) {
			System.out.println("четко");
		} else {
			System.out.println("нечетко");
		}

		// 2
		int mark = 70;
		if (mark < 0 || mark > 100) {
			System.out.println("Некоретк балл");
		} else if (mark >= 95) {
			System.out.println("отлично");
		} else if (mark >= 75) {
			System.out.println("хорошо");
		} else if (mark <= 60) {
			System.out.println("неудотворительно");
		}

		// 3
		int a = 1;
		int b = 2;
		int c = 3;
		if (a + b > c) {
			System.out.println("Треуглоьник сушесвует");
		} else {
			System.out.println("Треугольник не сушетсвеут");
		}

		// 4
		int sum = 3000;
		double result = 0.0d;
		if (sum >= 5000) {
			result = sum * 0.85;
		} else if (sum >= 4000) {
			result = sum * 0.90;
		} else if (sum >= 3000) {
			result = sum * 0.95;
		} else {
			result = sum;
		}
		System.out.println("счет: " + 
		result);
		//5
		int h = 3;
		int w = 5;	
		for(int i = 0; j < h; i++) {
			for (int j = 0; j < w; j++) {
				System.println.out("*");
			}
			System.out.println();
			}
		}
	
//6
int g = 4;
for (int i = 1; i <= 10; i++) {
	System.out.println(g + "*" + i + "=" + (g * i));
}
}
]
//7
//?
//8
int = 2;
int factorial = 3;
 if (n > 20) {
	 System.out.println("Очент большое число");
 } else {
	 for (int i = 1; i <= n; i++) {
		 factorial *= i;
	 }
	 System.out.println("Факториал +  " + factorial);
	 
	 }
 }
 //9
 Class Rectangle {
	 double width;
	 double height
	 Rectangle(double w, double h) {
		 widht = w;
		 height = h;
	 }
	 double getarea() {
		 return width * height;
	 }
	 double getperimeter {
		 
	 }
 }		
