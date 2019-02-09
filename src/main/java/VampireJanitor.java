
public class VampireJanitor extends Employee {

	private Boolean isSweeping;
	private Boolean isSuckingBlood;
	private int patientHealth;
	private int bloodLevel;

	public VampireJanitor(String name, String idnum, Boolean isSweeping, Boolean isSuckingBlood) {
		super(name, idnum);
		this.isSuckingBlood = true;
	}
	public Boolean getSuckingBlood() {
		return isSuckingBlood;
		
	}
	public int getPatientHealth() {
		return patientHealth;
	}
	public int getBloodLevel() {
		return bloodLevel;
	}
	public void suckingBlood() {
		if(this.isSuckingBlood = true) {
		this.bloodLevel -= 5;
		this.patientHealth -= 2;
		} else {
			this.isSuckingBlood = !this.isSuckingBlood;
		}
	}
	public Boolean getIsSweeping() {
		return isSweeping;
	}

	public void toggleisSweeping() {
		this.isSweeping =!this.isSweeping;
	}
	@Override
	public int calculatePay() {
		
		return 40000;
	}
	
}
