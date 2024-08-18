/*
 *  Given 2 int arrays, a and b, each length 3, form a new array of length 2
 *  , containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */

package milestone1.javafundamentals.arrays;

public class MiddleWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3}, brr[] = {4, 5, 6}, crr[] = new int[2];
		crr[0] = arr[3/2];
		crr[1] = brr[3/2];
		for (int i : crr)
			System.out.print(i + " ");
		System.out.println();
	}

}
