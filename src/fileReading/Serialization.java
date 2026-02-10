package fileReading;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
class UserA implements Serializable
{
	String username;
	 transient String password;
	public UserA(String username, String password) {
		this.username=username;
		this.password=password;
	}
}
public class Serialization {
	public static void main(String[] args) throws Exception {
		
	FileOutputStream fos = new	FileOutputStream("C:\\Users\\Harsh.Vashishth\\Desktop\\test.txt");
	ObjectOutputStream oos= new ObjectOutputStream(fos);
	UserA emp= new UserA("rajat@user","pass@123");
	oos.writeObject(emp);
	oos.close();
	
 
	}
 
}
 
 
