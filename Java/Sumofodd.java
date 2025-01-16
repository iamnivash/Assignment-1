//Print the sum of odd numbers from 1 to 100
package Java;

public class Sumofodd {
	public static void main(String[] args)
	{
	int sum = 0;
	for(int i=1;i<=100;i++)
	{
		if(i%2!=0)
		{
			sum = sum + i;
		}
	}
	System.out.print(sum);
	
	}

}
