package day1;

public class Nested_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		char gender = 'F';
		if( age == 18) {
			if(gender == 'F') System.out.println("congrats on ur first vote gurllllll u slayyyy queennnnnn");
			
			else System.out.println("congrats on your first vote boyyyyy u slayyyyy kinggggg");
			
		}
		
//		if(age >= 18) {
//			System.out.println("you can vote");
//		}
		
		else if(age >= 18) {
			System.out.println("you can vote");
		}
	
		
		else {
			System.out.println("you can not vote");
		}

	}

}
