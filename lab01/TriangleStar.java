package lab01;

import java.util.Scanner;

//6.3	Write a program to display a triangle with a height of n stars (*), n is entered by users.
public class TriangleStar {
	public static void main(String args[]){
		  Scanner keyboard = new Scanner(System.in);
		  
	      int i, j;
	      
	      System.out.println("The number of rows: " );
	      int my_input = keyboard.nextInt();
	      
	      System.out.println("The triangle star pattern: ");
	      for (i=0; i<my_input; i++){
	         for (j=(my_input-i); j>=0; j--){
	            System.out.print(" ");
	         }
	         for (j=0; j<=i; j++ ){
	             System.out.print("* ");
	        }
	        System.out.println();
	      }
	   }
}
