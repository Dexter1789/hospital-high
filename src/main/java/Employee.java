import java.util.HashMap;

public abstract class Employee {
	
	private String name;
	private String position;
	private int salary;
	private String idnum;

	private HashMap<String, Employee> employeeList = new HashMap<String, Employee>();
	
	Employee doctor = new Doctor( "Dr. Jefferson", "Doctor", 90000, "1111");
	Employee surgeon = new Surgeon("Dr. Smith" , "Surgeon", 120000, "2222");
	Employee nurse = new Nurse("Bob RN" , "Nurse", 45000, "3333");
	Employee receptionist = new Receptionist("Doni", "Receptionist", 45000, "4444");
	Employee janitor = new Janitor("Tony", "Janitor", 40000, "5555");
	Employee vampireJanitor = new VampireJanitor("Goodman", "VampireJanitor", 40000, "6666");
	
	public Employee(String name, String position, int salary, String idnum) {
		this.name = name;		
		this.position = position;
		this.salary = salary;
		this.idnum = idnum;
	}

	public String getPosition() {
		return position;
	}

	public int calculatePay(){
		return getSalary();		
	}

	public int getSalary() {
		return salary;
	}










}
