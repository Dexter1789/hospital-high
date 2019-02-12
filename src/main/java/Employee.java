
public abstract class Employee {

	private String name;
	private String idnum;
	private String position;

	public Employee(String name, String idnum, String position) {
		this.name = name;
		this.idnum = idnum;
		this.position = position;
	}

	public abstract int calculatePay();

	public String getName() {
		return name;
	}

	public String getId() {
		return idnum;
	}
	public String getPosition() {
		return position;
	}
	@Override
	public String toString() {
		return "";

	}
	public void stats() {
		System.out.println("Employee Name: " + name + "\nEmployee ID: " + idnum + "\nPosition: " + position);
		
	}

}
