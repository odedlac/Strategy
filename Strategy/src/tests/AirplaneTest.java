/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import vehicles.Airplane;
import vehicles.FFJ;
import vehicles.Flying;
import vehicles.IDontLiftOff;
import vehicles.ILiftOffH;
import vehicles.LiftOff;
import vehicles.IFlyLikePP;
import vehicles.ILiftOffV;
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
		LiftOff liftOff = new ILiftOffV();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	
	@Test
	public void test2() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;
		
		Flying fly = new IDontFly();
		LiftOff liftOff = new ILiftOffV();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;
		
		Flying fly = new IFlyLikePP();
		LiftOff liftOff = new ILiftOffV();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	
	@Test
	public void test4() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;

		Flying fly = new FFJ();
		LiftOff liftOff = new ILiftOffV();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test5() {
				
		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;

		Flying fly = new FFJ();
		LiftOff liftOff = new IDontLiftOff();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	@Test
	public void test6() {
				
		String expectedOutput = "Horizontally";
		String stringReturned = null;

		Flying fly = new FFJ();
		LiftOff liftOff = new ILiftOffH();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}


}
