import java.util.HashMap;

public class Hospital {


	private HashMap<String, Employee> employees;


	public Hospital(HashMap<String, Employee> employees) {
		this.employees = employees;
	}

	public int GetPatientHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void patientCare() {
		// TODO Auto-generated method stub

	}

	public HashMap<String, Employee>getAllEmployees() {
		return employees;
	

	}

//	public void getAllPatients() {
//
//	}
	public void workAllEmployees() {
		for(Employee employee : getAllEmployees().values()) {
			if (employee instanceof PatientCareEmployee) {
				((PatientCareEmployee) employee).care();
			}
			if (employee instanceof SecondaryEmployee) {
				((SecondaryEmployee) employee).task();
			
			}
		}
	}
}
