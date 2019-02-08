import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoctorTest {
	
	Doctor underTest;
	
	@Before
	public void setup() {
		underTest = new Doctor("Dr. Phillips");
}
	@Test
	public void shouldCareForPatient() {
		Patient newPatient = new Patient("name, 0, 0", 0, 0);
		int patientHealthBeforeCare = underTest.GetPatientHealth();
		underTest.patientCare();
		int patientHealthAfterCare = underTest.GetPatientHealth();
		assertEquals(patientHealthBeforeCare +20, patientHealthAfterCare);
	}

}
