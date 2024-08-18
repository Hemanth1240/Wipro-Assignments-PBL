package milestone1.abstractionAndPackages.abstraction;
import java.util.Random;
public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Compartment[] compartments = new Compartment[10];
        
        // Create a Random object
        Random rand = new Random();
        
        // Fill the array with random compartments
        for (int i = 0; i < 10; i++) {
            int type = rand.nextInt(4) + 1; // Generate a random number between 1 and 4
            switch (type) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }
        
        // Test the polymorphic behavior of the notice method
        for (Compartment compartment : compartments) {
            System.out.println(compartment.notice());
        }


	}

}
