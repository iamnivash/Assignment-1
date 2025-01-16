//Check Whether the Given String is Armstrong or not
package Java;

import java.util.*;
public class Arms{
	public static int checkArm(int n)
	{
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
			return 1;
		}
		return 0;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = checkArm(n);
		if(ans == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("No");
		}
	}
	

}
