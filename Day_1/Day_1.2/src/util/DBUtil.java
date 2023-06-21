package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DBUtil 
{
	public static Connection openConnection() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/advancejava?useSSL=false&allowPublicKeyRetrieval=true";

		//get cn from DriverManager : class
		return DriverManager.getConnection(url, "root", "Nikhil");
	}
}
