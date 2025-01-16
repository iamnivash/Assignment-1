//Print the total odd number from 1 to 100
package Java;

public class Opdd {
	public static void main(String[] args)
	{
		int sum = 0;
	for(int i=1;i<=100;i++)
	{
		if(i%2!=0)
		{
			sum = sum + 1;
		}
	}
	System.out.print(sum);
	}
	

}
