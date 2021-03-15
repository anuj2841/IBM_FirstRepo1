package com.anuj;

import java.math.BigDecimal;

public class ApplyPromotionruleImpl implements ApplyPromotionRuleInterface{

	@Override
	public BigDecimal applyPercentOffPromotion(BigDecimal orderTotal) {
		orderTotal=orderTotal.multiply(BigDecimal.valueOf(0.1));
		return orderTotal;
	}

	@Override
	public BigDecimal applyFixedOffPromotion(BigDecimal orderTotal,int itemCount) {
		orderTotal=orderTotal.subtract(new BigDecimal("5.00").multiply(BigDecimal.valueOf(itemCount)));
		return orderTotal;
	}

}
