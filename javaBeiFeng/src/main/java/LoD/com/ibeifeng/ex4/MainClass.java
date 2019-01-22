package LoD.com.ibeifeng.ex4;

public class MainClass {
	public static void main(String[] args) {
		SomeOne zhangsan = new SomeOne();
		zhangsan.setFriend(new Friend());
		zhangsan.setStranger(new StrangerA());
		zhangsan.play();
	}
}
