import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReceptionistTest {

	Employee underTest;
	
	@Before
	public void setup() {
		underTest = new Receptionist("Nancy", "3333", null, false);
	}
	@Test
	public void shouldTakeCalls() {
		((Receptionist)underTest).toggleisOnPhone();
		Boolean isOnPhone = ((Receptionist)underTest).onPhone();
		assertEquals(true, isOnPhone);
	}

}
