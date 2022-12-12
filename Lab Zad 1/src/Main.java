
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		byte x = 68;
		int a = 123456;
		char ch = 'W';
		boolean result = false;
		Object obj = 172;
		String str = "Java is easy to learn";

		for (int i = 0; i < 10; i++) {
			System.out.println("i is: " + i);
		}

		int counter = 0;
		while (counter < 10) {
			System.out.println("counter: " + counter);
			counter++;
		}

		String[] strings = { "one", "two", "three" };
		for (String aString : strings) {
			System.out.println(aString);
		}

		int arr1[];
		arr1 = new int[10];
		String[] stringArray = new String[10];
		int[] ints2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] strings1 = { "one", "two", "three" };
		int[] ints21 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int[] intArr = new int[10];
		int arrayLength = intArr.length;
		
		String[] stringArray1 = new String[10];
		for(int i=0; i < stringArray1.length; i++) {
			stringArray1[i] = "String no " + i;
		}
		for(int i=0; i < stringArray1.length; i++) {
			System.out.println( stringArray1[i] );
		}
		
		int[][] intArray = new int[10][20];
		intArray[0][2] = 129;
		
		System.out.print("Some text."); 
		System.out.println("Some text.");
		 

	}
}
