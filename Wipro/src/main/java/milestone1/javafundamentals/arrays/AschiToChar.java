/*
 * Initialize an integer array with ascii values and 
 * print the corresponding character values in a single row.
 */

package milestone1.javafundamentals.arrays;

public class AschiToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {67, 68, 69, 70, 71};
		for(int i=0; i<arr.length; i++)
			System.out.print((char)arr[i]+ " ");
		System.out.println();
	}

}
