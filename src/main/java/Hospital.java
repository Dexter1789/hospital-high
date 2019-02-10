import java.util.HashMap;



public class Hospital {
	
//	
//	public int patientHealth;
//	public int bloodLevel;
	private int allEmployees;
	private int allPatients;
	


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
	

	




	public void addEmployee(Employee employeeToAdd) {
		employees.put(employeeToAdd.getName(), employeeToAdd);
	}
	public void addPatient(Patient patientToAdd) {
		patients.put(patientToAdd.getPatientName(), patientToAdd);
	}
	
	public void removeEmployee(String name) {
		employees.remove(name);

	}
	public void removePatient(String patientName) {
		patients.remove(patientName);

	}
	
	public void listAllPatients() {
		
	}
	public void patientStats() {
		
	}
	public void patientCare() {
		
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

	public int getEmployeesLength() {
		// TODO Auto-generated method stub
		return employees.size();
	}

	public int getPatientsLength() {
		// TODO Auto-generated method stub
		return patients.size();
	}

	public void removeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

}