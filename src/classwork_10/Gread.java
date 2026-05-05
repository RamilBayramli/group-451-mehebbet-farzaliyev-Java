package classwork_10;
public class Gread {
	public static void main(String[] args) {
		 int score = 67;
	        if (score < 0 || score > 100) {
	            System.out.println("неправльный балл");
	        } else if (score >= 90) {
	            System.out.println("5");
	        } else if (score >= 70) {
	            System.out.println("4");
	        } else if (score >= 50) {
	            System.out.println("3");
	        } else {
	            System.out.println("2");
	        }
	}
}
