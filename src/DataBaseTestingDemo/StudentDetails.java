package DataBaseTestingDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;


public class StudentDetails {
     
	@Test
	public void collectDetails(){
		String url="jdbc:mysql://localhost:3306/";
		String databaseName="selenium";
		String userName="root";
		String pwd="pankaj";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url+databaseName,userName,pwd);			
			String sqlQuery="select * from Studentinfo where sid=102";
			Statement stm = conn.createStatement();
			ResultSet result = stm.executeQuery(sqlQuery);
			
			result.next();
			System.out.println(result.getString("Sname"));
			System.out.println(result.getString("age"));
			System.out.println(result.getString("email"));
			System.out.println(result.getString("phone"));
			System.out.println(result.getString("city"));
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		}
		
	}
	
	