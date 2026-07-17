public class Main {
    public static void main(String[] args) {
        int[] fruits = {1, 0, 0, 1, 1, 0};
        int count = 0;
        for (int fruit : fruits) {
            if (fruit == 1) {
                System.out.println(fruit); 
                count++; 
            }
        }
        System.out.println(count);
    }
}
