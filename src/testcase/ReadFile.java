package testcase;
import java.io.*;
import java.util.Properties;
public class ReadFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\Harsh.Vashishth\\eclipse-workspace\\coforge_jan\\src\\testcase\\data.properties"));
		System.out.println(prop.getProperty("url"));
	}

}
