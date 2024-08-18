package milestone1.ioStreams.ioOperations;

import java.io.*;
import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter Character to be counted: ");
        char c = sc.next().charAt(0);
        c = Character.toLowerCase(c); 

        File file = new File("input.txt");
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int ch;
            while ((ch = br.read()) != -1) {
                char currentChar = (char) ch; 
                currentChar = Character.toLowerCase(currentChar); 

                if (currentChar == c) {
                    charCount++;
                }
            }

            System.out.println("Character count of '" + c + "' in '" + fileName + "' is " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
        finally {
        	sc.close();
        }
    }
}
