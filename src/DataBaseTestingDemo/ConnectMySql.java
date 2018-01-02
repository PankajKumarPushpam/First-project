package DataBaseTestingDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySql {


	@Test
	public void testDB() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");

		System.out.println("Driver Loaded");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Selenium","root","pankaj");
		System.out.println("Connected DB");

		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from TestingData");

		while(rs.next()){
			String id = rs.getString("id");
			String name = rs.getString("name"); 
			System.out.println("DataBase record  is: "+id+" "+name);
		}
	}
}
