

public abstract class Employee {
	
	private String name;
	private String idnum;
	
	
	
	public Employee(String name, String idnum) {
		this.name = name;			
		this.idnum = idnum;
	}
	


	

	public abstract int calculatePay();

	public String getName() {
		return name;
	}
	public String getId() {
		return idnum;
	}

	@Override
	public String toString() {
		return "";
		
	}



//	public void addEmployee(Employee doctor) {
//		// TODO Auto-generated method stub
//		
//	}
	
	



	











}
