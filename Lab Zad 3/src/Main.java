import java.util.Arrays;
import java.util.Random;

public class Main {

	public static int[] copy;

	public static void main(String[] args) {

		int[] myArray = new int[5];

		// test
		Random rClass = new Random();

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rClass.nextInt(100);
		}

		printArr(myArray);

		sortAndFilter(myArray, 2);

	}

	static int[] sortAndFilter(int[] array, int key) {
		int[] newArr = new int[key];
		copyArray(array);

		for (int i = 0; i < key; i++) {
			newArr[i] = copy[i];
		}

		System.out.print("New array of index key: ");
		printArr(newArr);
		return newArr;

	}

	public static void copyArray(int[] a) {

		copy = Arrays.copyOfRange(a, 0, a.length);
		//Тук този метод работи
		Arrays.sort(copy); 
		System.out.print("Copied array B: ");
		printArr(copy);
	}

	public static void printArr(int[] arr) {

		for (int element : arr) {
			System.out.print(element + ", ");
		}
		System.out.println();
	}

}
