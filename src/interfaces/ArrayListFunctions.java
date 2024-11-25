package interfaces;
import java.util.ArrayList;

public class ArrayListFunctions {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.forEach(a -> System.out.print(a + " "));
		System.out.println();
		list.forEach(a -> {
		if(a%2 == 0) 
			System.out.println(a);
		});
	}
}
