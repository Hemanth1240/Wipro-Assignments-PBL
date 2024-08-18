/*
 * Write a program to find the biggest number in a 3*3 array. 
 * The program is supposed to receive 9 integer numbers as command line arguments.


Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P: 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
 */
package milestone1.javafundamentals.arrays;

public class Reverse3By3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 9) {
			System.out.println("Please enter 9 integer numbers");
		}
		else {
			int arr[][] = new int[3][3], index=0, max=Integer.MIN_VALUE;
			System.out.println("Original Array is ");
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					arr[i][j] = Integer.valueOf(args[index++]);
					System.out.print(arr[i][j] + " ");
					if(arr[i][j] > max)
						max= arr[i][j];
				}
				System.out.println();
			}
			System.out.println("Maximum element is " + max);
		}
	}

}

//---------------------------- P. Hemanth 21K61A1240