/*
 *  Write a program to print the sum of the elements of an array following
 *   the given below condition.

If the array has 6 and 7 in succeeding orders,
 ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
 */

package milestone1.javafundamentals.arrays;

public class Ignore6And7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,3,6,1,2,7,9}, sum=0;
		boolean ignore = false;
		for(int i : arr) {
			if(i==6)
				ignore = true;
			if(!ignore)
				sum+=i;
			if(i == 7)
				ignore=false;
		}
		System.out.println("Sum of elements " + sum);
	}

}


//------- P. Hemanth 21K61A1240