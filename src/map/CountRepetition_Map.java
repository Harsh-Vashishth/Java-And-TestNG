package map;
import java.util.*;
import java.util.Map.*;
public class CountRepetition_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "the day today is a very very very cold day";
		
		String[]words = str.split(" ");
		
		Map<String,Integer> map = new LinkedHashMap<String, Integer>();
		for(String word:words) {
			
			if(map.containsKey(words)) {
				int value = map.get(word);
				map.put(word, ++value);
			}
			else map.put(word, 1);
		}
		
		System.out.println(map);
	}
	
	

}
