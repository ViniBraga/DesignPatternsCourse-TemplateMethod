package com.tax;
import com.model.Budget;

public class ICMS implements Tax {

	public double calcula(Budget budget) {
		return budget.getValue() * .1;
	}

}
