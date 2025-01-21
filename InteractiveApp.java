package Day4;

import java.util.*;
public class InteractiveApp {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String string = "";
		
		ArrayList<String> word = new ArrayList<>();
		word.add("password1");
		word.add("password2");
		word.add("password3");
		
				
		System.out.println("Type something then press enter, " +
		"or type \"end\" to end the program");
		while (!(string = scanner.next()).equals("end")) {
			if(word.contains(string))
			{
				String ans = string.replaceAll("\\w", "*");
				System.out.println(ans + " It is Censored!");
			}
			else
			{
				System.out.println("You typed " + string.toUpperCase() + "!");
			}
		}
		System.out.println("Program ended!");
	}

}
