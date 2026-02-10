package seleniumDay9;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			System.out.println("hello");
			int num = -1;
			if(num<0) throw new NegativeException("Num value is negative");
			System.out.println("bye");
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

}
