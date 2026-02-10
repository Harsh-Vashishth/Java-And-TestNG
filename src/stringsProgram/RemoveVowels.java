package stringsProgram;

public class RemoveVowels {

	public static void main(String[] args) {
		   String str="java is a very good language";
		   String result = str.replaceAll("[AEIOUaeiou]", "");
		   System.out.println("Original : " + str);
	       System.out.println("Without Vowels : " + result);
		}
		
	}

