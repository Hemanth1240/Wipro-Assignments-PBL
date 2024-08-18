/*
 * Original array = {2, 5, 1, 7, 9, 3}
Encoded array = {7, 6, 8, 16, 12, 3}
First number in original array = 2
Sum of all numbers in original array = 27
 */
package milestone2.metilLinks.arrayBasedProblems;

public class SimpleEncodedArray {
	public class Result{
		public final int output1;
		public final int output2;

		public Result(int out1, int out2){
			output1 = out1;
			output2 = out2;
		}
	}
	
    public Result simpleEncodedArray(int[] input1,int input2){
		int[] res = new int[input2];
		res[input2 - 1] = input1[input2 - 1];
		int sum = res[input2 - 1];
		for (int i = input2 - 2; i >= 0; i--) {
			res[i] = input1[i] - res[i + 1];
			sum += res[i];
		}
        
		return new Result(res[0], sum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleEncodedArray sea = new SimpleEncodedArray();
		int arr[] = {7, 6, 8, 16, 12, 3};
		Result r = sea.simpleEncodedArray(arr, arr.length);
        System.out.println("First number in original array: " + r.output1);
        System.out.println("Sum of all numbers in original array: " + r.output2);
	}

}
