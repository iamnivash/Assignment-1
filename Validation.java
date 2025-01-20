import java.util.Scanner;
import java.util.regex.*;
public class Validation {
	public static Boolean checkLeapYear(int n)
	{
		
		if(n%4==0 && n%100!=0)
		{
			return true;
		}
		else if(n%400 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static String checkValidName(Scanner sc)
	{
		String name;
		String nameregex = "^[A-Za-z ]+$";
		while(true)
		{
			System.out.print("Enter your name: ");
			name = sc.nextLine();
			if(Pattern.matches(nameregex, name))
			{
				break;
				
			}
			System.out.println("Invalid Name!!!");
		}
		return name;
		
	}
	public static String checkValidEmail(Scanner sc)
	{
		String email;
		String emailregex = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
		while(true)
		{
			System.out.print("Enter your email: ");
			email = sc.nextLine();
			if(Pattern.matches(emailregex, email))
			{
				break;
				
			}
			System.out.println("Invalid Email Id!!!");
		}
		return email;
		
	}
	public static String checkValidDob(Scanner sc)
	{
		String dob;
		String dobregex_odd = "^(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
		String dobregex_even = "^(0[1-9]|1[0-9]|2[0-9]|3[0])/(0[1-9]|1[0-2])/\\d{4}$";
		String dobregex_nonlp = "^(0[1-9]|1[0-9]|2[0-9])/(0[1-9]|1[0-2])/\\d{4}$";
		String dobregex_lp = "^(0[1-9]|1[0-9]|2[0-8])/(0[1-9]|1[0-2])/\\d{4}$";
		while(true)
		{
			System.out.print("Enter your DOB: ");
			dob = sc.nextLine();
			int d = Integer.valueOf(dob.substring(0,1));
			int m = Integer.valueOf(dob.substring(3,5));
			int y = Integer.valueOf(dob.substring(6,10));
			if(m == 02){
				if(checkLeapYear(y) == true)
				{
					if(Pattern.matches(dobregex_lp, dob))
					{
						break;
					}
	
				}
				if(checkLeapYear(y) == false)
				{
					if(Pattern.matches(dobregex_nonlp, dob))
					{
						break;
					}
				}
			}
			else if(m%2==0)
			{
				if(Pattern.matches(dobregex_even, dob))
				{
					break;
				}
				
			}
			else
			{
				if(Pattern.matches(dobregex_odd, dob))
				{
					break;
				}
			}
			
			System.out.println("Invalid Date of Birth!!!");
		}
		return dob;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = checkValidName(sc);
		String emailid = checkValidEmail(sc);
		String dob = checkValidDob(sc);
		
		
		System.out.println("Registration Successfull");
		System.out.println("Name: " + name);
		System.out.println("Email Id: " + emailid);
		System.out.println("Date of Birth: " + dob);
	}
}
