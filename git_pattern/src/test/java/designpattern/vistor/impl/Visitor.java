package designpattern.vistor.impl;



public class Visitor {
	public void visit(Subject sub){
		System.out.println("visit the subject:\t"+sub.getSubject());
	}
}
