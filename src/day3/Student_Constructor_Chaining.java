package day3;

public class Student_Constructor_Chaining {
	int rollNo;
	String Name;
	
	Student_Constructor_Chaining(int rollNo, String Name){
		this(12.5F);
		System.out.println("Parameterized Constructor");
		this.rollNo = rollNo;
		this.Name = Name;
		
	}
	Student_Constructor_Chaining(){
		this(10,"Rohan");
		System.out.println("Default Constructor");
	}
	
	Student_Constructor_Chaining(float data){
		System.out.println("float constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Constructor_Chaining s1 = new Student_Constructor_Chaining();
		System.out.println(Employee2.companyName);

	}
}
