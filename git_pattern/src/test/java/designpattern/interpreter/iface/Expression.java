package designpattern.interpreter.iface;


import designpattern.interpreter.main.Context;

public interface Expression {
	public int interpret(Context context);
}
