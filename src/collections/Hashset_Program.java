package collections;
import java.util.*;
public class Hashset_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> setA = new HashSet<Integer>();
		setA.add(10);
		setA.add(20);
		setA.add(30);
		setA.add(40);
		
		Set<Integer> setB = new LinkedHashSet<Integer>();
		setB.add(30);
		setB.add(20);
		setB.add(10);
		setB.add(40);
		
		Set<Integer> setC = new TreeSet<Integer>();
		setC.add(20);
		setC.add(30);
		setC.add(40);
		setC.add(10);
		
		System.out.println(setA);
		System.out.println(setB);
		System.out.println(setC);
		
		for(Integer num: setA) {
			System.out.println(num+" ");
		}
		
		System.out.println();
		
		Iterator<Integer> it = setA.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
			
		}

	}

}
