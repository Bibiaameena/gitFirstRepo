package PracticeInterface;

public interface Child {
	default void printParent() {
		System.out.println("Child Interface");
	}
}
