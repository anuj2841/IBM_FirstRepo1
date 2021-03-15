package com.anuj;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
public class TestChekout {

	@Test
	public void testBasket() {
		Item item1 = new Item(101, "Product-1", 4000.00);
		Item item2 = new Item(102, "Product-2", 4000.00);
		Item item3 = new Item(103, "Product-3", 95.00);
		Checkout checkout = new Checkout();
		checkout.addBasket(item1);
		checkout.addBasket(item2);
		checkout.addBasket(item3);
	}
	@Test
	public void orderTotalTest() {
		
		Item item1 = new Item(101, "Product-1", 4000.00);
		Item item2 = new Item(102, "Product-2", 4000.00);
		Item item3 = new Item(103, "Product-3", 95.00);
		Checkout checkout = new Checkout();
		checkout.addBasket(item1);
		checkout.addBasket(item2);
		checkout.addBasket(item3);
		assertEquals(BigDecimal.valueOf(8095.00),checkout.checkoutOrder());
		
	}

}
