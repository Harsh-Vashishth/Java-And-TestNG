package day1_secondpart;

public class Implicit_typecasting {
	
	
	static int fib(int n) {
	
		if(n<=1) return n;
		
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 10; //implicit typecasting
//		float marks = num;
//		System.out.println(marks);
//		
//		
//		num = (int)marks;//explicit typecasting
//		System.out.println(num);
		
		
//		for(char i = 'A'; i <= 'F'; i++) {
//			
//			System.out.print(i+""+ (char)(i+32)+ " ");
//		}
		
		
		
		//Fibonacci
		int n = 10;
		for(int i = 0; i < n ; i++) {
			System.out.print(fib(i)+" ");
			
		}
		
		
		
		

	}

}
