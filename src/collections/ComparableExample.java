package collections;

import java.util.*;

class Test implements Comparable<Test>{
	String name;
	int id;
	public Test(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public int compareTo(Test a) {
		return this.id-a.id;
	}
}

class TestComparator implements Comparator<Test>{
	
	public int compare(Test a, Test b) {
		return b.id-a.id;
	}
}
public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Test> list = new ArrayList<Test>();
		list.add(new Test("TestA", 103));
		list.add(new Test("TestB", 101));
		list.add(new Test("TestC", 102));
		
		Collections.sort(list);//in case of comparable

		Collections.sort(list, new TestComparator());
		for(Test obj:list) {
			System.out.println(obj.id+" "+obj.name);
		}

	}

}
