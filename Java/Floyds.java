//Flyod's Triangle
package Java;

public class Floyds {
	public static void main(String[] args)
	{
		System.out.println("FLYOD'S TRAINGLE 1");
		int len = 5;
		int k = 1;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(k + " ");
				k++;
			}
			System.out.println();		
		}
		
		System.out.println();
		System.out.println("FLYOD'S TRAINGLE 2");
		int n = 1;
		for(int i=0;i<3;i++)
		{
			for(int j=(3-i-1);j>0;j--)
			{
				System.out.print("  ");				
			}
			for(int j=0;j<(2*i)+1;j++)
			{
				System.out.print(n + " ");
				n++;
			}
			for(int j=(3-i-1);j>0;j--)
			{
				System.out.print(" ");				
			}
			System.out.println();
		}
	}

}
