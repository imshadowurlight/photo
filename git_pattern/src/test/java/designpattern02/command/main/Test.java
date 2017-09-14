package designpattern02.command.main;


import designpattern02.command.impl.Command;
import designpattern02.command.impl.Invoker;
import designpattern02.command.impl.Receiver;

/**
 * 总结一下这个命令模式：
 * 这个很哈理解，命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开，熟悉Struts的同学应该知道，Struts其实就是一种将请求和呈现分离的技术，其中必然涉及命令模式的思想！
 * 
 * 但是我不是很懂，这样纸就算分离了吗，不是还持有着引用吗？
 * */
public class Test {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
        Command cmd = new Command(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action(); 
	}
}
