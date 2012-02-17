/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import vehicles.Airplane;
import vehicles.FFJ;
import vehicles.Flying;
import vehicles.IDLO;
import vehicles.ILH;
import vehicles.LiftOff;
import vehicles.IFLPP;
import vehicles.VLF;
import vehicles.IDontFly;

/**
 * @author oded
 *
 */
public class AirplaneTest {

	@Test
	public void test1() {
				
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
		Flying fly = new FFJ();
		LiftOff liftOff = new VLF();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	
	@Test
	public void test2() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;
		
		Flying fly = new IDontFly();
		LiftOff liftOff = new VLF();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;
		
		Flying fly = new IFLPP();
		LiftOff liftOff = new VLF();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	
	@Test
	public void test4() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;

		Flying fly = new FFJ();
		LiftOff liftOff = new VLF();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test5() {
				
		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;

		Flying fly = new FFJ();
		LiftOff liftOff = new IDLO();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	@Test
	public void test6() {
				
		String expectedOutput = "Horizontally";
		String stringReturned = null;

		Flying fly = new FFJ();
		LiftOff liftOff = new ILH();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}


}
