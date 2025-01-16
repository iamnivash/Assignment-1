//Check Whether the given integer is palindrome or not
package Java;
import java.util.*;
public class Palindromeint {
	public static int checkPalindrome(int n)
	{
		int back = n;
		int pv = 10;
		int sum = 0;
		while(n > 0)
		{
			int t = n%10;
			sum = sum*pv + t;
			n = n/10;
			
		}
		if(sum == back)
		{
			return 1;
		}
		return 0;
	}
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   for(int i=1;i<=n;i++)
	   {
		   if(checkPalindrome(i) == 1)
		   {
			   System.out.print(i + " ");
		   }
	   }
	   
	}
	

}
