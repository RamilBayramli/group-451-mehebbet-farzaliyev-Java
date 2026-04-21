package claswork_4;
public class Runner {

	//1
	int sum = 1;
    if (sum > 0) {
        System.out.println("полож");
    } else {
        System.out.println("отриц или нль");
    }
//2
    int sum2 = 2;
    if (sum2 % 2 == 0) {
        System.out.println("чет");
    } else {
        System.out.println("нечет");
    }
    //3
    int a = 52, b = 67;
    if (a < b) {
        System.out.println(a);
    } else {
        System.out.println(b);
    }
//4
    int age = 14;
    if (age < 18) {
        System.out.println("несовер");
    } else {
        System.out.println("совер");
    }
//5
    int grade = 67;
    if (grade >= 90) {
        System.out.println("отлич");
    } else if (grade >= 70) {
        System.out.println("хорош");
    } else if (grade >= 50) {
        System.out.println("удот");
    } else {
        System.out.println("не сдал иван золо");
    }
//6
    int c = 52, i = 42, z = 67;
    int max = z;
    if (i > max) max = i;
    if (c > max) max = c;
    if (z > max) max = z;
    System.out.println(max);
//




    


}
 }