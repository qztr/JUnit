package VendingMachine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DrinkChamberTest {

	@Before
	public void setUp() throws Exception {
		
		
	}

	@Test
	public void testLoadInventory() {
		
	}
	
//	@Test
//	  public void testGetFoo() {
//	     Other other = new Other();
//	     Foo foo = other.getFoo();
//	     assertEquals(foo, new Foo(1, 1, "test"));

	@Test
	public void testTakeACola() { 
		DrinkChamber dc = new DrinkChamber();
		dc.loadInventory();
		Cola cola = new Cola();
		System.out.print(dc.getColaCount());
	    assertEquals(dc.cola,dc.takeACola());
		
	
	}

	@Test
	public void testTakeACoffee() {
		DrinkChamber dc = new DrinkChamber();
		dc.loadInventory();
		assertEquals(dc.coffee,dc.takeACoffee());
	}

	@Test
	public void testTakeAOJ() {
		DrinkChamber dc = new DrinkChamber();
		dc.loadInventory();
		assertEquals(dc.oj,dc.takeAOJ());
	}

}
