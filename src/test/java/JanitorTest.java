import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JanitorTest {
	
	Employee underTest;
	
	@Before
	public void setup() {
	 underTest = new Janitor("Ted", "5555", false);
	}
	@Test
	public void shouldSweep() {
	((Janitor)underTest).toggleisSweeping();
	Boolean isSweeping = ((Janitor)underTest).getIsSweeping();
	assertEquals(true, isSweeping);
		
		
	}

}
