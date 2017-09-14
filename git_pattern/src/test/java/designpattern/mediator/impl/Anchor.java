package designpattern.mediator.impl;

/* 
 * 主持人类，有一个状态，是否处于空闲状态 
 * 有一个终结者的私有属性，和中介者产生关系 
 */
public class Anchor {
	private boolean free;

	private Mediator med;

	public Anchor(Mediator md) {
		med = md;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	// 通过中介者来开始说话
	public void speak() {
		med.anchorSpeak();
	}

	// 通过中介者来停止说话
	public void stop() {
		med.anchorStop();
	}

}
