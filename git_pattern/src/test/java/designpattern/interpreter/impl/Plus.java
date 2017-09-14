package designpattern.interpreter.impl;


import designpattern.interpreter.iface.Expression;
import designpattern.interpreter.main.Context;

public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1()+context.getNum2();
	}
	
}
