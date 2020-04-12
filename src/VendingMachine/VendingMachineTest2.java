package VendingMachine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class VendingMachineTest2 {
	Drink drink;
	VendingMachine vend;

	@Before
	public void setUp() throws Exception {
		vend = new VendingMachine();
		
		//drink = new Drink();
		//stats = new VendingMachine();
	}

	@Test
	public void createDisplayMenu() {
	}
	


	@Test
	public void testPowerUpVendingMechine() {
	}

	@Test
	public void testGetDisplayMenu() {
		
	}
	




	@Test
	public void testDisplayReturningCoinsTE() {
		double[] array = {0.0,0.0,0.0,1.0};
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
		assertEquals(-2.5,vend.calculateChange(2.5, "TddE"),2);
	}
	

	@Test
	public void testCaptureMoney() {
		//assertTrue(vend.captureMoney("COFFEE", 2.5));
		//assertTrue(vend.captureMoney("COLA", 3.0));
		assertTrue(vend.captureMoney("COLA", 3.0));
		//assertTrue(vend.captureMoney("COLA", 3.0));
		
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

		vend = new VendingMachine();
		DrinkChamber dc = new DrinkChamber();
	    vend.getDrinkChamber();
	    vend.setDrinkChamber(dc);
		dc.loadInventory();
		Cola cola = dc.takeACola();
		
		System.out.print(cola.price);
		assertEquals(cola, vend.processSelection("COLA", true));
	}
	
	@Test
	public void testProcessSelection2() {

		vend = new VendingMachine();
		DrinkChamber dc = new DrinkChamber();
	    //vend.getDrinkChamber();
	    vend.setDrinkChamber(dc);
		dc.loadInventory();
		//Cola cola = dc.takeACola();
		Coffee coffee = dc.takeACoffee();
		
		//System.out.print(cola.price);
		assertEquals(coffee, vend.processSelection("COFFEE", true));
	}
	
	@Test
	public void testProcessSelection3() {

		vend = new VendingMachine();
		DrinkChamber dc = new DrinkChamber();
	    //vend.getDrinkChamber();
	    vend.setDrinkChamber(dc);
		dc.loadInventory();
		//Cola cola = dc.takeACola();
		OrangeJuice oj = dc.takeAOJ();
		
		//System.out.print(cola.price);
		assertEquals(oj, vend.processSelection("ORANGE_JUICE", true));
	}
	

	@Test
	public void testCaptureInputAndRespond() {
		//assertTrue(vend.captureInputAndRespond();
	}

	@Test
	public void testGetAmountPaid() {
	}

	@Test
	public void testGetDrinkChamber() {
	}

	@Test
	public void testSetDrinkChamber() {
	}

}
