/*
 * Write a program to find the largest 2 numbers and
 *  the smallest 2 numbers in the given array.
 */
package milestone1.javafundamentals.arrays;

public class Large2Small2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5}, s1= Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
		int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > l1) {
				l2 = l1;
				l1 = arr[i];
			}
			else if( arr[i] > l2 && arr[i] != l1)
				l2 = arr[i];
			 if(arr[i] < s1) {
				 s2 = s1;
				 s1= arr[i];
			 }
			 else if(arr[i] < s2 && arr[i] != s1)
				 s2 = arr[i];
		}
		System.out.println("Largest 2 are " + l1 + " " + l2);
		System.out.println("Smallest 2 are " + s1 + " " + s2);
	}

}
