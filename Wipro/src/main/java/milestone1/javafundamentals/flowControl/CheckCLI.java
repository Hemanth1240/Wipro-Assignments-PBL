// Write a program to check whether command line arguments are provided or not


package milestone1.javafundamentals.flowControl;

public class CheckCLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0)
			System.out.println("No Values Provided");
		else {
			for(String s : args)
				System.out.println(s+", ");
		}
			
	}

}


// ------------------- P. Hemanth 21K61A1240