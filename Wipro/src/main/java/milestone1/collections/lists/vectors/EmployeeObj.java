package milestone1.collections.lists.vectors;

public class EmployeeObj {
		private int id;
		private String name;
		private String address;
		private Double salary;
		
		public EmployeeObj(int id, String name, String address, Double salary) {
			this.id = id;
			this.name = name;
			this.address = address;
			this.salary = salary;
		}	

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
		}
	
}
