

public class Doctor extends Employee{

	private String specialty;
	
	public Doctor(String name, String idnum, String specialty) {
		super(name, idnum);
		this.specialty = specialty;
	}
	public int getPatientHealth() {
		return patientHealth;
	}
	public int getBloodLevel() {
		return bloodLevel;
	}
	public void careForPatient() {
		patientHealth += 10;
		bloodLevel += 10;
	}
	public void drawBlood() {
		bloodLevel -= 10;
	}
	public String getSpecialty() {
		return specialty;
	}

	@Override
	public int calculatePay() {
	
		return 90000;
	}




	





}

