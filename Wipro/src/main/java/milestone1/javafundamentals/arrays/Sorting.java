/*
 * Write a program to initialize an array and print them in a sorted order.
 */
package milestone1.javafundamentals.arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 5, 4}, count=0;
		for(int i =0; i< arr.length-1 && count == 0; i++) {
			count = 0;
			for(int j=0; j<arr.length - (i+1); j++) {
				if(arr[j] > arr[j+1])
				{
					arr[j] =  arr[j] + arr[j+1] -(arr[j+1] = arr[j]);
					count = 1;
				}
			}
		}
		for( int i : arr)
			System.out.print(i + " ");
		System.out.println();

	}

}
