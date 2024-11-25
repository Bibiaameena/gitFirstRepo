package interfaces;

//Lambda expression using Functional Interface

public interface MyInterface {
	
	default void Bank() {
		System.out.println("Bank Name: HSBC");
	}
	
}
