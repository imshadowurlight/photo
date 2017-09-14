package designpattern02.strategy.main;


import designpattern02.strategy.iface.ICalculator;
import designpattern02.strategy.impl.Minus;
import designpattern02.strategy.impl.Plus;

/**
 * 总结一下这个策略模式：
 讲真，这个东西和模板方法不是一模一样吗
 * */
public class Test {
	public static void main(String[] args) {  
        String exp = "2+8";  
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);  
        System.out.println(result);  
        
        ICalculator cal02 = new Minus();
        int result02 = cal02.calculate(exp);
        System.out.println(result02);
    }  
}
