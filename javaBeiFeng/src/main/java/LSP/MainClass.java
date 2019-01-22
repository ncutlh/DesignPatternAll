package LSP;

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
//		display(person);
		
		Man man = new Man();
		display(man);
	}
	
	public static void display(Man man) {
		man.display();
	}
}
