import java.util.HashMap;



public class Patient{
	
	private String patientName;
	
	public int health;
	public int bloodLevel;

//	private HashMap<String, Patient> patientList = new HashMap<String, Patient>();

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
	public void bloodLevel(int bloodLevel) {
		this.bloodLevel = bloodLevel;
	}
	public void health(int health) {
		this.health = health;
	}

	public void addPatient(Patient patient) {
		
	}

	public void increasesHealthByOne() {
		this.health +=1;
	}
	public void decreasesHealthByOne() {
		this.health -=1;
	}
	public void increasesBloodLevelByTwo() {
		this.bloodLevel +=2;
	}
	public void decreasesBloodLevelByTwo() {
		this.bloodLevel -=2;
	}

	public String getPatientName() {
		// TODO Auto-generated method stub
		return patientName;
	}







	public void stats() {
		System.out.println("Patient Name: " + patientName + "\nPatient Health: " + health + "\nBlood Level " + bloodLevel +"\n");
		
	}

}
