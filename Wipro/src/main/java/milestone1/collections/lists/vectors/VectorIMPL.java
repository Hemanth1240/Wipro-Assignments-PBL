package milestone1.collections.lists.vectors;
import java.util.Iterator;
import java.util.Vector;
public class VectorIMPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<EmployeeObj> list = new Vector<>();
		
		list.add(new EmployeeObj(101, "Bob", "Pune", 20000.0));
		list.add(new EmployeeObj(102, "Alice", "Mumbai", 30000.0));
		list.add(new EmployeeObj(103, "John", "Bangalore", 25000.0));
		list.add(new EmployeeObj(104, "Anthony", "Hyderabad", 40000.0));
		
		Iterator<EmployeeObj> itr = list.iterator();
		while (itr.hasNext()) 
			System.out.println(itr.next());
	}

}
