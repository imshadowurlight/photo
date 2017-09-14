package designpattern.mediator.main;

import designpattern.mediator.impl.Anchor;
import designpattern.mediator.impl.Guest;
import designpattern.mediator.impl.Mediator;

/**
 * 总结一下这个中介者模式：
 * 类似于一群对象围成一个圈，中间是中介者对象；
 * 对象之间原本应该是互相持有其他对象的引用，耦合度十分高；
 * 所谓中介者模式就是对象不再持有其他引用，只持有中介者对象的引用，而中介者持有多有对象的引用，从而实现解耦，
 * 缺点：中介者对象很累
 * */
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 新建一个中介者
		Mediator med = new Mediator();

		// 新建一个主持人，并和中介者关联，让主持人知道中介都有什么能力（什么方法）
		Anchor anchor = new Anchor(med);

		// 新建一个嘉宾，并和中介者关联，让嘉宾知道中介都能什么能力（什么方法）
		Guest guest = new Guest(med);

		// 在中介者里面，注册主持人，和嘉宾，让中介者知道嘉宾和主持人都需要什么
		med.regAnchor(anchor);
		med.regGuest(guest);

		// 主持人说
		anchor.speak();

		// 嘉宾说
		guest.speak();

		// 主持人停止
		anchor.stop();

		// 嘉宾说
		guest.speak();

		// 主持人说
		anchor.speak();

	}
}
