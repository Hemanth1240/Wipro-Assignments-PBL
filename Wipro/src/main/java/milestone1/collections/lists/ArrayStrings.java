/*
 *  Create an ArrayList that can store only Strings. 
Create a printAll method that will print all the elements of the ArrayList using an Iterator.

 */
package milestone1.collections.lists;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayStrings {
	public void printAll(ArrayList<String> al) {
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Item 1");
		al.add("Item 2");
		al.add("Item 3");
		al.add("Item 4");
		ArrayStrings as = new ArrayStrings();
		as.printAll(al);
	}

}
