package interfaces;

interface Company{
	default void printDetails() {
		System.out.println("Company Details");
	}
}
class Ezest implements Company{
	public void printDetails() {
		System.out.println("Company is EZEST");
	}
}

public class MainClass {
	public static void main(String[] args) {
		Company e = new Ezest();
		e.printDetails();
	}
	
	
}
