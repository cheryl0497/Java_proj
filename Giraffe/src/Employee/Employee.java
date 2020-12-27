package Employee;

public class Employee {
	private int id;
	private String ename;
	private String designation;
	private static int count = 0;
	
	public Employee() {
		this.id = 0;
		this.ename = null;
		this.designation = null;
	}
	
	public Employee(int id, String ename, String designation) {
		this.id = id;
		this.ename = ename;
		this.designation = designation;
		count++;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", Employee name=" + ename + ", Employee designation=" + designation + "";
	}
	
	public static void main(String[] args) {
		Employee cheryl = new Employee(22,"Cheryl", "Developer");
		System.out.println(cheryl);
		System.out.printf("Employee count = "+count);
		System.out.println();
		
		Employee martina = new Employee(55,"Martina", "Accounts");
		System.out.println(martina);
		System.out.printf("Employee count = "+count);
		System.out.println();
		
		Employee kyler = new Employee(23,"Kyler", "Sales");
		System.out.println(kyler);
		System.out.printf("Employee count = "+count);
		System.out.println();
		
		Employee jade = new Employee(26,"Jade", "Architect");
		System.out.println(jade);
		System.out.printf("Employee count = "+count);
		System.out.println();
	}
	
	
}