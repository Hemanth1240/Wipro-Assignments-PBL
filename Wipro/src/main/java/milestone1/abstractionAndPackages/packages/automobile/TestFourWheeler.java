package milestone1.abstractionAndPackages.packages.automobile;
import milestone1.abstractionAndPackages.packages.automobile.fourWheeler.Ford;
import milestone1.abstractionAndPackages.packages.automobile.fourWheeler.Logan;
public class TestFourWheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ford ford = new Ford("Ford Ecosport", "MP68MC6060", "Hemanth", 170);
		System.out.println(ford.getModelName());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.getSpeed()+" kmph");
		ford.gps();
		
		System.out.println();
		
		Logan logan = new Logan("Mahindra Logan", "M15FD5103", "Hemanth", 180);
		System.out.println(logan.getModelName());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.getSpeed()+" kmph");
		logan.tempControl();
	}

}
