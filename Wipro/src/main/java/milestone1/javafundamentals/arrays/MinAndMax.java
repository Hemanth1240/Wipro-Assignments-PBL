/*
 * Write a program to initialize an integer array and
 *  find the maximum and minimum value of the array.
 */

package milestone1.javafundamentals.arrays;

public class MinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5}, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] < min)
				min=arr[i];
			if(arr[i] > max)
				max=arr[i];
		}
		System.out.println("Minimum element is "+ min);
		System.out.println("Maximum element is "+ max);
	}

}

//----------------------- P. Hemanth 21K61A1240