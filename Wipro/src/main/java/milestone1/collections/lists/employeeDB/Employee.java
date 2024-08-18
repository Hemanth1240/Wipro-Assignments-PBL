package milestone1.collections.lists.employeeDB;

public class Employee {
	int empId;
	String empName, email, gender;
	float salary;
	public Employee(int empId, String empName, String email, String gender, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public float getSalary() {
		return salary;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee [EmpId=" + empId + ", EmpName=" + empName + ", EmpEmail=" + email 
				+ ", EmpGender=" + gender + ", EmpSalary=" + salary + "]");
	}
	
}
