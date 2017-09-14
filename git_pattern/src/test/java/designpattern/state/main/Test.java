package designpattern.state.main;

import designpattern.state.impl.Context;
import designpattern.state.impl.State;

/**
 * 这个太常见了，根据不同的状态，执行不同的操作，see too more in wsd
 * */
public class Test {  
	  
    public static void main(String[] args) {  
          
        State state = new State();
        Context context = new Context(state);
          
        //设置第一种状态  
        state.setState(0); 
        context.method();  
          
        //设置第二种状态  
        state.setState(1);  
        context.method();  
    }  
} 
