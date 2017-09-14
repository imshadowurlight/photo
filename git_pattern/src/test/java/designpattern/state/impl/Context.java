package designpattern.state.impl;

public class Context {  
	  
    private State state;  
  
    public Context(State state) {  
        this.state = state;  
    }  
  
    public State getState() {  
        return state;  
    }  
  
    public void setState(State state) {  
        this.state = state;  
    }  
  
    public void method() {  
        if (state.getState()==0) {  
            state.method1();  
        } else if (state.getState()==1) {  
            state.method2();  
        }  
    }  
}
