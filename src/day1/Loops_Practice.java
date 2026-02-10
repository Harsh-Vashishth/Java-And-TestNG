package day1;

public class Loops_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 0; i <= 10; i++) {
//			if(i == 0) System.out.println("Hello");
//			
//			else if(i<=5) {
//				System.out.print(i );
//			}
//			
//			else break;
//			
//		}
//		System.out.println("\nbye");
//		System.out.println("Hello");
//		int num = 1;
//		while(num <= 10) {
//			
//			System.out.print(num + " ");
//			if(num == 5) break;
//			num++;
//		}
//		System.out.println("\nbye");
		
		
		
		System.out.println("Hello");
		int num = 1;
		while(num <= 10) {
			
			if(num == 5) {
				num++;
				continue;
			}
			System.out.print(num + " ");
			num++;
		}
		System.out.println("\nbye");
	}
		
		

}
