package lab01;
import java.util.Arrays;   

//6.5	Write a Java program to sort a numeric array, and calculate the sum and average value of array elements.
public class SortArray {

	public static void main(String[] args) {
		//defining an array of integer type   
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		long sum =0;
		double average;
		//invoking sort() method of the Arrays class  
		Arrays.sort(array);   
		System.out.print("Elements of array sorted in ascending order: ");  
		//prints array using the for loop  
		for (int i = 0; i < array.length; i++)   
		{       
			System.out.print(array[i]+" "); 
			sum+=array[i];
		}   		
		System.out.println();
		average= (double) sum/array.length;
		
		//The sum & and average value of array elements.
		System.out.println("The total: " + sum );
		System.out.println("The average value: " + average);
	}

}
