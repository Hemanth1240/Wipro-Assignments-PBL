/*  Initialize a character variable in a program and 

print 'Alphabhet' if the initialized value is an alphabhet, 

print 'Digit' if the initialized value is a number, and 

print 'Special Character', if the initialized value is anything else.
*/

package milestone1.javafundamentals.flowControl;

public class CharacterCheck {
    public static void main(String[] args) {
        char ch = '#';

        // Check and print the type of character
        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
  //---------------- P. Hemanth 21K61A1240