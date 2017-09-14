package designpattern02.iterator.impl;


import designpattern02.iterator.iface.Collection;
import designpattern02.iterator.iface.Iterator;

public class MyCollection implements Collection {
	public String string[] = {"A","B","C","D","E"};  
    @Override  
    public Iterator iterator() {
        return new MyIterator(this);  
    }  
  
    @Override  
    public Object get(int i) {  
        return string[i];  
    }  
  
    @Override  
    public int size() {  
        return string.length;  
    }  
}
