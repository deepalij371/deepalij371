package test1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc1 {

	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("class....");
		Connection conn=DriverManager.
				getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Deepali");
		System.out.println(conn);
		

	}

}