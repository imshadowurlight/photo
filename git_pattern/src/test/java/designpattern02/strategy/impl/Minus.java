package designpattern02.strategy.impl;


import designpattern02.strategy.iface.ICalculator;

public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0] - arrayInt[1];
	}

	
	
}
