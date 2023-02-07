package PROGRAMS;

import java.util.Iterator;
import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size, i, j, temp, k;

		System.out.println("enter the array");

		size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println(" enter " + size + "int");

		for (i = 0; i < size - 1; i++) {
			arr[i] = sc.nextInt();
			for (j = 0; j < size - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}

		for (k = 0; k < size - 1; k++) {

			System.out.println(arr[k] + "");
		}

	}

}
