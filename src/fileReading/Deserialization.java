package fileReading;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Deserialization {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fis = new	FileInputStream("C:\\Users\\Harsh.Vashishth\\Desktop\\test.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		UserA emp= (UserA)ois.readObject();
		System.out.println(emp.username + ":" + emp.password);
	}

}
