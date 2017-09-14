package designpattern.vistor.main;


import designpattern.vistor.impl.Subject;
import designpattern.vistor.impl.Visitor;

/**
 * 总结一下这个访问者模式：
 * 就是说呢，在我们的工作环境中，有许许多多的sub类，我们如果想要扩展sub类的功能，但是又不好直接改动sub代码，我们可以通过sub固有的accept方法，将我们想要的功能实现承载者visitor丢入去，从而灵活实现目的
 * 当然了，必须要有远见，预先留好了accept这个入口
 * */
public class Test {  
  
    public static void main(String[] args) {  
          
        Visitor visitor = new Visitor();
        Subject sub = new Subject();
        sub.accept(visitor);      
    }  
}  

