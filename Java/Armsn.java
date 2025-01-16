//Print all the Armstrong between given range
package Java;

import java.util.Scanner;
public class Armsn{
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
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end;i++)
		{
			if(checkArm(i) == 1)
			{
				System.out.print(i + " ");
			}
		}
	
	}
	

}
