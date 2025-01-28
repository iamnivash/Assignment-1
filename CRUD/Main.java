package CRUD;

import java.sql.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("________________Choose The Operation________________");
		System.out.println("1 -> Create \n2 -> Read \n3 -> Update \n4 -> Delete"); 
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			Insert.insert();
		}
		else if(choice == 2)
		{
			Read.read();
		}
		else if(choice == 3)
		{
			Update.update();
		}
		else
		{
			Delete.delete();
		}
	}
}
