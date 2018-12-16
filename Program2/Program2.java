//--------------------------------------------------------------------------------------------------------\\
//
// Name: Alec Mingione
// Program :HiLo
// Professor: Santo
// Date: October 21, 2016
//
//--------------------------------------------------------------------------------------------------------//
import java.util.Scanner;
import java.lang.String;
import java.util.Random;


public class Program2 {

public static void main (String[] args){



// Declaring the Variables
	Random gen = new Random();
	int num = gen.nextInt(100) + 1;
	//int num= 1;
	int tries = 0;
	Scanner sc = new Scanner (System.in);
	boolean win = false;
	int gnum; // users guessing number
	String resume;

System.out.printf("Hello welcome to your biggest frustrations of... \n Guessing Numbers!\n I'm thinking of a number between 1 and 100-\n\nat any given point in time you can just hit \"0\" to quit.");
	do {
		while (win == false){

			System.out.printf("\nEnter your guess: ");

			gnum=sc.nextInt();
		    tries++;


	if (gnum == 0){
		System.exit(0);
	}
	if (gnum == num){
		win = true;
	}
	else if (gnum < num){
		System.out.println("You missed! That number was too low, Try Again \n\n");
	}
	else if (gnum > num){
		System.out.println("You missed! That number was too high, Try again \n\n");
	}
}

		System.out.println("You're a real winner lad! You Guessed correctly.");
		System.out.println("The number was as follows: " + num);
		System.out.println("You have accomplished the following mission in " + tries + ((tries==1) ? " try" : " tries"));
		num = gen.nextInt(100)+1 ;
		win = false;
		System.out.println("Would you like to try again? (y/n): \n");
		resume= sc.next();
	}while(resume.equalsIgnoreCase("Y"));
	System.out.println("\nThank you for using the Hi-Lo Program!");


	}

}
