package designpattern.mediator.impl;

/* 
 * 中介者类，并和两个参与者进行关联，两个参与者在中介者这里注册 
 */
/* 
中介者就是一个处于众多对象，并恰当地处理众多对象之间相互之间的联系的角色。
 以上代码中只有两个参与者类，，但是这些我们都可以根据中介者模式的宗旨进行适当地扩展，即增加参与者类，然后中介者就得担负更加重的任务了，我们看到上面具体中介者类Mediator中的方法比较多而且有点乱。
所以，在解耦参与者类之间的联系的同时，中介者自身也不免任务过重，因为几乎所有的业务逻辑都交代到中介者身上了，可谓是“万众期待”的一个角色了。这就是中介者模式的不足之处了 。
此外，上面这个代码例子的参与者的属性和方法都是一样的，我们可以抽取一个抽象类出来，减少代码，但是有时候我们根本抽取不了多个“参与者”之间的共性来形成一个抽象类，这也大大增加了中介者模式的使用难度。
 * */
public class Mediator {
	private Anchor anchor;
	private Guest guest;

	public void regAnchor(Anchor anchor) {
		this.anchor = anchor;
	}

	public void regGuest(Guest guest) {
		this.guest = guest;
	}

	// 中介代替主持人说话，如果嘉宾在说话，打断他，主持人说，主持人的状态变为忙碌
	public void anchorSpeak() {
		if (!guest.isFree()) {
			guest.stop();
		}
		System.out.println("Anchor is speaking....");
		anchor.setFree(false);
	}

	// 中介代替嘉宾说话，如果主持人空闲，嘉宾才能说话，嘉宾状态变为忙碌，
	// 否则，不让嘉宾说话，主持人继续说
	public void guestSpeak() {
		if (anchor.isFree()) {
			System.out.println("Guest is speaking....");
			guest.setFree(false);
		} else {
			System.out.println("Anchor is speaking. Do not interrupt...");
		}

	}

	// 中介代替主持人停止说话，设置状态为空闲
	public void anchorStop() {
		System.out.println("Anchor stop speaking now....");
		anchor.setFree(true);
	}

	// 中介代替嘉宾停止说话，设置状态为空闲
	public void guestStop() {
		System.out.println("Guest stop speaking now...");
		guest.setFree(true);

	}
}