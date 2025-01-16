//Print the all the prime numbers and their sum and average
package Java;
import java.util.*;
public class Prime {
	public static int getPrime(int n)
    {
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
	public static void main(String[] args)
	{
	Scanner sc = new Scanner (System.in);
	int e;
	//s = sc.nextInt();
	e = sc.nextInt();
	int sum = 0;
	int c = 0;
	for(int i=2;i<=e;i++)
	{
	    if(getPrime(i) == 1)
	    {
	        sum = sum + i;
	        System.out.print(i + " ");
	        c++;
	    }
	}
	System.out.println();
	System.out.println("The sum of N prime Numbers is: " + sum);
	System.out.println("The avg of N prime Numbers is: " + sum/c);
}

}
