/*
 Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
*/
package milestone1.javafundamentals.flowControl;

public class GenderPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = Integer.valueOf(args[1]);
		if(args[0].equals("Male") && (age >=1 && age <= 58))
			System.out.println("The Percentage is 8.4%.");
		else if(args[0].equals("Male") && (age >=59 && age <= 100))
			System.out.println("The Percentage is 10.5%.");
		else if(args[0].equals("Female") && (age >=1 && age <= 58))
			System.out.println("The Percentage is 8.2%.");
		else
			System.out.println("The Percentage is 9.2%.");
	}

}
//--------------- P. Hemanth 21K61A1240
