

public class Doctor extends Employee implements CareForPatient, BloodDraw{

	private String specialty;
	
	public Doctor(String name, String idnum, String specialty) {
		super(name, idnum);
		this.specialty = specialty;
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
	public String getSpecialty() {
		return specialty;
	}

	@Override
	public int calculatePay() {
	
		return 90000;
	}




	





}

