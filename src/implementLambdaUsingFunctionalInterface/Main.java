package implementLambdaUsingFunctionalInterface;

public class Main {
	public static void main(String[] args) {
		//Upcasting the parent interface
//		Employee sd = new SoftwareDeveloper();
//		System.out.println(sd.getName());
		Employee e = ()-> "First Employee Interface";
		System.out.println(e.getName());
		Employee e1 = ()->"Second employee interface";
		System.out.println(e1.getName());
	}
}
