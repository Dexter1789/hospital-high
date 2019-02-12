import java.util.Scanner;
import java.util.HashMap;
public class Application {



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Hospital hospital = new Hospital();
	

		hospital.addEmployee((Employee) new Doctor("Dr. Jefferson", "1111", "Doctor", "Cardiology"));
		hospital.addEmployee((Employee) new Surgeon("Dr. Smith", "2222", "Surgeon", "Cardiothoracic", false));
		hospital.addEmployee((Employee) new Nurse("Bob RN", "Nurse", "3333"));
		hospital.addEmployee((Employee) new Receptionist("Doni", "4444", "Receptionist", false));
		hospital.addEmployee((Employee) new Janitor("Tony", "5555", "Janitor", false));
		hospital.addEmployee((Employee) new VampireJanitor("Goodman", "6666", "Vampire Janitor", false));

		hospital.addPatient(new Patient("Jenn", 10, 20));
		hospital.addPatient(new Patient("Ariana Nacho Grande", 10, 20));
		hospital.addPatient(new Patient("Kesha", 10, 20));
		hospital.addPatient(new Patient("Ted Dansen", 10, 20));
		hospital.addPatient(new Patient("Sarah Sliverman", 10, 20));
		hospital.addPatient(new Patient("John Candy", 10, 20));
		hospital.addPatient(new Patient("Jeff Bezos", 10, 20));
		hospital.addPatient(new Patient("Bill Cosby", 10, 20));


	

		String intro = ("Employee type \n"
				+ "At High Street Hospital we have Dr. Jefferson, he's a Cardiologist, Dr. Smith, she's a surgeon, and not very nice., Bob RN, he's kind of disorganized., Doni the receptionist, she sleeps a lot, Tony the head janitor, he has no tolerance for foolishness, and Goodman the Vampire Janitor, let's just say the staff doesn't talk about it. \n"
				+ "Choose an employee and care for your patients, but look out! Not all is as it seems.");
//		private static String (userPatientCare);
//		private static String (patientCareList);
		
				System.out.println("Please choose your employee from the following list:");
				hospital.getAllEmployeeStats();
				hospital.getAllPatientStats();
	
			/*
			 * if (!patientCareList.contains(asList)) {
			 * System.out.println("Please choose from list:");
			 * System.out.println("1. draw blood"); System.out.println("2. surgery");
			 * System.out.println("3. give medicine"); System.out.println("4. heal");
			 * 
			 * Object input;
			 * 
			 * 
			 * } return userPatientCare;
			 */
	}


//			System.out.println("This is High St. Hospital. Choose an employee, and care for your patients, and keep an eye on Goodman.");
//		    
//		    boolean repeatMainMenu = true;
//		
//		    while (repeatMainMenu) {
//		}
//		    System.out.println("Please choose from the list:");
//		    System.out.println("Choose menu item by typing in number: ");
//		    System.out.println("1. Patient Stats.");
//		    System.out.println("2. Employee Stats");
//		    System.out.println("3. Draw blood.");
//		    System.out.println("4. Surgery");
//		    System.out.println("5. Give medicine");
//		    System.out.println("6. Heal");
//		    System.out.println("7. Clean");
//		    System.out.println("8. Garlic");
//		    System.out.println("9. Exit");
//		    
//		    String mainMenuChoice = input.nextLine();
//		
//		    switch (mainMenuChoice) {
//		    
//		    case "1":
//		
//		        System.out.println("You've chosen item #1");
//		        System.out.println("1. Patient names, ID numbers, and health");
//		        String patientStatChoice = input.nextLine();
//		        Object userInput = null;
//		        if (userInput.equals ("8"))
//		            System.out.println("Gotta stop Goodman again");
//		        break;
//		
//		
//		    case "2":
//		        System.out.println("You've chosen item #2");
//		        System.out.println("Which stats would you like to see?");
//		        System.out.println("1. Employee names, ID numbers, jobs, and salaries.");
//		        
//		
//		        String employeeStatChoice = input.nextLine();
//		
//		        if (employeeStatChoice.equals("1")) {
//		            for (Employee employee : hospital.getEmployees().values()) {
//		                System.out.println(employee.toString());
//		            }
//		        break;
//		
//		        }
//		    case "3":
//		
//		        boolean repeatCareAllMenu = true;
//		        
//		        while (repeatCareAllMenu) {
//		        
//		            System.out.println("You've chosen item #3");
//		            System.out.println(" 1. - Draw blood from one patient");
//		            System.out.println(" 2. - Draw blood from all patients");
//		            userInput = input.nextLine();
//		            
//		            switch (userInput) {
//		                
//		        
//		            
//		            
//		            case "1":
//		                for (Patient patient : hospital.getPatients().values()) {
//		                    System.out.println(patient.toString());
//		                    nurse.drawBlood(patient);
//		                    System.out.println(patient.toString());
//		                }
//		                break;
//		            
//		            case "2":
//		            
//		    }
//		    }
		    



}