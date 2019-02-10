
public class Surgeon extends Employee implements BloodDraw,  CareForPatient{

	
	private Boolean isOperating;
	private String specialty;
	
	public Surgeon(String name, String idnum, String specialty, Boolean isOperating) {
		super(name, idnum);
		this.specialty = specialty;
		this.isOperating = false;
	}
	

	
	public void toggleOperating(Patient patient) {
		this.isOperating = !this.isOperating;		
	}
		
	public Boolean isOperating() {
		return isOperating;
	}

	
	@Override
	public void careForPatient(Patient patient) {
		patient.increasesBloodLevelByTwo();
		patient.increasesHealthByOne();
		
	
	}
	public String getSpecialty() {
		return specialty;
	}
	@Override
	public int calculatePay() {
		
		return 120000;
	}



	



	@Override
	public void bloodDraw(Patient patient) {
	patient.decreasesBloodLevelByTwo();
		
	}
}
