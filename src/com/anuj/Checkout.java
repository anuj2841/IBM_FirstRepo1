package com.anuj;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Checkout {

	List<Item> itemList = new ArrayList<Item>();
	BigDecimal orderTotal=new BigDecimal(0.00);

	public int addBasket(Item item) {

		if (item.getName() != "") {
			itemList.add(item);
			return 1;
		}
		return 0;
	}

	public BigDecimal checkoutOrder() {

		Iterator<Item> iterator = itemList.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			orderTotal=orderTotal.add(BigDecimal.valueOf(item.getPrice()));
		}
		return orderTotal;
	}
	
	public BigDecimal applyPromotionRule() {
		ApplyPromotionRuleInterface app=new ApplyPromotionruleImpl();
		if(orderTotal.compareTo(BigDecimal.valueOf(7000.00))>0) {
			orderTotal=app.applyPercentOffPromotion(orderTotal);
		}
		int itemCount=0;
		BigDecimal price=BigDecimal.valueOf(0.00);
		Iterator<Item> iterator=itemList.iterator();
		while(iterator.hasNext()) {
			Item item=iterator.next();
			if(item.getId()==103) {
				price=BigDecimal.valueOf(item.getPrice());
				itemCount++;
			}
		}
		if(itemCount>1) {
			orderTotal=app.applyFixedOffPromotion(orderTotal,itemCount);
		}
		
		return orderTotal;
	}
}
