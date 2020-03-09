package com.epam.AdapterPatterns;

public class CumulativeMultiply {
		  public int product;

		CumulativeMultiply(int intialValue) {
		    this.product = intialValue;
		  }

		int multiply(int value) {
		    this.product *= value;
		    return product;
		  }
}
