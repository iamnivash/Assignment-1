package Day4;

import java.util.Scanner;


public class Reportcard {

    private String firstName;
    private String lastName;
    private String studentClass;

    
    private String[][] subjects;

   //
    public Reportcard(String firstName, String lastName, String studentClass, String[][] subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentClass = studentClass;
        this.subjects = subjects;
    }

    
    private static String getJudgment(int grade) {
    	
            if(grade>=90 && grade <=100)
            	return "Excellent";
            else if(grade>=80 && grade <90)
            	return "Very Good";
            else if(grade>=70 && grade <80)
            	return "Good";
            else if(grade>=60 && grade <70)
            	return "Average";
            else
            	return "Below Average";
    }

    
    public void displayReportCard() {
        System.out.println("--------------------------------------------------");
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Class: " + studentClass);
        System.out.println("--------------------------------------------------");
        System.out.println("| Subject      | Grade (Vote) | Judgment        |");
        System.out.println("--------------------------------------------------");

        
        for (int i = 0; i < subjects.length; i++) {
            String subject = subjects[i][0];
            String grade = subjects[i][1];
            String judgment = subjects[i][2];
            System.out.printf("| %-12s | %-12s | %-15s |\n", subject, grade, judgment);
        }

        System.out.println("--------------------------------------------------");
    }

   
    public static Reportcard[] createReportCard() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total number of Students: ");
        int num = scanner.nextInt();
        
        Reportcard[] table = new Reportcard[num];
        for(int k = 0;k < num;k++)
        {
        	System.out.println("-----------Student " + (k+1) +"-----------");
        	System.out.println();
        	
        	System.out.print("Enter student's first name: ");
            String firstName = scanner.next();
            
            
            System.out.print("Enter student's last name: ");
            String lastName = scanner.next();
            
            
            System.out.print("Enter student's class: ");
            String studentClass = scanner.next();
            
            
            System.out.print("How many subjects does the student have? ");
            int numSubjects = Integer.valueOf(scanner.next());

            
            String[][] subjects = new String[numSubjects][3];

            
            
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter the name of subject " + (i + 1) + ": ");
                subjects[i][0] = scanner.next();
                
                System.out.print("Enter the grade for " + subjects[i][0] + ": ");
                String grade = scanner.next();
                
                
                String judgment = getJudgment(Integer.valueOf(grade));
                
                
                subjects[i][1] = grade;
                subjects[i][2] = judgment;
            }
                
                table[k] = new Reportcard(firstName, lastName, studentClass, subjects);
            
        }
        return table;
        
        
    }
    

    public static void main(String[] args) {
        //Creating object 1 for Reportcard Class
        Reportcard[] reportCard = createReportCard();

        //Displaying the Report Card 1
        for(Reportcard ans : reportCard)
        {
        	ans.displayReportCard();
        }
        

    }
}


