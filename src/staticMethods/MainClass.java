package staticMethods;

interface Parent{
	static void printStatic() {
		System.out.println("Static method");
	}
	
	default void printDefault() {
		System.out.println("Default method");
	}
}

public class MainClass implements Parent{
	public static void main(String[] args) {
		Parent.printStatic();
		
		MainClass m = new MainClass();
		m.printDefault();

	}
	
	
}
