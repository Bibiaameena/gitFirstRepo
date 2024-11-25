package practiceSection;

interface Parent{
	void printAbstract();
	
	public static void printStatic() {
		System.out.println("Static method");
	}
	
	default void printDefault() {
		System.out.println("Default method");
	}
}

public class Main implements Parent{
	public void printAbstract() {
		System.out.println("Abstract method");
		System.out.println("the abstract method of lambda expression");
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.printAbstract();
		m.printDefault();
		Parent.printStatic();
	}
}
