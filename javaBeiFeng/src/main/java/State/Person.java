package State;

public class Person {
	private int hour;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void doSomething(){
		if(hour == 7) {
			System.out.println("�����");
		} else if(hour == 12) {
			System.out.println("���з�");
		} else if(hour == 18) {
			System.out.println("����");
		} else {
			System.out.println(hour + "δ����");
		}
	}
}
