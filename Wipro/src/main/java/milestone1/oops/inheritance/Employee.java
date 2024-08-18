package milestone1.oops.inheritance;

public class Employee extends Person{
	double annual_salary;
	int Year;
	String insuranceNo;
	public Employee(String name, double annual_salary, int year, String insuranceNo) {
		super(name);
		this.annual_salary = annual_salary;
		Year = year;
		this.insuranceNo = insuranceNo;
	}
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getInsuranceNo() {
		return insuranceNo;
	}
	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee [Name = " + name + ", annual_salary=" + annual_salary + ", Year=" + Year + ", insuranceNo=" + insuranceNo + "]";
	}
	
}
