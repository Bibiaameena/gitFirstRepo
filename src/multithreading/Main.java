package multithreading;

public class Main {
	public static void main(String[] args) {
//		MyClass myclass = new MyClass();
//		Thread th = new Thread(myclass);
//		th.run();
			Runnable var = ()->{
				System.out.println("Runnable interface");
			};
			Thread th = new Thread(var);
			th.run();
	}
}
