
public class Surgeon extends Employee {

	private Boolean isOperating;
	private String specialty;
	private int patientHealth;
	private int bloodLevel;
	
	public Surgeon(String name, String idnum, String specialty, Boolean isOperating) {
		super(name, idnum);
		this.specialty = specialty;
		this.isOperating = false;
	}
	
	public int getPatientHealth() {
		return patientHealth;
	}
	
	public int getBloodLevel() {
		return bloodLevel;
	}
	
	public void toggleOperating() {
		if(this.isOperating = !this.isOperating) {
			patientHealth += 20;
			bloodLevel -= 10;
		} else {
			this.isOperating = this.isOperating;
		}
	}

	public void careForPatient() {
		
	
		
	}
	public String getSpecialty() {
		return specialty;
	}
	@Override
	public int calculatePay() {
		
		return 120000;
	}
}
