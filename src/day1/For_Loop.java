package day1;

public class For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 10; i >= 0 ; i--) {
//			System.out.println(i);
//		}
//		
//		int num = 5;
//		for(int i = 1; i <= 10 ; i++) {
//			
//			int result = num*i;
//			System.out.println("5 X " + i + " = " + result);
//		}
		
		int num = 2;
		for(int i = 1; i <= 10 ; i++) {
			
			int result = num*i;
			if (result % 10 == 0) { 
				System.out.println("bye");
			}
			
			else if(result % 4 == 0) System.out.println("hello");
			
			else System.out.println(result);
			
		}
	}

}
