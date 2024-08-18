/*
 *  Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
 */
package milestone1.javafundamentals.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 34, 12, 45, 67, 89}, n = arr.length;
		int j=0, temp[] = new int[n] ;
		boolean b = false;
		for(int i=0; i<arr.length; i++) {
			b=false;
			for(int k=0; k<j; k++) {
				if(arr[i] == arr[k]) {
					b=true;
					break;
				}
			}
			if(!b) {
				temp[j++] = arr[i];
			}
		}
		
		for (int i = 0; i<j; i++)
			System.out.print(temp[i] + " ");
		System.out.println();
	}

}

//-------------------------- P. Hemanth 21K61A1240
