package day1_secondpart;

public class Reverse_Star {

	static void reverse_star(int n) {
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n-i ; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse_star(5);
	}

}
