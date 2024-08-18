package milestone1.collections.sets;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetImpl {

	TreeSet<String> H1 = new TreeSet<>();
	public void setCountryName(String countryName){
		H1.add(countryName);
	}
	public String getCountry(String countryName) {
		Iterator<String> it = H1.iterator();
		while(it.hasNext()) {
			if(it.next().equals(countryName))
				return countryName;
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c = new Country();
		c.setCountryName("India");
		c.setCountryName("India");
		c.setCountryName("US");
		c.setCountryName("Australia");
		System.out.println("India: " + c.getCountry("India"));
		System.out.println("Pakisthan: " + c.getCountry("Pakisthan"));

	}


}
