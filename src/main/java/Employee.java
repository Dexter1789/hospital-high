import java.util.HashMap;

public abstract class Employee{
	
	private String name;
	private String idnum;
	private int patientHealth;
	private int bloodLevel;

	private HashMap<String, Employee> employeeList = new HashMap<String, Employee>();
	
	Employee doctor = new Doctor( "Dr. Jefferson", "1111", "Cardiology");
	Employee surgeon = new Surgeon("Dr. Smith","2222", "Cardiothoracic", false);
	Employee nurse = new Nurse("Bob RN","3333");
	Employee receptionist = new Receptionist("Doni", "4444", false);
	Employee janitor = new Janitor("Tony", "5555", false);
	Employee vampireJanitor = new VampireJanitor("Goodman", "6666", false, true);
	
	public Employee(String name, String idnum) {
		this.name = name;			
		this.idnum = idnum;
	}

	public int getPatientHealth() {
		return patientHealth;
	}
	public int getBloodLevel() {
		return bloodLevel;
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
		return();
		
	}
	
	



	











}
