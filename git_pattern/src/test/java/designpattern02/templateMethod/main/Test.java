package designpattern02.templateMethod.main;


import designpattern02.templateMethod.impl.AbstractCalculator;
import designpattern02.templateMethod.impl.Plus;

/**
 * 总结一下这个模板方法模式模式：
 * 网友解释：就是指：一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用，先看个关系图
 *
 *看懂是看懂了，但是感觉并没有在日常中碰到过，以后留意一点
 * */
public class Test {
	public static void main(String[] args) {  
        String exp = "8+8";  
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");  
        System.out.println(result);  
    }  
}
