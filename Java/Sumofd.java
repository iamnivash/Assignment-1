//Print the sum of digits
package Java;

import java.util.Scanner;
public class Sumofd{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n > 0)
		{
			int t = n%10;
			sum = sum + t;
			n = n/10;
			
		}
	    System.out.print(sum);
	}
	

}

