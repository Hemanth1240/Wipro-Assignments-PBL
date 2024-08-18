/*
 *  Print an array that contains the exact same numbers as the given array,
 *   but rearranged so that all the even numbers come before all the odd numbers. 
 *   Other than that, the numbers can be in any order. 
 *   You may modify and print the given array, or make a new array.
 */
package milestone1.javafundamentals.arrays;

public class ShiftEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 0, 1, 0, 1, 1, 0}, n = arr.length;
		int ecount=0, earr[] = new int[n], ocount=0, oarr[] = new int[n];
		for(int i : arr) {
			if(i%2 == 0) {
				earr[ecount++] =i; 
			}
			else
				oarr[ocount++] = i;
		}
		for(int i = 0; i<ecount; i++) {
			arr[i] = earr[i];
		}
		for(int i = ecount; i<n; i++) {
			arr[i] = oarr[i-ecount];
		}
		for(int i : arr)
			System.out.print(i + " ");
		
	}

}


//------------------------- P. Hemanth 21K61A1240