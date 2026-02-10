package stringBuilder;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "today is a rainy day";
		StringBuilder reverse = new StringBuilder();
		String[]words = str.split(" ");
		
		for(int i = 0; i<words.length; i++) {
			reverse = reverse.append(new StringBuilder(words[i]).reverse());
			if (i < words.length - 1) reverse.append(' ');
		}
		System.out.println(reverse.toString());
	}

}
