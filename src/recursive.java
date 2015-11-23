/*
 * David Casarrubias-Mena
 * COSC 201
 * November 6, 2015
 * 
 * this program reads in a number from the user and prints out all the ones that appear in it's binary notation format. 
 */
import java.util.Scanner;

public class recursive{
	public void printOnes(int n){ // method that prints out the number of times that a one appears in binary 
		System.out.println("Number of ones is binary format: " + onesInBinary(n)); // 
	}
	public int onesInBinary(int n){
		if(n == 0){ // base cases. If the number is zero just return 0. 
			return 0;
		}
		if (n == 1){ // base case. If the number is 1 return 1. 
			return 1;
		}
		else 
			return onesInBinary(n / 2) + n % 2; // if number is neither 1 or 0, return the sum of n % 2 and n/2 recursively. 
		
	}
	
	public static void main(String [] args){
		recursive r = new recursive(); 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: "); 
		int num = input.nextInt();
		
		r.printOnes(num); // pass number entered by user to printOnes method which will print out the number of times 1 appears in binary. 
	}
}