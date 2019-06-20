import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SurgeonTest {
	
	Employee underTest;
	Patient patientUnderTest;
	
	@Before
	public void setup() {
		underTest = new Surgeon("Ted", "1111", "Heart", "Heart", null);
		patientUnderTest = new Patient("Bill", 10, 20);
	}

	@Test
	public void shouldCareForPatient() {
		int bloodLevelBeforeCare = patientUnderTest.getBloodLevel();
		int healthBeforeCare = patientUnderTest.getHealth();
		((Surgeon) underTest).careForPatient(patientUnderTest);
		int bloodLevelAfterCare = patientUnderTest.getBloodLevel();
		int healthAfterCare = patientUnderTest.getHealth();
		assertEquals(bloodLevelBeforeCare + 2, bloodLevelAfterCare);
		assertEquals(healthBeforeCare + 1, healthAfterCare);
		}
	@Test
	public void shoudlDrawBlood() {
		int bloodLevelBeforeCare = patientUnderTest.getBloodLevel();
		((Surgeon) underTest).bloodDraw(patientUnderTest);
		int bloodLevelAfterCare = patientUnderTest.getBloodLevel();
		assertEquals(bloodLevelBeforeCare - 2, bloodLevelAfterCare);
	}

	@Test
	public void shouldOperate() {
		((Surgeon) underTest).toggleOperating(patientUnderTest);
		Boolean isOperating = ((Surgeon)underTest).isOperating();
		assertEquals(true, isOperating);
		
	}
	@Test
	public void shouldGetSpecialty() {
		((Surgeon) underTest).getSpecialty();
		assertEquals("Heart", ((Surgeon)underTest).getSpecialty());
	}

}
