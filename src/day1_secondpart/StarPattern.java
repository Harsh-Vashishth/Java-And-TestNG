package day1_secondpart;

public class StarPattern {

//	static void star(int n) {
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j<=i ; j++) {
//				
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//	}
	
	static void numberPattern(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=i ; j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		star(5);
		
		numberPattern(5);
		
		
	}

}
