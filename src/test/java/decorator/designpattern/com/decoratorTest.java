package decorator.designpattern.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class decoratorTest {

	@Test
	public void testCoffee() {
		Beverage beverage = new Espresso();
		assertEquals("Esprssso$1.99", beverage.getDescription() + "$" + beverage.cost());
		
		Beverage beverage2 = new Mocha(new Soy(new HouseBlend()));
		System.out.println(beverage2.getDescription() +  "$" + beverage2.cost());
		assertEquals("HouseBleand Coffee, Soy, Mocha$1.54", beverage2.getDescription() +  "$" + beverage2.cost());
	}

}
