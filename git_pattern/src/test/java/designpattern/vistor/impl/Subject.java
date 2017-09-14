package designpattern.vistor.impl;

public class Subject {
	public void accept(Visitor visitor){
		visitor.visit(this);
	}
	
	public String getSubject(){
		return "abcdefg";
	}
}
