package com.tax;
import com.model.Budget;

public class ICMS implements Tax {

	public double calculate(Budget budget) {
		return budget.getValue() * .1;
	}

}
