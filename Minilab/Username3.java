//********************************************************************
//  Name: Alec Mingione
//	Prog: Minilab 3 - Username3
//	Date: September 16, 2016
//
//********************************************************************

	import java.util.Scanner ;
	import java. lang.String ;
	import java.util.Random;
	public class Username3
{
		public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int num1;
		 num1 = generator.nextInt(90000) + 10000;
		//float num2;


	      String firstname;
	      String lastname;
	      String Nameabreveated ;
	      System.out.println("Welcome to Minilab 3 - Username.\n");
	      System.out.print("Enter your first name: ");
	      firstname = input.next();
	      System.out.print("Enter your last name: ");
	      lastname = input.next();

		  while (lastname.length() < 5)
		  {
			System.out.println(" Name must contain at least five characters: Try again!");
			System.out.print("Enter your last name: ");
		    lastname = input.next();
	  	  }

	      System.out.println();
	      //Username creation happens here
	      Nameabreveated = firstname.charAt(0) + lastname.substring(0,5) + num1;

	      Random rnd = new Random (); //getting our number specified to user
	      if (lastname.length() > 5)
	    	  Nameabreveated += lastname.substring(0,0);
	      else
	    	  Nameabreveated += Integer.toString(rnd.nextInt(90000));
	      System.out.println("Hello, " + firstname + " " + lastname + ", your username is: " + Nameabreveated );
	      System.out.println("Thank you for Username program!");
	      System.out.println();


	}
}
