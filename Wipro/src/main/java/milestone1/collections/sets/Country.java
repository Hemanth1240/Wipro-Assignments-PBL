/*
 * Develop a java class with a instance variable H1 (HashSet) 
 *  add a method saveCountryNames(String CountryName) ,
 *   the method should add the passed country to a HashSet (H1) and
 *    return the added HashSet(H1).
Develop a method getCountry(String CountryName) 
which iterates through the HashSet and 
returns the country if exist else return null. 
NOTE: You can test the methods using a main method.
 */
package milestone1.collections.sets;
import java.util.HashSet;
import java.util.Iterator;
public class Country {
	HashSet<String> H1 = new HashSet<>();
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


//------------------------------- P. Hemanth 21K61A1240
