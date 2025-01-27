package CRUD;

import java.sql.*;
import java.util.Date;
import java.util.*;
public class Read {
	public static void read(Connection connection)
	{
		
		Statement statement = null;
		ResultSet resultSet = null;
	    try {
	    	statement = connection.createStatement();

            
            String query = "SELECT * FROM books"; 
	    	
	    	resultSet = statement.executeQuery(query);
	        System.out.println("Connection is Established");
	        System.out.println("\nBooks in the table:");
	        System.out.println("book_id | title                     | author               | published_date | genre      | price");
	        System.out.println("-----------------------------------------------------------------------------------------------");
	
	        
	        while (resultSet.next()) {
	            
	        	int bookId = resultSet.getInt("book_id");
	            String title = resultSet.getString("title");
	            String author = resultSet.getString("author");
	            Date publishedDate = resultSet.getDate("published_date");
	            String genre = resultSet.getString("genre");
	            double price = resultSet.getDouble("price");
	            
	            System.out.printf("%-8d | %-25s | %-20s | %-14s | %-10s | %.2f\n", 
	                    bookId, title, author, publishedDate.toString(), genre, price);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}



