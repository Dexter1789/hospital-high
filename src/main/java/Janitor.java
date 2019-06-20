
public class Janitor extends Employee implements Sweeping{
	
	private Boolean isSweeping;
	
	public Janitor(String name, String idnum, String position, Boolean isSweeping) {
		super(name, idnum, position);
		
	
	}
	public Boolean getIsSweeping() {
		return isSweeping;
	}
	@Override
	public void toggleisSweeping() {
		this.isSweeping = !this.isSweeping;
	}


	@Override
	public int calculatePay() {
		
		return 40000;
	}

	@Override
	public String toString() {
		return("");
	}
	public void stats() {
		super.stats();
	
		System.out.println("Currently Sweeping: " + isSweeping + "\n");
	}
	public void setIsSweeping(Boolean isSweeping) {
		this.isSweeping = isSweeping;
	}
}
