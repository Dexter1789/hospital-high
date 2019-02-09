
public abstract class PatientCareEmployee extends Employee{

	private int patientHealth;
	private int bloodLevel;
	public PatientCareEmployee(String name, String position, int salary, String idnum) {
		super(name, position, salary, idnum);
		this.patientHealth = 50;
		this.bloodLevel = 50;
	}

	public int getPatientHealth() {
		return patientHealth;
	}
	public int getBloodLevel() {
		return bloodLevel;
	}
	public void care() {
		patientHealth += 10;
		bloodLevel += 10;
		

	}
	
}
