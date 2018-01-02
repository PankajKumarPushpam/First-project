package DataBaseTestingDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDetails1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dburl="jdbc:mysql://localhost:3306/selenium";

		//database username

		String userName="root";

		//database password

		String password="pankaj";

		//Query to execute

		String query="select * from Studentinfo";

		//Load sql jdbc driver

		Class.forName("com.mysql.jdbc.Driver");

		//create connection to database

		Connection conn = DriverManager.getConnection(dburl,userName,password);

		//create statement object

		Statement stm = conn.createStatement();

		//Execute the Sql Query and result store in ResultSet

		ResultSet result=stm.executeQuery(query);

		while(result.next()){
			int sid=result.getInt(1);
			String Sname=result.getString("Sname");
			int age=result.getInt(3);
			String email=result.getString("email");
			int phone=result.getInt(5);
			String city=result.getString("city");
			System.out.println(sid+" "+Sname+" "+age+" "+email+" "+phone+" "+city);			
		}		
	}

}
