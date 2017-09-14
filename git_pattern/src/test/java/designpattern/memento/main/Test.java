package designpattern.memento.main;


import designpattern.memento.impl.Original;
import designpattern.memento.impl.Storage;

/**
 * 很有意思的备忘录模式，在原始的类中创建备忘录来保存原始数据；通过存储类来获取备忘录恢复数据；
 * 刚好在项目遇到一个很类似的情况：
 * 		要求删除银行卡数据，然后恢复（以排除通过改变状态属性来识别银行卡是否被删除（伪删除）的情况）
 * 
 * 套用一下备忘录模式：
 * 	银行卡类bank就是我的原始类；对应表BANK
 * 	备忘录类bankMemento对应表BANK_MEMENTO;
 * 	备忘录存储类bankMementoStorage对应表BANK_MEMENTO_STORAGE	BANK_MEMENTO与BANK_MEMENTO_STORAGE之间是多对一的关系；
 * 
 * 当存储一张银行卡的时候，同时创建一张银行卡备忘录，
 * 当执行解绑功能时，删除表BANK的对应银行卡记录；
 * 当执行恢复操作时，从BANK_MEMENTO_STORAGE获取对应的BANK_MEMENTO记录，（可以通过银行卡卡号这个唯一标识来识别），找回对应的银行卡信息，
 * 
 * 可能存在的兼容问题：seq使我们自己定义的，从小到大，能否插入已经删除了的小id呢？
 * 	例如：	目前最大id为20；
 * 			id=5的记录已经被删除；
 * 			能否再插入一条id指定为5的记录？
 * 
 * 	取Theme做一个测试：
 * 	测试证明可行，备忘录的方式可以实现上面的需求
 * */
public class Test {  
	  
    public static void main(String[] args) {  
          
        // 创建原始类  
        Original origi = new Original("egg");
  
        // 创建备忘录并存储到storage  
        Storage storage = new Storage(origi.createMemento());
  
        // 修改原始类的状态  
        System.out.println("初始化状态为：" + origi.getValue());  
        origi.setValue("chicken");  
        System.out.println("修改后的状态为：" + origi.getValue());  
  
        // 回复原始类的状态  
        origi.restoreMemento(storage.getMemento());  
        System.out.println("恢复后的状态为：" + origi.getValue());  
    }  
} 
