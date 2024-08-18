/*
 * Write a class MathOperation which accepts 5 integers through command line. 
 * Create an array using these parameters. 
 * Loop through the array and obtain the sum and average of all the elements and 
 * display the result. 

Various exceptions that may arise like ArithmeticException, 
NumberFormatException, and so on should be handled.
 */
package milestone1.abstractionAndPackages.exceptions;

public class MathOperation {

    public static void main(String[] args)  {
        if (args.length == 5) {
            int[] array = new int[args.length];
            int sum = 0;
            double avg = 0;
            try {
                for (int i = 0; i < args.length; i++)
                    array[i] = Integer.parseInt(args[i]);
                for (int i = 0; i < array.length; i++)
                    sum += array[i];
                avg = (double) sum / array.length; // Cast to double for proper average calculation
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("sum: " + sum);
            System.out.println("avg: " + avg);
        } else {
            System.out.println("Enter 5 integers in command line");
        }
    }
}
