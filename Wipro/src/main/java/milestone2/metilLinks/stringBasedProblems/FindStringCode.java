/*
 * If the given string is “WORLD WIDE WEB”
STEP1. In each word, find the Sum of the Difference between the first letter and
 the last letter, second letter and the penultimate letter, and so on till the center of the word.
WORLD = [W-D]+[O-L]+[R] = [23-4]+[15-12]+[18] = [19]+[3]+[18] = [40]
WIDE = [W-E]+[I-D] = [23-5]+[9-4] = [18]+[5] = [23]
WEB = [W-B]+[E] = [23-2]+[5] = [21]+[5] = [26]
STEP2. Concatenate the sums of each word to form the result
[40] [23] [26]
[402326]
The answer (output) should be the number 402326.
 */
package milestone2.metilLinks.stringBasedProblems;

public class FindStringCode {
	public int findStringCode(String input1) {
		input1 = input1.toUpperCase();
		String words[] = input1.split(" ");
		char first, last;
		String res="";
		int sum;
		for(String word : words) {
			int len = word.length();
			sum = 0;
			for(int i = 0; i < len/2; i++) {
				first = word.charAt(i);
				last = word.charAt(len - 1 -i);
				sum += Math.abs(first - last);
			}
			if(len%2 != 0)
				sum += (word.charAt(len/2) - 64);
			res += Integer.toString(sum);
		}
		return Integer.valueOf(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindStringCode fsc = new FindStringCode();
		System.out.println(fsc.findStringCode("World Wide Web"));
	}

}
