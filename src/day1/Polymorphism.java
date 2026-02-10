package day1;

public class Polymorphism {

	//polymorphism -> same method name different usage of parameters+
	static void sum() 
	{
		System.out.println(10);
	}
	
	static void sum(int a, int b) 
	{
		System.out.println(a+b);
	}
	static void sum(float a, float b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		sum();
	}

}
