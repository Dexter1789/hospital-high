import java.util.HashMap;



public class Hospital {
	
	
	public int patientHealth;
	public int bloodLevel;
	
	


	private HashMap<String, Employee> employees = new HashMap<String, Employee>();
	private HashMap<String, Patient> patients = new HashMap<String, Patient>();
	
	

	public Hospital() {
		
	}
	
	public HashMap<String, Employee> getEmployees() {
		return employees;
	}

	public HashMap<String, Patient> getPatients() {
		return patients;
	}
	

	
	public void patientCare() {
		// TODO Auto-generated method stub

	}



	public void addEmployee(Employee employeeToAdd) {
		employees.put(employeeToAdd.getName(), employeeToAdd);
	}
	public void addPatient(Patient patientToAdd) {
		patients.put(patientToAdd.getName(), patientToAdd);
	}
//	public void getAllPatients() {
//
//	}
//	public void workAllEmployees() {
//		for(Employee employee : getAllEmployees().values()) {
//			if (employee instanceof PatientCareEmployee) {
//				((PatientCareEmployee) employee).care();
//			}
//			if (employee instanceof Janitor) {
//				((Janitor) employee).Clean();
//			
//			}
//		}
//	}

}