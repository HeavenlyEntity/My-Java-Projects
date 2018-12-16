// Alec Mingione
// 07/19/2018
//Program: DoubleBy and Quadruple 
//
import java.util.Scanner;

public class MathMethods {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int	number = 1 ;
		
		
		System.out.print("Enter your number to double: ");
		doubleMe(number=scan.nextInt(), number, number);
		quadrupleMe(number, number);
	}
	
	public static void doubleMe(int number, int doubleby, int total) { 
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	    	System.out.println((int) number + number + "\n 'Number Saved!' \n");
	    	System.out.print("Enter How mant times you want to double your number: ");
	    	doubleby = scan.nextInt();
	    	System.out.println("Your number (" + number + ") doubled by " + doubleby + " heres your output.");
	    	total = (number * 2) * doubleby;
	    	System.out.print(" = " + (int)total + "\n");
	    	
	    }
	public static void quadrupleMe(int quadnum, int number) {
		quadnum = number * 4;
		System.out.println("Quadrupled your number (" + number + ") = " + (int)quadnum );
		
		System.out.println("\n Thanks for using my MathMethods Program!");
	   
	}
}

