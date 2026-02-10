package collections;
import java.applet.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "the day today is very very very cold day";
		String[] words = str.split(" ");
		Set<String> setA = new LinkedHashSet<String>();
		
		for(String word:words) {
			setA.add(word);
		}
		
		StringBuilder result = new StringBuilder();
		
		for(String word:setA) {
			result.append(word).append(" ");
			
		}
		System.out.println(result.toString().trim());
	}

}
