package classwork_8;
public class Numbers3 {
	public static void main(String[] args) {
	    int a = 5;
        int b = 8;
        int c = 3;
        int max = max(a, b, c);
        System.out.println("макс " + max);
	}
     int max(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
		}
	}

