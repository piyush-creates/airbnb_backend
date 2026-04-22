package com.piyushcodes.airBnb.strategy;

import com.piyushcodes.airBnb.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {
    BigDecimal calculatePrice(Inventory inventory);
}
