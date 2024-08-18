package milestone1.collections.maps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
public class StateCapitals {
	HashMap<String, String> hm = new HashMap<>();
	public void addElements(String countryName, String capitalName) {
		hm.put(countryName, capitalName);
	}
	public String getCapital(String countryName) {
		return hm.get(countryName);
	}
	public String getCountryName(String captialName) {
		Set<Entry<String, String>> set = hm.entrySet();
		
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()) {
			Entry<String, String> e = it.next();
			if(e.getValue().equals(captialName))
				return e.getKey();
		}
		return null;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
