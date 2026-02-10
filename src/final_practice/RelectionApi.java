package final_practice;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class TestC{
	static final int num = 10;
	public String name = "hello";
}
public class RelectionApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<TestC> testobj = TestC.class;
		Field[] fields = testobj.getDeclaredFields();
		for(Field field:fields) {
			
			System.out.println(field.getName()+" ");
			int modifier = field.getModifiers();
			System.out.println(Modifier.toString(modifier));
		}
				
	}

}
