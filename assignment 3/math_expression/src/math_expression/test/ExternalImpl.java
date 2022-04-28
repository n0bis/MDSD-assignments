package math_expression.test;

import math_expression.*;

class ExternalImpl implements Test27.External, Test28.External, Test29.External, Test30.External, Test31.External, Test34.External {

	public int pi() {
		return 3;
	}

	public int sqrt(int n) {
		return (int) Math.sqrt(n);
	}
	
	public int pow(int n, int m) {
		return (int)Math.pow(n, m);
	}
	
}
