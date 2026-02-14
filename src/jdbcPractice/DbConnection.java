package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://10331-TZD-TRNG:1433;"//replace localhost with server name
				+ "databaseName=ayush;"
				+ "user=testuser;"
				+ "password=Coforge@123456;"
//				+ "integratedSecurity=true;"
				+ "encrypt=true;"
				+ "trustServerCertificate=true;";
		Connection con = DriverManager.getConnection(url);
		String query = "select * from employee where empid=? and empname=?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, 101);
		pstmt.setString(2, "Rajat");
//		Statement stmt = con.createStatement();
//		int num = stmt.executeUpdate("insert  into employee(empid,empname,state) values(2004,'Harsh','HR')");
		ResultSet result = pstmt.executeQuery();
		while(result.next()) {
			System.out.println(result.getString("empName"));
		}
				
	}

}
