package fileReading;
 
import java.io.File;
import java.io.FileWriter;
 
public class ProgramWrite {
 
	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\Harsh.Vashishth\\Desktop\\git-practice");
		FileWriter fw=new FileWriter(file,true);
		fw.write("\nOriginal should not be lost");
		fw.close();
	
 
	}
 
}