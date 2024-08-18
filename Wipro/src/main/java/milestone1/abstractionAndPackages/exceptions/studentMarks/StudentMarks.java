package milestone1.abstractionAndPackages.exceptions.studentMarks;
import java.util.Scanner;
public class StudentMarks {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] studentNames = new String[2];
        int[][] marks = new int[2][3];
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();
            for (int j = 0; j < 3; j++) {
                while (true) {
                    try {
                        System.out.println("Enter marks for subject " + (j + 1) + " for " + studentNames[i] + ": ");
                        String input = sc.nextLine();
                        int mark = Integer.parseInt(input);
                        if (mark < 0) {
                            throw new NegativeMarksException();
                        }
                        if (mark > 100) {
                            throw new MarksOutOfRangeException();
                        }
                        marks[i][j] = mark;
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid integer.");
                    } catch (InvalidMarksException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }
            double average = sum / 3.0;
            System.out.println("Average marks for " + studentNames[i] + ": " + average);
        }

        sc.close();
	}

}
