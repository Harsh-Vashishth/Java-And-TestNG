package day3;


class UserA{
	int num1 = 10;
	static void hello() {//using static to avoid runtime polymorphism....this is compile time polymorphism
		System.out.println("hello");
	}
}

class UserB extends UserA{
	int num2 = 20;
	static void hello() {
		System.out.println("bye");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserA obj = new UserB();
		obj.hello();

	}

}
