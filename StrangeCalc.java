package Day4;

import java.util.*;
public class StrangeCalc{
	ArrayList<Integer> arr = new ArrayList<>();
	
	public StrangeCalc(ArrayList<Integer> a)
	{
		arr = a;
	}
	
	public int sum()
	{
		int sum = 0;
		for(int i : arr)
		{
			sum += i;
		}
		
		return sum;
	}
	
	public int sub()
	{
		int ans = arr.get(0);
	    for (int i = 1; i < arr.size(); i++) {
	        ans -= arr.get(i);
	    }
	    return ans;
	}
	
	public int mul()
	{
		int sum = 1;
		for(int i : arr)
		{
			sum *= i;
		}
		
		return sum;
	}
	
	public double div()
	{
		double sum = arr.get(0);
		for(int i=1;i<arr.size();i++)
		{
			if (arr.get(i) == 0) {
	            System.out.println("Error: Division by zero.");
	            return 0;
	        }
			sum /= arr.get(i);
		}
		
		return sum;
	}
	
	public int rem()
	{
		int sum = arr.get(0);
		for(int i=1;i<arr.size();i++)
		{
			sum %= arr.get(i);
		}
		
		return sum;
	}
	
	public int largest()
	{
		return Collections.max(arr);
	}
	
	public int smallest()
	{
		return Collections.min(arr);
	}
	public double avg()
	{
		double sum = 0;
		for(int i : arr)
		{
			sum += i;
		}
		
		return (double)sum/arr.size();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
		
		System.out.println("----------Enter the numbers----------");
		String num;
		while(!(num = sc.next()).equals("stop"))
		{
		    a.add(Integer.valueOf(num));
		}
		
		StrangeCalc calc = new StrangeCalc(a);
		
		System.out.print("Enter the Operation: ");
		String choice = sc.next();
		
		if (choice.equals("+")) {
		    System.out.println("Result: " + calc.sum());
		} else if (choice.equals("-")) {
		    System.out.println("Result: " + calc.sub());
		} else if (choice.equals("*")) {
		    System.out.println("Result: " + calc.mul());
		} else if (choice.equals("/")) {
		    System.out.println("Result: " + calc.div());
		} else if (choice.equals("%")) {
		    System.out.println("Result: " + calc.rem());
		} else if (choice.equals("max")) {
		    System.out.println("Result: " + calc.largest());
		} else if (choice.equals("min")) {
		    System.out.println("Result: " + calc.smallest());
		} else if (choice.equals("avg")) {
		    System.out.println("Result: " + calc.avg());
		} else {
		    System.out.println("Invalid choice.");
		}

    }
}


