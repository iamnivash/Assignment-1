package Day4;

import java.util.*;
public class SimpleCalc {
	int num1;
	int num2;
	
	public SimpleCalc(int a, int b)
	{
		this.num1 = a;
		this.num2 = b;
	}
	
	public int sum()
	{
		return num1+num2;
	}
	
	public int sub()
	{
		return num2-num1;
	}
	
	public int mul()
	{
		return num1*num2;
	}
	
	public int div()
	{
		if (num2 == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return num1 / num2;
	}
	
	public int rem()
	{
		return num1%num2;
	}
	
	public int largest()
	{
		return Math.max(num1, num2);
	}
	
	public int smallest()
	{
		return Math.min(num1, num2);
	}
	public double avg()
	{
		return (num1+num2)/2.0;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second number: ");
		int b = sc.nextInt();
		
		SimpleCalc calc = new SimpleCalc(a, b);
		
		System.out.println("\nChoose an operation:");
	    System.out.println("1. Sum");
	    System.out.println("2. Subtract");
	    System.out.println("3. Multiply");
	    System.out.println("4. Divide");
	    System.out.println("5. Remainder");
	    System.out.println("6. Largest");
	    System.out.println("7. Smallest");
	    System.out.println("8. Average");
	    System.out.print("Enter your choice (1-8): ");
	    int choice = sc.nextInt();

	    // Perform the chosen operation
	    switch (choice) {
	        case 1:
	            System.out.println("Result: " + calc.sum());
	            break;
	        case 2:
	            System.out.println("Result: " + calc.sub());
	            break;
	        case 3:
	            System.out.println("Result: " + calc.mul());
	            break;
	        case 4:
	            System.out.println("Result: " + calc.div());
	            break;
	        case 5:
	            System.out.println("Result: " + calc.rem());
	            break;
	        case 6:
	            System.out.println("Result: " + calc.largest());
	            break;
	        case 7:
	            System.out.println("Result: " + calc.smallest());
	            break;
	        case 8:
	            System.out.println("Result: " + calc.avg());
	            break;
	        default:
	            System.out.println("Invalid choice. Please enter a number between 1 and 8.");
	    }
	}
	
	
	
}
