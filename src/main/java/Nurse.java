
public class Nurse extends Employee implements BloodDraw, CareForPatient {
	
	

	public Nurse(String name, String idnum) {
		super(name, idnum);
		
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.increasesBloodLevelByTwo();
		patient.increasesHealthByOne();
	}
	@Override
	public void bloodDraw(Patient patient) {
		patient.decreasesBloodLevelByTwo();
}
	@Override
	public int calculatePay() {
		// TODO Auto-generated method stub
		return 50000;
	}
}