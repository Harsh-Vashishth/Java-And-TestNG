package stringsProgram;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email1 = "abc@coforge.com";
		String email2 = "ab12@coforge.com";
		String email3 = "abcd123@coforge.com";
		String email4 = "abcd12@coforge.com";
		String regex = "^[A-Za-z]{3,6}[0-9]{0,2}_?@coforge.com$";
		
		System.out.println(email1.matches(regex));
		System.out.println(email2.matches(regex));
		System.out.println(email3.matches(regex));
		System.out.println(email4.matches(regex));

		
	}

}
