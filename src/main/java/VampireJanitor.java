
public class VampireJanitor extends Janitor implements BloodDraw {





	public VampireJanitor(String name, String idnum, Boolean isSweeping) {
		super(name, idnum, isSweeping);
		
	}



	@Override
	public int calculatePay() {
		
		return 40000;
	}
	@Override
	public void bloodDraw(Patient patient) {
		patient.decreasesBloodLevelByTwo();
		
	}
	
}
