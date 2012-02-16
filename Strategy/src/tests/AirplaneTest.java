/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import vehicles.Airplane;
import vehicles.FFJ;
import vehicles.Flying;
import vehicles.ModelAirPlane;

/**
 * @author oded
 *
 */
public class AirplaneTest {

	@Test
	public void test() {
				
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
		Flying fly = new FFJ();

		Airplane classUnderTest = new Airplane(1,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !",  stringReturned, expectedOutput);

		}

	@Test
	public void test2() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;

		Airplane classUnderTest = new Airplane(1);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !",  stringReturned, expectedOutput);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;
		
		Flying fly = new ModelAirPlane();

		Airplane classUnderTest = new Airplane(1,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !",  stringReturned, expectedOutput);

		}


}
