package com.tax;

import com.model.Budget;

public abstract class ConditionalTaxTemplate implements Tax {

	@Override
	public double calculate(Budget budget) {
		if(mustUseMaximumRate(budget)) {
			return maximumTax(budget);
		} else {
			return  minimumRate(budget);
		}
	}
	
	protected abstract boolean mustUseMaximumRate(Budget budget);
	
	protected abstract double maximumTax(Budget budget);

	protected abstract double minimumRate(Budget budget);

}
