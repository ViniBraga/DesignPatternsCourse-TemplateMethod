package com.tax;
import com.model.Budget;

public class ISS implements Tax {

	public double calcula(Budget budget) {
		return budget.getValue() * .06;
	}

}
