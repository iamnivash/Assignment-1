package CRUD;

import java.sql.*;

public class DbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/sampledatabase"; 
	private static final String username = "root"; 
	private static final String password = "admin@123";
	
	public static Connection getDbConnection()
	{
	    Connection connection = null;
	    
	    try {
	        
	        //Class.forName("com.mysql.cj.jdbc.Driver");

	        connection = DriverManager.getConnection(url, username, password);  
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	    return connection;
	}

}
