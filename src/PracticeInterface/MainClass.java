package PracticeInterface;

public class MainClass implements Parent, Child{
	public static void main(String[] args) {
		MainClass m = new MainClass();
		m.printParent();
//		m.printChild();
	}
	@Override 
	public void printParent() {
		
		Child.super.printParent();
		
	}
	
}
