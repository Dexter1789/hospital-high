
import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {

	Hospital underTest;
	Employee doctor;
	Employee surgeon;
	Patient patient1;
	Patient patient2;

	@Before
	public void setup() {
		underTest = new Hospital();
		doctor = new Doctor("Steve", "1111", "Heart");
		surgeon = new Surgeon("Bill", "2222", "Leg", false);
		patient1 = new Patient("Megan", 10, 10);
		patient2 = new Patient("Tim", 10, 10);
	}

	@Test
	public void shouldAddPatientsAndEmployeesToHospital() {
		int initialEmployees = underTest.getEmployeesLength();
		int initialPatients = underTest.getPatientsLength();
		underTest.addEmployee(doctor);
		underTest.addPatient(patient1);
		int afterEmployees = underTest.getEmployeesLength();
		int afterPatients = underTest.getPatientsLength();
		assertEquals(initialEmployees + 1, afterEmployees);
		assertEquals(initialPatients + 1, afterPatients);
	}

	@Test
	public void shouldRemovePatientsAndEmployeesToHospital() {
		underTest.addEmployee(doctor);
		underTest.addPatient(patient1);
		int initialEmployees = underTest.getEmployeesLength();
		int initialPatients = underTest.getPatientsLength();
		underTest.removeEmployee("Steve");
		underTest.removePatient("Megan");
		int afterEmployees = underTest.getEmployeesLength();
		int afterPatients = underTest.getPatientsLength();
		assertEquals(initialEmployees - 1, afterEmployees);
		assertEquals(initialPatients - 1, afterPatients);
	}

}
