
public class Janitor extends Employee {
	
	private Boolean isSweeping;
	
	public Janitor(String name, String idnum, Boolean isSweeping) {
		super(name, idnum);
		this.isSweeping = false;
	
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
