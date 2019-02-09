import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;


public class DoctorTest {
	Doctor underTest;
	
	
	@Before
	public void setup() {
	 underTest =  new Doctor("Dr. Phillips", 90000);
		
}

	@Test
	public void shouldCareForPatient() {
		
		
		Doctor underTest = null;
		int patientHealthBeforeCare = underTest.GetPatientHealth();
		underTest.careForPatient();
		int patientHealthAfterCare = underTest.GetPatientHealth();
		assertEquals(patientHealthBeforeCare +20, patientHealthAfterCare);
	}

}
