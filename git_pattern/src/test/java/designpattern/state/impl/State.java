package designpattern.state.impl;

public class State {
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	
	
	public void method1(){
		System.out.println("execute the first option");
	}
	
	public void method2(){
		System.out.println("execute the second option");
	}
}
