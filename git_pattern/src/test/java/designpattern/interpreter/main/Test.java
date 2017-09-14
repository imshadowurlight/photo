package designpattern.interpreter.main;


import designpattern.interpreter.impl.Minus;
import designpattern.interpreter.impl.Plus;

/**
 * 总结一下：
 * 	解释器模型就是，
 * 
 * */
public class Test {
	public static void main(String[] args) {
		int result = new Minus().interpret(new Context(new Plus().interpret(new Context(9,2)),8));
		System.out.println(result);
	}
}
