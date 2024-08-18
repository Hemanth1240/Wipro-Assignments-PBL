/*
 * Create a Collection called TreeSet which is capable of storing String objects. 
 * Then try these following operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.
 */
package milestone1.collections.sets;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetCollection {
	TreeSet<String> ts = new TreeSet<>();
	public void addObject(String obj) {
		ts.add(obj);
	}
	public void allObjects() {
		Iterator<String> it = ts.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public boolean isPresent(String empName) {
		Iterator<String> it = ts.descendingIterator();
		while(it.hasNext()) {
			if(it.next().equals(empName))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSetCollection tsc = new TreeSetCollection();
		tsc.addObject("Hemanth");
		tsc.addObject("Bhavani");
		tsc.addObject("Shankar");
		tsc.allObjects();
		if(tsc.isPresent("Hemanth"))
			System.out.println("Employee details are present.");
		else
			System.out.println("Employee details are not present.");
	}

}
