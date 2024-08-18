/*
 *  Write a program to initialize an integer array and
 *   print the sum and average of the array.
 */

package milestone1.javafundamentals.arrays;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5}, sum=0;
		for(int i =0; i<5; i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of elements is "+ sum);
		System.out.println("Average of elements is "+ (float)sum/5);
	}

}
// -------------------- P. Hemanth 21K61A1240