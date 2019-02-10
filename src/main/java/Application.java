import java.util.Scanner;

public class Application {
	
	

	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Hospital hospital = new Hospital();
		
		
		hospital.addEmployee((Employee)new Doctor("Dr. Jefferson", "1111", "Cardiology"));
		hospital.addEmployee((Employee)new Surgeon("Dr. Smith","2222", "Cardiothoracic", false));
		hospital.addEmployee((Employee)new Nurse("Bob RN","3333"));
		hospital.addEmployee((Employee)new Receptionist("Doni", "4444", false));
		hospital.addEmployee((Employee)new Janitor("Tony", "5555", false));
		hospital.addEmployee((Employee)new VampireJanitor("Goodman", "6666", false, true));
		
		hospital.addPatient(new Patient("Jenn", 10, 20));
		hospital.addPatient(new Patient("Ariana Nacho Grande", 10, 20));
		hospital.addPatient(new Patient("Kesha", 10, 20));
		hospital.addPatient(new Patient("Ted Dansen", 10, 20));
		hospital.addPatient(new Patient("Sarah Sliverman", 10, 20));
		hospital.addPatient(new Patient("John Candy", 10, 20));
		hospital.addPatient(new Patient("Jeff Bezos", 10, 20));
		hospital.addPatient(new Patient("Bill Cosby", 10, 20));
		
		hospital.getEmployees();
		hospital.getPatients();
		
		
}

	
	
	




}
