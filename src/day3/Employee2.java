package day3;


 class Employee2{
	static String companyName = "Coforge";
	Employee2(){
		System.out.println("Constructor call");
	}
	static {
		
		System.out.println("static block called");
	}
}