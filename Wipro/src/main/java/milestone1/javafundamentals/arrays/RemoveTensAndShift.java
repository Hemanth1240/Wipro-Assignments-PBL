/*
 * Print a version of the given array where all the 10's have been removed. 
 * The remaining elements should shift left towards the start of the array as needed,
 *  and the empty spaces at the end of the array should be 0. 
 *  So {1, 10, 10, 2} yields {1, 2, 0, 0}. 
 *  You may modify and display the given array or make a new array
 */
package milestone1.javafundamentals.arrays;

public class RemoveTensAndShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 10, 10, 2}, n=arr.length, j=0;
		int temp[] = new int[n];
		for(int i : arr) {
			if(i == 10) {
				continue;
			}
			else {
				temp[j++]=i;
			}
		}
		for(int i : temp)
			System.out.print(i + " ");
		System.out.println();
	}

}
//----------------- P. Hemanth 21K61A1240