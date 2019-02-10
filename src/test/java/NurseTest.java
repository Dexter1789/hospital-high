import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NurseTest {
	
	Employee underTest;
	Patient patientUnderTest;
	
	@Before
	public void setup() {
		underTest = new Nurse("Jackie", "2222");
		patientUnderTest = new Patient("Dude", 10, 20);
	}

	@Test
	public void shouldCareForPatient() {
		int bloodLevelBeforeCare = patientUnderTest.getBloodLevel();
		int healthBeforeCare = patientUnderTest.getHealth();
		((Nurse) underTest).careForPatient(patientUnderTest);
		int bloodLevelAfterCare = patientUnderTest.getBloodLevel();
		int healthAfterCare = patientUnderTest.getHealth();
		assertEquals(bloodLevelBeforeCare + 2, bloodLevelAfterCare);
		assertEquals(healthBeforeCare + 1, healthAfterCare);
	}

	@Test
	public void shoudlDrawBlood() {
		int bloodLevelBeforeCare = patientUnderTest.getBloodLevel();
		((Nurse) underTest).bloodDraw(patientUnderTest);
		int bloodLevelAfterCare = patientUnderTest.getBloodLevel();
		assertEquals(bloodLevelBeforeCare - 2, bloodLevelAfterCare);
	}
}
