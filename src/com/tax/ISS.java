package com.tax;
import com.model.Budget;

public class ISS implements Tax {

	public double calculate(Budget budget) {
		return budget.getValue() * .06;
	}

}
