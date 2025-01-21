package Day4;

import java.util.*;
public class Exercise4R {
	 private static int matrix[][] = {
			 {1, 7, 3, 9, 5, 3},
			{6, 2, 3},
			 {7, 5, 1, 4, 0},
			 {1, 0, 2, 9, 6, 3, 7, 8, 4}
	 };
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number between 0 to 9: ");
		 int num = sc.nextInt();
		 
		 int flag = 0;
		 int row = 0, col = 0;
		 int len = matrix.length;
		 for(int i=0;i<len;i++)
		 {
			 for(int j=0;j<matrix[i].length;j++)
			 {
				 if(matrix[i][j] == num)
				 {
					 row = i;
					 col = j;
					 flag = 1;
				 }
			 }
			 if(flag == 1)
				 break;
		 }
		 
		 System.out.println("The first Occurrence of Given Integer in the "+row+" row and "+col+" column");
		 
	 }

}
