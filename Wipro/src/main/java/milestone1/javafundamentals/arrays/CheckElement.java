/*
 *  Write a program to initialize an integer array with values and
 *   check if a given number is present in the array or not.
 */

package milestone1.javafundamentals.arrays;

public class CheckElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, arr[] = {1, 2, 3, 4, 5}, key = Integer.valueOf(args[0]);
		for(i =0; i<arr.length; i++) {
			if(arr[i] == key) {
				System.out.println(key+" found at "+ i);
				break;
			}
		}
		if(i == arr.length)
			System.out.println("-1");
	}

}

//----------------- P. Hemanth 21K61A1240
