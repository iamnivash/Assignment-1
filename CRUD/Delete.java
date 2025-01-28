package CRUD;

import java.sql.*;
import java.util.Scanner;
public class Delete {
	public static void delete()

	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your id: ");
		int id = sc.nextInt();
		String delete = "DELETE FROM books WHERE book_id = '"+id+"'";
		
		try (Connection connection = DbConnection.getDbConnection()){
			Statement stm = connection.createStatement();
			int deletion = stm.executeUpdate(delete);
			
			if(deletion > 0)
				System.out.println("Row Deleted Successfully!");
		}catch (SQLException e) {
            e.printStackTrace();
        } 
	}
}
