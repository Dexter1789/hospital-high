
public class Nurse extends Employee {
	
	

	public Nurse(String name, String idnum) {
		super(name, idnum);
		
	}
	public int getPatientHealth() {
		return patientHealth;
	}
	public int getBloodLevel() {
		return bloodLevel;
	}
	public void careForPatient() {
		this.patientHealth += 2;
	}
	public void drawBlood() {
		this.bloodLevel += 5;
}
	@Override
	public int calculatePay() {
		// TODO Auto-generated method stub
		return 50000;
	}
}