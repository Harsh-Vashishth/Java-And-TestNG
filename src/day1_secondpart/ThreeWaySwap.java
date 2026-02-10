package day1_secondpart;

public class ThreeWaySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		
//		int temp = a; //first method
//		a = b;
//		b = temp;
		
//		second method
//		a = a + b;
//		b = a - b;
//		a = a - b;
		
		//third method
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
//		
		System.out.println(a);
		System.out.println(b);
	}

}
