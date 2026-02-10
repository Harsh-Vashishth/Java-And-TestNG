package stringsProgram;

public class Program_LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = {"manly","man","mantos","mantee"};
		String prefix = "";
		String check = "";
		boolean notPrefix = false;
		for(int i = 0; i<words[0].length();i++) {
			
			check = check+words[0].charAt(i);
			
			for(String word:words) {
				
				if(word.startsWith(check)) {
					
				}
				else {
					notPrefix = true;
					break;
				}
			}
			if(!notPrefix) {
				prefix = check;
			}
			else {
				break;
			}
		}
		System.out.println(prefix);
	}

}
