package interfacesAndAbastracts;

@FunctionalInterface
interface IUser{
	int add(int num1, int num2);
}
public class FunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUser user = (a,b)->{
			return a+b;
		};
		
		System.out.println(user.add(10,20));
	}

}
