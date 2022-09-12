
/*
 * USN: 2SD20CS043
 * Author: Jai Irkal
 * Q1.] Demonstrate any 3 built-in Exceptions in Java
 * 
*/
import java.util.*;

class Q1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size;
		System.out.println("Enter Array Size: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		insertIntegers(arr, size);

		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();

		divide(num1, num2);

		String a = null;
		pointNull(a);
	}

	// 1.] ArrayIndexOutOfBoundsException handling
	static void insertIntegers(int[] arr, int size) {

		int i = 0;

		try {

			// Here we purposely gave the condition i<= size to catch error
			for (i = 0; i <= size; i++) {

				arr[i] = i;
				System.out.println(arr[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array is Full!!");
		}
	}

	// 2.] Arithmetic exception
	static void divide(int num1, int num2) {

		try {

			int result = num1 / num2;

			System.out.println(num1 + " / " + num2 + " = " + result);

		} catch (ArithmeticException e) {

			System.out.println("Can't divide number by zero");
		}
	}

	// 3.] NullPointerException
	static void pointNull(String a) {

		try {

			System.out.println(a.charAt(0));

		} catch (NullPointerException e) {

			System.out.println("A Null object is being referred");
		}
	}
}