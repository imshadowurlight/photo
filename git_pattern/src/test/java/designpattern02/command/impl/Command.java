package designpattern02.command.impl;

public class Command {
	private Receiver receiver;  
    
    public Command(Receiver receiver) {  
        this.receiver = receiver;  
    }  
    
    public void exe() {  
        receiver.action();  
    } 
}
