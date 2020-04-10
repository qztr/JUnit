package VendingMachine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import VendingMachine.VendingMachine.SelectionMenu;

public class VendingMachineTest2 {
	Drink drink = null;
	VendingMachine vend;

	@Before
	public void setUp() throws Exception {
		vend = new VendingMachine();
		//drink = new Drink();
	}

	@Test
	public void testSetAmountPaid() {
		fail("Not yet implemented");
	}

	@Test
	public void testPowerUpVendingMechine() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDisplayMenu() {
		
	}
	




	@Test
	public void testDisplayReturningCoinsTE() {
		int[] array = {0,0,0,1};
		assertEquals(array,vend.displayReturningCoins(2.0));
	}

	@Test
	public void testDisplayReturningCoinsTC() {
		int[] array = {1,0,0,0};
		assertEquals(array,vend.displayReturningCoins(0.2));
	}
	
	@Test
	public void testDisplayReturningCoinsOE() {
		int[] array = {0,0,1,0};
		assertEquals(array,vend.displayReturningCoins(1.0));
	}
	
	@Test
	public void testDisplayReturningCoinsFC() {
		int[] array = {0,1,0,0};
		assertEquals(array,vend.displayReturningCoins(0.5));
	}

	@Test
	public void testCalculateChange() {
		assertEquals(-2,vend.calculateChange(3, "OE"),2);
		assertEquals(-4.5,vend.calculateChange(5, "FC"),2);
		assertEquals(-1,vend.calculateChange(2.5, "OE"),2);
		
	}
	
	@Test
	public void testCalculateChange1() {
		assertEquals(-0.5,vend.calculateChange(2.5, "TE"),2);
	}
	
	@Test
	public void testCalculateChange2() {
		assertEquals(-2.3,vend.calculateChange(2.5, "TC"),2);
		assertEquals(-0.5,vend.calculateChange(2.5, "TE"),2);
	}
	
	@Test
	public void testCalculateChange4() {
		assertEquals("Wrong coin type!",vend.calculateChange(2.5, "TddE"));
	}
	

	@Test
	public void testCaptureMoney() {
		//assertTrue(vend.captureMoney("COFFEE", 2.5));
		//assertTrue(vend.captureMoney("COLA", 3.0));
		assertTrue(vend.captureMoney("COLA", 3.0));
		assertTrue(vend.captureMoney("COLA", 3.0));
		
	}
	
	@Test
	public void testCaptureMoney1() {
		//assertTrue(vend.captureMoney("COFFEE", 2.5));
		//assertTrue(vend.captureMoney("COLA", 3.0));
		assertTrue(vend.captureMoney("ORANGE_JUICE", 5.0));
		
	}
	
	@Test
	public void testCaptureMoney2() {
		//assertTrue(vend.captureMoney("COFFEE", 2.5));
		//assertTrue(vend.captureMoney("COLA", 3.0));
		assertTrue(vend.captureMoney("COFFEE", 2.5));
		
	}

	@Test
	public void testProcessSelection1() {
		
		//assertEquals("Coffee", vend.processSelection("COFFEE", true));
		//drink = drinkChamber.takeAOJ();
		assertEquals(drink.getClass(), vend.processSelection("COLA", false));
	}
	
	@Test
	public void testProcessSelection2() {
		//assertEquals("Coffee", vend.processSelection("COFFEE", true));
		assertEquals("Cola", vend.processSelection("COLA", true));
	}
	
	@Test
	public void testProcessSelection3() {
		//assertEquals("Coffee", vend.processSelection("COFFEE", true));
		//assertTrue(vend.processSelection("COLA", false));
	}

	@Test
	public void testCaptureInputAndRespond() {
		//assertTrue(vend.captureInputAndRespond();
	}

	@Test
	public void testGetAmountPaid() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDrinkChamber() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDrinkChamber() {
		fail("Not yet implemented");
	}

}
