package milestone1.collections.sets;
import java.util.Iterator;
import java.util.HashSet;
public class Employee {
	HashSet<String> emp = new HashSet<>();
	public void addEmployee(String empName) {
		emp.add(empName);
	}
	public void empDetails() {
		Iterator<String> it = emp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.addEmployee("Hemanth");
		e.addEmployee("21K61A1240");
		e.empDetails();
	}

}
