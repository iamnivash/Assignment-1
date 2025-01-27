package CRUD;

import java.sql.*;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("________________Choose The Operation________________");
		System.out.println("1 -> Create \n2 -> Read \n3 -> Update \n4 -> Delete"); 
		int choice = sc.nextInt();
		
		Connection connection = DbConnection.getDbConnection();
		
		if(choice == 1)
		{
			Insert.insert(connection);
			
			
		}
		else if(choice == 2)
		{
			Read.read(connection);
			
		}
		else if(choice == 3)
		{
			Update.update(connection);
		}
		else
		{
			Delete.delete(connection);;
		}
	        

	}
	

}
