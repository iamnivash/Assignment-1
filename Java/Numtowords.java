package Java;
import java.util.Scanner;
public class Numtowords {
	
	public static final String Lessthanten[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	public static final String Lessthantwenty[] = {"eleven", "twelve","thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	public static final String Lessthanhundred[] = {"", "", "twenty", "thirty", "fourty", "fifty", " sixty", " seventy", "eighty", "ninety"};
	
	public static String conToWords(int n)
	{
		if(n == 0)
			return "zero";
		else if(n == 10)
			return "ten";
		else if(n < 10)
			return Lessthanten[n];
		else if(n < 20)
			return Lessthantwenty[n-11];
		else if(n < 100)
		{
			return Lessthanhundred[n / 10] +" " + (n % 10 != 0 ? " " + Lessthanten[n % 10] : "");
		}
		else if(n < 1000)
		{
			return Lessthanten[n/100] + " Hundred" + (n % 100 !=0 ?" " + conToWords(n % 100) : ""); 
		}
		else if(n < 1000000)
		{
			return conToWords(n / 1000) + " Thousand" + (n % 1000 !=0 ? " " + conToWords(n % 1000) : "");
		}
		else
		{
			return conToWords(n / 1000000) + " million" + (n % 1000000!=0 ?" "+conToWords(n % 1000000):" ");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		String ans = conToWords(n);
		System.out.println(ans);
	}

}
