package milestone1.collections.lists.employeeDB;

public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "Bob", "bob@gmail.com", "Male", 25000);
		Employee emp2 = new Employee(102, "Alice", "alice@rediffmail.com", "Female", 30000);
		Employee emp3 = new Employee(103, "John", "john@ymail.com", "Male", 20000);
		Employee emp4 = new Employee(104, "Anthony", "anthony@outlook.com", "Male", 50000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.allEmployeeDetails())
			emp.getEmployeeDetails();
		
		System.out.println();
		empDb.deleteEmployee(102);
		
		for (Employee emp : empDb.allEmployeeDetails())
			emp.getEmployeeDetails();
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(103));
	}

}
