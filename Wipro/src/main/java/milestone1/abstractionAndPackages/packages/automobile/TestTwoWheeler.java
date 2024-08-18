package milestone1.abstractionAndPackages.packages.automobile;
import milestone1.abstractionAndPackages.packages.automobile.twowheeler.Hero;
import milestone1.abstractionAndPackages.packages.automobile.twowheeler.Honda;
public class TestTwoWheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("Hero i-smart 110 2s", "MP65MD5060", "Hemanth ", 90);
		System.out.println(hero.getModelName());
		System.out.println(hero.getOwnerName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getSpeed()+" kmph");
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda CB Hornet 160R", "M15FZ5101", "Hemanth ", 110);
		System.out.println(honda.getModelName());
		System.out.println(honda.getOwnerName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getSpeed()+" kmph");
		honda.cdplayer();	
	}

}