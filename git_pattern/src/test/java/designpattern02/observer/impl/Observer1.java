package designpattern02.observer.impl;


import designpattern02.observer.iface.Observer;

public class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 has received!");

	}

}
