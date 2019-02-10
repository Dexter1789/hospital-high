import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	Employee underTest;
	
	@Before
	public void setup() {
		underTest = new Doctor("Jeff", "1111", "Brain");
		
	}
	
	@Test
	public void employeeShouldHaveName() {
		String expected = underTest.getName();
		assertEquals(expected, "Jeff");
		
	}
	@Test
	public void employeeShouldHaveID() {
		String expected = underTest.getId();
		assertEquals(expected, "1111");
	}
	@Test 
	public void shouldCalculatePay() {
		int expected = underTest.calculatePay();
		assertEquals(expected, 90000);
	}

}
