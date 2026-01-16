package classwork_1;

public class Classwork_1 {
	public static void main(String[] args) {
		//1
		//копирование образавание в строку поиск числа сортировка
		//это опомгает писать быстрый и короткий код
		//2
		        int[] numbers = {1, 2, 3};
		        int[] cloneNumbers = Arrays.copyOf(numbers, 6); 
		        System.out.println(Arrays.toString(cloneNumbers));
		    }
	//3
	int[] numbers = {10, 20, 30, 40, 50};
    int[] clopyRangeNumbers = Arrays.copyOfRange(numbers, 1, 4);
    System.out.println(Arrays.toString(clopyRamgeNumbers));
  }
    //4
  //?
 //5
int[] nums = new int[5];
Arrays.fill(nums, 2);
//6
int[] numsTest = {45, 6, 7, 77);
System.out.println("Index: " + Arrays.binarySearch(numsTest, 6));
//7
int [ ] n1 = {1, 2, 3};
int[] n2= {1, 2, 3};
System.out.println("Equals: "+Arrays.equals(n1, n2));
//8