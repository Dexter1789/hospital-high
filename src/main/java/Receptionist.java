
public class Receptionist extends Employee {
	
	private Boolean onPhone;
	

	public Receptionist(String name, String idnum, String position, Boolean onPhone) {
		super(name, idnum, position);
		this.onPhone = false;
	}

	public void toggleisOnPhone() {
		this.onPhone = !this.onPhone;
	}
	
	public Boolean onPhone() {
		return onPhone;
		
	}
@Override
public int calculatePay() {

	return 45000;

	}

public void stats() {
	super.stats();

	System.out.println("Current Call Status: " + onPhone + "\n");
}


}
