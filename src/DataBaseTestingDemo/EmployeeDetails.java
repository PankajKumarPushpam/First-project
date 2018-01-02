package DataBaseTestingDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class EmployeeDetails {

	
	@Test
	public void empDetails() throws ClassNotFoundException, SQLException {
		
		String dbURL="jdbc:mysql://localhost:3306/selenium";
		String username="root";
		String password="pankaj";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(dbURL,username,password);
		
		String query="select * from Employee";
		
		Statement stm = conn.createStatement();
		ResultSet result = stm.executeQuery(query);
		while(result.next()){
			int eid=result.getInt(1);
			String ename=result.getString("ename");
			System.out.println(eid+"  "+ename);
		}
		
		
	}

}
