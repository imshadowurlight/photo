package designpattern02.observer.main;


import designpattern02.observer.iface.Subject;
import designpattern02.observer.impl.MySubject;
import designpattern02.observer.impl.Observer1;
import designpattern02.observer.impl.Observer2;

/**
 * 
 * */
public class Test {
	public static void main(String[] args) {  
        Subject sub = new MySubject();
        sub.add(new Observer1());  //把目标对象加入到通知列表
        sub.add(new Observer2());  //把目标对象加入到通知列表
          
        sub.operation();  //所谓的operation()方法其实就是两部分构成，发生改变+通知他人		然后获取通知列表		然后让通知列表的对象执行相应的方法则可，soga
    }  
}
