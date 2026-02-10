package stringsProgram;

public class Program_CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		not good bekar hai
		String str = "number of sudents today";
		String camelCase = "";
		
		for(int i = 1; i<str.length();i++) {
			
			if(str.charAt(i-1)==' ') {
				camelCase = camelCase+(str.charAt(i)+"").toUpperCase();
				
				
			}

		
		}
		System.out.println(camelCase);
	}

}
