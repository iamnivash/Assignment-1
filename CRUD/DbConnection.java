package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	public static Connection getDbConnection()
	{
		String url = "jdbc:mysql://localhost:3306/sampledatabase"; 
	    String username = "root"; 
	    String password = "admin@123";
	
	    
	    Connection connection = null;
	    
	
	    try {
	        
	        Class.forName("com.mysql.cj.jdbc.Driver");
	
	        
	        connection = DriverManager.getConnection(url, username, password);
	
	        
	        
	
	        
	        
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    
	    return connection;
	}

}
