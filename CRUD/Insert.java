package CRUD;

import java.sql.*;
import java.util.Scanner;



public class Insert {
    public static void insert() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Book Id: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter the Book Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the Author Name: ");
        String author_name = sc.nextLine();
        
        System.out.print("Enter the Book Published Date (yyyy-MM-dd): ");
        String date = sc.nextLine();
        
        System.out.print("Enter the Book Genre: ");
        String book_genre = sc.nextLine();
        
        System.out.print("Enter the Book Price: ");
        double book_price = sc.nextDouble();

        String query = "INSERT INTO books (book_id, title, author, published_date, genre, price) "
                + "VALUES ('"+id+"','"+name+"','"+author_name+"','"+date+"','"+book_genre+"','"+book_price+"')";
      
        
        try (Connection connection = DbConnection.getDbConnection()) {
   
            Statement statement = connection.createStatement();
            
            int rows = statement.executeUpdate(query);
           

  
           
            if (rows > 0) {
                System.out.println("Book inserted successfully!");
            }

           
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}
