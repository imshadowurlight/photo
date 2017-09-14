package designpattern02.chainOfResponsibility.impl;


import designpattern02.chainOfResponsibility.iface.Handler;

public abstract class AbstractHandler {
	private Handler handler;
	  
    public Handler getHandler() {  
        return handler;  
    }  
  
    public void setHandler(Handler handler) {  
        this.handler = handler;  
    }
}
