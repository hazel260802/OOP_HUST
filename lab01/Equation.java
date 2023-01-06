package lab01;
import java.util.Scanner;
//2.2.6	Write a program to solve:
public class Equation {

	public static void main(String[] args) {
		
		double a,b,c;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What equations you want to solve?");
    	System.out.println("1. Solving the first-degree equation (linear equation) with one variable");
    	System.out.println("2. Solving the first-degree equation (linear system) with two variables");
    	System.out.println("3. Solving the second-degree equation with one variable");
    	System.out.println("Your option [1,2,3]: ");
		int input = keyboard.nextInt();
	    switch (input) {
        case 1:
        	System.out.print("a: ");
             a = keyboard.nextDouble();

             System.out.print("b: ");
             b = keyboard.nextDouble();

             if (a != 0) {
                 double solution = -b / a;
                 System.out.printf("The solution is: %f", solution);
             } else {
                 if (b == 0) {
                     System.out.println("The solution is all x!");
                 } else {
                     System.out.println("No solution!");
                 }
             }
        	break;
        case 2:
            /* we solve the linear system
             * a_11 x_1+a_12 x_2=b_1 (1)
             * a_21 x_1+a_22 x_2=b_2 (2)
             */
        	
        	// input: equation (1)
        	System.out.print("a11: ");
            double a11 = keyboard.nextDouble();
            System.out.print("a12: ");
            double a12 = keyboard.nextDouble();
            System.out.print("b1: ");
            double b1 = keyboard.nextDouble();
            
            // input: equation (2)
        	System.out.print("a21: ");
            double a21 = keyboard.nextDouble();
            System.out.print("a22: ");
            double a22 = keyboard.nextDouble();
            System.out.print("b: ");
            double b2 = keyboard.nextDouble();
            
            double determinant = a11 * a22 - a12 * a21;
            if(determinant != 0) {
                double x1 = (b1 * a22 - a12 * b2)/determinant;
                double x2 = (a11*b2 - b1*a21)/determinant;
                System.out.printf("The solution is: x1 = %f, x2 = %f\n", x1, x2);
            } else {
            	double dx = b1 * a22 - b2 * a12;
            	if(dx==0)System.out.println("Many solutions!");
            	else System.out.println("No solution!");
            }
        	break;
        case 3:
        	System.out.print("a: ");
            a = keyboard.nextDouble();

            System.out.print("b: ");
            b = keyboard.nextDouble();
            
            System.out.print("c: ");
            c = keyboard.nextDouble(); 
		
			if (a==0) System.out.printf("The solution is: x = %f", -c/b);
			else{   
	            
	            double delta = b * b - 4.0 * a * c;  
	            
	            if (delta> 0.0){  
		            double x1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);  
		            double x2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);  
		            System.out.printf("The solution is: x1 = %f, x2 = %f\n", x1, x2);
	            }   
	            else if (delta == 0.0){  
		            double x1 = -b / (2.0 * a);  
		            System.out.printf("The solution is: x1 = x2 = %f\n", x1);
	            }   
	            else{  
	            	System.out.println("No solution!");
	            }  
	        	break;
		    }
	    }
	}

}
