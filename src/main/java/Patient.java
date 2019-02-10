import java.util.HashMap;



public class Patient{
	
	private String patientName;
	
	private int health;
	private int bloodLevel;

	private HashMap<String, Patient> patientList = new HashMap<String, Patient>();

	public Patient(String patientName, int health, int bloodLevel) {
		this.patientName = patientName;
		
		this.health = 10;
		this.bloodLevel = 20;

	
	}
	






	public int getHealth() {
		return health;
		
	}

	public int getBloodLevel() {
		return bloodLevel;
	}


	public void addPatient(Patient patient) {
		
	}



	public String getName() {
		// TODO Auto-generated method stub
		return patientName;
	}

}
