//Check whether the given number is palindrome or not
package Java;
import java.util.Scanner;
public class Armsnumberornot {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int back = n;
		String s = String.valueOf(n);
		int len = s.length();
		int sum = 0;
		while(n > 0)
		{
			int t = n%10;
			sum = sum + (int)Math.pow(t, len);
			n = n/10;
		}
		if(sum == back)
		{
			System.out.println("Yes, it is Armstrong number");
		}
		else
		{
			System.out.println("No, it is not an Armstrong number");
		}
	}

}
