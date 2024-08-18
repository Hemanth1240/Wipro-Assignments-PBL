package milestone1.collections.lists.employeeDB;
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeDB {
	ArrayList<Employee> empDB = new ArrayList<>();
	public boolean addEmployee(Employee e) {
		return empDB.add(e);
	}
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		Iterator<Employee> it = empDB.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			if(emp.getEmpId() == empId) {
				it.remove();
				isRemoved = true;
			}
		}
		return isRemoved;
	}
	public String showPaySlip(int empId) {
		Iterator<Employee> it = empDB.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			if(empId == emp.getEmpId()) {
				return "Pay Slip for " + empId + " is " + emp.getSalary();
			}
		}
		return "Invalid Employee Id";
	}
	public Employee[] allEmployeeDetails() {
		Employee[] empArray = new Employee[empDB.size()];
		for(int i = 0; i < empDB.size(); i++) {
			empArray[i] = empDB.get(i);
		}
		return empArray;
	}

}
