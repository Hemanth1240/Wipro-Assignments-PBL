/*
 *  Given an array of type int, print true if every element is 1 or 4. 

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */
package milestone1.javafundamentals.arrays;

public class Element1Or4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 2, 4}, flag=0;
		for(int i : arr) {
			if(i!=1 && i!=4) {
				System.out.println("False");
				flag=1;
				break;
			}
			
		}
		if(flag == 0)
			System.out.println("True");
	}

}
 // ---------------------- P. Hemanth 21K61A1240