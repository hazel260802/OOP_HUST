package lab01;

import javax.swing.JOptionPane;

//2.2.5	Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.
public class SimpleCal {

	public static void main(String[] args) {

		String strNum1, strNum2;
		String strNotification = "The sum: ";
		
		//Input: 2 double numbers
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		//strNotification += strNum1 + " and ";
		
		
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		//strNotification += strNum2;
		
		// Calculate sum of 2 double numbers 
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		double sum = num1 + num2;
		strNotification += sum + "\n";
		
		// Calculate difference of 2 double numbers 
		strNotification += "The difference: ";
		double diff = num1 - num2;
		strNotification += diff + "\n";
		
		// Calculate product of 2 double numbers 
		strNotification += "The product : ";
		double prod = num1 * num2;
		strNotification += prod + "\n";
		
		// Calculate quotient of 2 double numbers 
		strNotification += "The quotient: ";
		double quotient = num1 / num2;
		strNotification += quotient + "\n";
		
		
		JOptionPane.showMessageDialog(null, strNotification, "Show all the results", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
