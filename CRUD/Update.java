package CRUD;

import java.sql.*;
import java.util.Scanner;
import java.util.Date;
public class Update {
	public static void update(Connection connection)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Column do you want to update: ");
		System.out.print("1 -> Book Id \n2 -> Book Name \n3 -> Book Author \n4 -> Published Date \n5 -> Gnere \n6 -> Price");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		String query;
		
		if(choice == 1)
		{
			System.out.print("Enter the Book Name to update id: ");
			String book_name = sc.nextLine();
			System.out.print("Enter the Book Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			query = "UPDATE books set book_id = '"+id+"' WHERE title = '"+book_name+"' ";
		}
		else if(choice == 2)
		{
			System.out.print("Enter the Book Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Book Name: ");
			String book_name = sc.nextLine();
			
			query = "UPDATE books set title = '"+book_name+"' WHERE book_id = '"+id+"' ";
		}
		else if(choice == 3)
		{
			System.out.print("Enter the Book Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Book Author: ");
			String book_author = sc.nextLine();
			
			query = "UPDATE books set author = '"+book_author+"' WHERE book_id = '"+id+"' ";
		}
		else if(choice == 4)
		{
			System.out.print("Enter the Book Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Published Date: ");
			String date = sc.nextLine();
			
			query = "UPDATE books set published_date = '"+date+"' WHERE book_id = '"+id+"' ";
		}
		else if(choice == 5)
		{
			System.out.print("Enter the Book Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Book Genre: ");
			String book_genre = sc.nextLine();
			
			query = "UPDATE books set genre = '"+book_genre+"' WHERE book_id = '"+id+"' ";
			
		}else
		{
			System.out.print("Enter the Book Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the Book Price: ");
			double book_price = sc.nextDouble();
			
			query = "UPDATE books set price = '"+book_price+"' WHERE book_id = '"+id+"' ";
		}
		try {
			Statement stm = connection.createStatement();
			int rows = stm.executeUpdate(query);
			if(rows > 0)
				System.out.println("Rows Updated Successfully!");
			
			
		} catch (SQLException e) {
            e.printStackTrace();
        } 
		
		
			
	}

}
