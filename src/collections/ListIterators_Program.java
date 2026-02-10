package collections;
import java.util.*;


public class ListIterators_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ListA = new ArrayList<Integer>();
		ListA.add(10);
		ListA.add(20);
		ListIterator<Integer>it = ListA.listIterator();
		
		System.out.println(it);

		System.out.println(it.next());
		System.out.println(it.previous());

	}

}
