package classwork_18;
public class Calculator {
    public static void main(String[] args) {
        int score = 100;
        if (score >= 81) {
            System.out.println("5");
        } else if (score >= 61) {
            System.out.println("4");
        } else if (score >= 31) {
            System.out.println("3");
        } else {
            System.out.println("2");
        }
    }
}
