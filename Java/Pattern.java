//Patterns (Pyramid with stars and numbers)
package Java;

public class Pattern {
	
		public static void main(String[] args)
		{
			int len = 5;
			System.out.println("PATTERN 1");
			for(int i=0;i<len;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*" + " ");
				}
				System.out.println();		
				}
			System.out.println();
			System.out.println("PATTERN 2");
			for(int i=0;i<len;i++)
			{
				for(int j=0;j<len;j++)
				{
					System.out.print("*" + " ");
				}
				System.out.println();		
			}
			
			System.out.println();
			System.out.println("PATTERN 3");
			for(int i=0;i<len;i++)
			{
				for(int j=i;j<len;j++)
				{
					System.out.print("*" + " ");
				}
				System.out.println();		
			}	
			
			System.out.println();
			System.out.println("PYRAMID");
			for(int i=0;i<len;i++)
			{
				for(int j=(len-i-1);j>0;j--)
				{
					System.out.print(" ");				
				}
				for(int j=0;j<(2*i)+1;j++)
				{
					System.out.print("*");
				}
				for(int j=(len-i-1);j>0;j--)
				{
					System.out.print(" ");				
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println("NUMBER PYRAMID");
			int n = 1;
			for(int i=0;i<3;i++)
			{
				for(int j=(3-i-1);j>0;j--)
				{
					System.out.print(" ");				
				}
				for(int j=0;j<(2*i)+1;j++)
				{
					System.out.print(n);
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



