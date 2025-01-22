package Day4;

import java.util.*;

public class HeadsOrTails {
	
	String guess;
	
	public HeadsOrTails(String str)
	{
		this.guess = str;
	}
	
	public String getHeadsOrTails()
	{
		int ran = (int) (Math.random()*2);
		String s = "";
		switch(ran)
		{
			case 0:
				s = "Heads";
				break;
			case 1:
				s = "Tails";
				break;
				
		}
		
		return s;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Guess: ");
		String str = sc.next();
		
		HeadsOrTails g = new HeadsOrTails(str);
		
		String result = g.getHeadsOrTails();
        
        System.out.println("Coin toss result: " + result);
		
		if(result.equalsIgnoreCase(str))
		{
			System.out.println("You Won!");
		}
		else
		{
			System.out.println("You lost!");
		}
		
		
	}

}
