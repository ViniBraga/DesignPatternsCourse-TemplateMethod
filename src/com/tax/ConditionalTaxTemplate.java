package com.tax;

import com.model.Budget;

public abstract class ConditionalTaxTemplate implements Tax {

	@Override
	public double calcula(Budget budget) {
		if(mustUseMaximumRate(budget)) {
			return maximumTax(budget);
		} else {
			return  minimumRate(budget);
		}
	}
	
	public abstract boolean mustUseMaximumRate(Budget budget);
	
	public abstract double maximumTax(Budget budget);

	public abstract double minimumRate(Budget budget);

}
