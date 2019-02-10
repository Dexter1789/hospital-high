
public class Receptionist extends Employee {
	
	private Boolean onPhone;
	

	public Receptionist(String name, String idnum, Boolean onPhone) {
		super(name, idnum);
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




}
