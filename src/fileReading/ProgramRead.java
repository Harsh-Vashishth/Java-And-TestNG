package fileReading;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
 
public class ProgramRead {
 
	public static void main(String[] args) throws Exception {
		File file=new
		File("C:\\Users\\Harsh.Vashishth\\Desktop\\git-practice");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String st;
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
		}
 
 
	}
 
}
 
 