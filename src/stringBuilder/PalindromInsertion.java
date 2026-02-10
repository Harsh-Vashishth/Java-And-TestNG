package stringBuilder;

public class PalindromInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "abcb";
		String str = original;
		String toAdd = "";
		
		int count = 0;
		int start = 0;
		int end = str.length()-1;
		
		while(start<=end) {
			
			if(str.charAt(start)!=str.charAt(end)) {
				count++;
				toAdd = str.charAt(start)+toAdd;
				str = original+toAdd;
				start = 0;
				end = str.length()-1;
				
			}
			
			else {
				start++;
				end--;
			}
			
			System.out.println(count);
			System.out.println(str);
		}

	}

}
