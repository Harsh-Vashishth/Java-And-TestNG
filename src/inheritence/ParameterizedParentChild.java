package inheritence;

class Papa{
	String house;
	Papa(String house){
		System.out.println("Parent Constructor");
	}
}


class Beta extends Papa{
	String car;
	Beta(String house){
		super(house);
		System.out.println("child constructor called"+this.house);//house is used here from parent constructor 
	}
}
public class ParameterizedParentChild {
	Beta child = new Beta("3bhk");
	
	
}
