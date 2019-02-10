import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;


public class DoctorTest {
	Doctor underTest;
	Patient patientUnderTest;
	
	@Before
	public void setup() {
	 underTest =  new Doctor("Dr. Phillips", "2222", "Heart");
	 patientUnderTest = new Patient("Dave", 10, 20);
}

	@Test
	public void shouldCareForPatient() {
		int bloodLevelBeforeCare = patientUnderTest.getBloodLevel();
		int healthBeforeCare = patientUnderTest.getHealth();
		((Doctor) underTest).careForPatient(patientUnderTest);
		int bloodLevelAfterCare = patientUnderTest.getBloodLevel();
		int healthAfterCare = patientUnderTest.getHealth();
		assertEquals(bloodLevelBeforeCare + 2, bloodLevelAfterCare);
		assertEquals(healthBeforeCare + 1, healthAfterCare);
		}
	@Test
	public void shoudlDrawBlood() {
		int bloodLevelBeforeCare = patientUnderTest.getBloodLevel();
		((Doctor) underTest).bloodDraw(patientUnderTest);
		int bloodLevelAfterCare = patientUnderTest.getBloodLevel();
		assertEquals(bloodLevelBeforeCare - 2, bloodLevelAfterCare);
	}

	@Test
	public void shouldGetSpecialty() {
		((Doctor) underTest).getSpecialty();
		assertEquals("Heart", ((Doctor)underTest).getSpecialty());
	}
}
