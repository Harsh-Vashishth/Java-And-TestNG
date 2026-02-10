package map;
import java.util.*;
import java.util.Map.*;

public class Map_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>map = new HashMap<Integer,String>();
		
		map.put(1, "C");
		map.put(4, "B");
		map.put(3, "A");
		
		for(Entry<Integer,String>e:map.entrySet()) {
			
			System.out.println(e.getKey()+":"+ e.getValue());
			
		}
		
		String value = map.get(3);
		System.out.println(value);
		map.remove(4);
		System.out.println(map);
		
		System.out.println(map.containsKey(4));
	}

}
