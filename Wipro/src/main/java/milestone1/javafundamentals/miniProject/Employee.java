package milestone1.javafundamentals.miniProject;

public class Employee {
	public void getDetails(String args) {
		Object employee[][] = new Object[7][7];
		employee[0]= new Object[]{1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000};
		employee[1]= new Object[]{1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000};
		employee[2]= new Object[]{1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000};
		employee[3]= new Object[]{1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000};
		employee[4]= new Object[]{1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000};
		employee[5]= new Object[]{1006, "Suman", "01/01/2000", 'e', "Manufacturing", 20000, 8000, 3000};
		employee[6]= new Object[]{1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000};
		int salary=0, id=Integer.valueOf(args), flag=0;
		String designation="";
		for (Object[] row : employee) {
            if ((Integer) row[0] == id) {
            	flag=1;
                switch((char) row[3]) {
                	case 'e': salary=((Integer) row[5]+ (Integer) row[6] +20000) - (Integer) row[6];
                			designation="Engineer";
                			break;
                	case 'c': salary=((Integer) row[5]+ (Integer) row[6] +32000) - (Integer) row[6];
                			designation="Engineer";
                			break;
                	case 'k': salary=((Integer) row[5]+ (Integer) row[6] +20000) - (Integer) row[6];
                			designation="Engineer";
                			break;
                	case 'r': salary=((Integer) row[5]+ (Integer) row[6] +15000) - (Integer) row[6];
        					designation="Recepionist";
        					break;
                	case 'm': salary=((Integer) row[5]+ (Integer) row[6] +40000) - (Integer) row[6];
        					designation="Manager";
        					break;
                }
                System.out.println("Emp No.\tEmp Name\tDepartment\tDEsignation\tDesignation\tSalary");
                System.out.println((Integer) row[0]+"\t"+(String) row[1]+"\t"+(String) row[4] +"\t"+designation+"\t"+salary);
            }
        }
		if(flag == 0)
			System.out.println("Not Available");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.getDetails(args[0]);
	}
}
