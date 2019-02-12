
public class VampireJanitor extends Janitor implements BloodDraw, Sweeping {



	private Boolean isSweeping;

	public VampireJanitor(String name, String idnum, String position, Boolean isSweeping) {
		super(name, idnum, position, isSweeping);

		
	}
	@Override
	public void toggleisSweeping() {
		this.setIsSweeping(!this.getIsSweeping());
	}


	@Override
	public int calculatePay() {
		
		return 40000;
	}
	@Override
	public void bloodDraw(Patient patient) {
		patient.decreasesBloodLevelByTwo();
		
	}
	
	public void stats() {
		super.stats();
	
		System.out.println("Currently Sweeping: " + isSweeping + "\n");
	}
}
