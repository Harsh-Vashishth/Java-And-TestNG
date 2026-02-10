package inheritence;

class Parent{
	String house;
	Parent(){
		System.out.println("Parent Constructor");
	}
}


class Child extends Parent{
	String car;
	Child(){
		System.out.println("child constructor called"+this.house);//house is used here from parent constructor 
	}
}
public class ParentChildConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
	}

}
