package com.revature.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	
	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		String user="root";
		String url="jdbc:mysql://localhost:3306/book";
		String password="pass";
		Connection con=DriverManager.getConnection(url,user,password);
		return con;
		
	}

}
