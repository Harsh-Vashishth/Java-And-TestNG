package stringsProgram;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1 == str2) System.out.println("one");
		if(str3 == str4) System.out.println("two");
		if(str1.equals(str2)) System.out.println("three");
		if(str3.equals(str4)) System.out.println("four");
	
	
	}

}
