package milestone1.abstractionAndPackages.exceptions.registration;
import java.util.Scanner;
public class UserRegistration {
	public void registerUser(String name, String country){
		try {
			if(country.equals("India"))
				System.out.println("User Registration done successfully.");
			else
				throw new InvalidCountryException("User Outside India cannot be registered.");
		}
		catch(InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, country;
		System.out.print("Enter name and country: ");
		name = sc.next();
		country = sc.next();
		UserRegistration ur = new UserRegistration();
		ur.registerUser(name, country);
		sc.close();
	}

}
