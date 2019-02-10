import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PatientTest {
	
	Patient underTest;
	
	@Before
	public void setup() {
		underTest = new Patient("Bob", 10, 20);
		
	}

	@Test
	public void shouldGetHealth() {
		int expected = underTest.getHealth();
		assertEquals(expected, 10);
	
	}
	@Test
	public void patientShouldHaveName() {
		String expected = underTest.getPatientName();
		assertEquals(expected, "Bob");
	}
	@Test
	public void shouldGetBloodLevel() {
		int expected = underTest.getBloodLevel();
		assertEquals(expected, 20);
	}
	
}
