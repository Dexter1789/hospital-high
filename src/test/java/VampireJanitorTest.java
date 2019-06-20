import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VampireJanitorTest {
	
	Employee underTest;
	Patient patientUnderTest;
	
	@Before
	public void setup() {
		underTest = new VampireJanitor("Ted", "", "", false);
		patientUnderTest = new Patient("Bill", 10, 20);
	}

	@Test
	public void shoudlDrawBlood() {
		int bloodLevelBeforeCare = patientUnderTest.getBloodLevel();
		((VampireJanitor) underTest).bloodDraw(patientUnderTest);
		int bloodLevelAfterCare = patientUnderTest.getBloodLevel();
		assertEquals(bloodLevelBeforeCare - 2, bloodLevelAfterCare);
	}

}
