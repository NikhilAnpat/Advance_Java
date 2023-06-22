package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils 
{
	private static Connection cn;

	// add a static method to create single  FIXED DB connection : will be called exactly ONCE
	public static void openConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/advancejava?useSSL=false&allowPublicKeyRetrieval=true";
		// get cn from DriverManager : class
		cn = DriverManager.getConnection(url, "root", "Nikhil");
	}
	//close connection : once
	public static void closeConnection() throws SQLException
	{
		if(cn != null)
			cn.close();
	}
	//add a getter for getting FIXED db connection
	public static Connection getCn() {
		return cn;
	}
	
}
