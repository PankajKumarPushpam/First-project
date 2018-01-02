package DataBaseTestingDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDetails2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dburl="jdbc:mysql://localhost:3306/pankaj";

		//database username

		String userName="root";

		//database password

		String password="pankaj";

		//Query to execute

		String query="select * from student1 where Age in(22,29)";

		//Load sql jdbc driver

		Class.forName("com.mysql.jdbc.Driver");

		//create connection to database

		Connection conn = DriverManager.getConnection(dburl,userName,password);

		//create statement object

		Statement stm = conn.createStatement();

		//Execute the Sql Query and result store in ResultSet

		ResultSet result=stm.executeQuery(query);

		while(result.next()){
			int Roll_No=result.getInt(1);
			String name=result.getString("name");
			String Address=result.getString("Address");
			int phone=result.getInt(4);
			int Age=result.getInt(5);
			System.out.println(Roll_No+" "+name+" "+Address+" "+phone+" "+Age);			
		}
	}

}
