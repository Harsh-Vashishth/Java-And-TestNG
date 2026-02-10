package stringsProgram;

public class Program_CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "today is a rainy day";
		
		String[]words = str.split(" ");
		System.out.println(words.length);
		
		//2nd method
		int count = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count+1);
		
	}

}
