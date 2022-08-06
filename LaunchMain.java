package test;

import java.util.Scanner;

public class LaunchMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean go = true;
		while (go) {
			System.out.println("1 Search Operation");
			System.out.println("2 Sort Operation");
			System.out.println("0 Exit");
			System.out.println("enter Your Choice ");
			int input = scanner.nextInt();
			switch (input) {
			case 1:

				boolean in = true;
				while (in) {
					System.out.println("1 Linear search ");

					System.out.println("2 Binary search ");
					System.out.println("3 exit ");

					input = scanner.nextInt();
					switch (input) {
					case 1:
						int length, key;
						int[] arr;
						LaunchMain lmSearch = new LaunchMain();

						System.out.println("***** Linear search op start *********");
						System.out.println(" Enter length of array ");
						length = scanner.nextInt();

						arr = new int[length];

						lmSearch.readArray(arr, scanner);

						lmSearch.displayArr(arr);

						System.out.println("");
						System.out.println(" Enter Key To Search : ");
						key = scanner.nextInt();
						// linear search operation
						lmSearch.linearSearch(arr, key);
						System.out.println("");

						break;
					case 2:
						int[] arr2;
						LaunchMain lmbSearch = new LaunchMain();

						System.out.println("***** Binary search op start *********");
						System.out.println(" Enter length of array ");
						length = scanner.nextInt();

						arr2 = new int[length];
						lmbSearch.readArray(arr2, scanner);

						lmbSearch.displayArr(arr2);

						System.out.println("");
						System.out.println(" Enter Key To Search : ");
						key = scanner.nextInt();
						// linear search operation
						lmbSearch.binarySearch(arr2, 0, arr2.length - 1, key);
						System.out.println("");

						break;
					case 3:
						System.out.println("exit from  search op ");
						in = false;
						break;

					}
				}

				break;
			case 2:

				System.out.println("Sort opeartion menu");
				break;
			case 0:
				go = false;
				break;
			}
			System.out.println("Good BYE !!");

		}
	}

	public void displayArr(int[] arr) {
		System.out.println(" Array Element are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public void readArray(int[] arr, Scanner scanner) {
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			System.out.println(" Enter  No " + j + " ");
			arr[i] = scanner.nextInt();
		}

	}

	public void linearSearch(int[] arr, int key) {
		boolean isKeyFound = false;
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				System.out.println("  Key found in collection at index " + i);
				isKeyFound = true;
				break;
			}

		}
		if (!isKeyFound)
			System.out.println("key not found");

		System.out.println("");
	}

	public void binarySearch(int arr[], int first, int last, int key) {
		System.out.println("b serach calling " + key);
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}
}
