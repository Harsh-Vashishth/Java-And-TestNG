package stringsProgram;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world program";
		System.out.println(str.charAt(0));
		System.out.println(str.endsWith("am"));
		System.out.println(str.indexOf('e'));
		System.out.println(str.contains("el"));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace(" ", "-"));
		
		
		String str2 = "   Today is rainy day   ";
		System.out.println(str2.trim());
		System.out.println(str2.stripLeading());
		System.out.println(str2.stripTrailing());
		
		
		System.out.println(str.substring(12, 15));
		String[]words = str.split(" ");
		System.out.println(words[1]);
	}

}
