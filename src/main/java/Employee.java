import java.util.HashMap;

public abstract class Employee {
	
	private String name;
	private String idnum;
	public int patientHealth;
	public int bloodLevel;

	private HashMap<String, Employee> employeeList = new HashMap<String, Employee>();
	
	
	
	public Employee(String name, String idnum) {
		this.name = name;			
		this.idnum = idnum;
	}
	


	public void bloodLevel() {
		bloodLevel = 20;
	}
	public void patientHealth() {
		patientHealth = 10;
	}

	public abstract int calculatePay();

	public String getName() {
		return name;
	}
	public String getId() {
		return idnum;
	}

	@Override
	public String toString() {
		return "";
		
	}



	public void addEmployee(Employee doctor) {
		// TODO Auto-generated method stub
		
	}
	
	



	











}
