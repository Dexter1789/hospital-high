
public class Surgeon extends Employee implements BloodDraw,  CareForPatient{

	
	private Boolean isOperating;
	private String specialty;
	
	public Surgeon(String name, String idnum, String position, String specialty, Boolean isOperating) {
		super(name, idnum, position);
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

	public void stats() {
		super.stats();
	
		System.out.println("Specialty: " + specialty + "\nCurrently Operating: " + isOperating + "\n");
	}

	



	@Override
	public void bloodDraw(Patient patient) {
	patient.decreasesBloodLevelByTwo();
		
	}
}
