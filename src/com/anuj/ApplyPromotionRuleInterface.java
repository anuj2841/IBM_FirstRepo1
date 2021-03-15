package com.anuj;

import java.math.BigDecimal;

public interface ApplyPromotionRuleInterface {
	public BigDecimal applyPercentOffPromotion(BigDecimal orderTotal);
	public BigDecimal applyFixedOffPromotion(BigDecimal orderTotal,int itemCount);
}
