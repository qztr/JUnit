package VendingMachine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import VendingMachine.VendingMachine.SelectionMenu;

public class VendingMachineTest2 {
	
	VendingMachine vend;

	@Before
	public void setUp() throws Exception {
		vend = new VendingMachine();
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
	public void testDisplayMenu() {
		System.out.print("Please select your drink from the menu:\n"+
	            "\tCOLA\tprice: [3.0] euro	still have: [10]can\n"+
				"\tCOFFEE\t\tprice: [2.5] euro	still have: [10]can"+
	            "\tORANGE_JUICE	price: [5.0] euro	still have: [10]can\r\n" + 
	            "\tQUIT\n\n"+
	            "Enter:\n");
//		sb.append("Please select your drink from the menu:");sb.append(NLC);
//		 sb.append("\t" + SelectionMenu.COLA + "\t\tprice: [" + drinkChamber.cola.price + "] euro" + "\tstill have: [" + drinkChamber.getColaCount().toString() + "]can"); sb.append(NLC);
//		 sb.append( "\t" + SelectionMenu.COFFEE + "\t\tprice: [" + drinkChamber.coffee.price + "] euro" + "\tstill have: [" + drinkChamber.getCoffeeCount().toString() + "]can"); sb.append(NLC);
//		 sb.append( "\t" + SelectionMenu.ORANGE_JUICE + "\tprice: [" + drinkChamber.oj.price + "] euro" + "\tstill have: [" +  drinkChamber.getOJCount().toString() + "]can"); sb.append(NLC);
//		 sb.append("\t" + "QUIT");sb.append(NLC);sb.append(NLC);
//				 sb.append( "Enter:");sb.append(NLC);
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
		fail("Not yet implemented");
	}

	@Test
	public void testProcessSelection() {
		fail("Not yet implemented");
	}

	@Test
	public void testCaptureInputAndRespond() {
		fail("Not yet implemented");
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
