/*
		Name: Alec Mingione
		Minilab: 	Histogram 7
		Date:		November 2, 2016

*/

public class Histogram7 {
	public static void main( String args[])
	{
		CSCFile inputFile = new CSCFile("inputfile1.txt");
		int[] numbers = inputFile.get();

System.out.println("Welcome to Histogram 7 Minilab");
	for(int category=0; category < 10; category++) // loop to catagorize
	{
		System.out.printf("%3d-%-3d | ", category*10+1, category*10+10);

		for(int x=0; x<100; x++) // loop for the array
		{
			if(numbers[x] >= category*10+1 && numbers[x] <= category*10+10)
			{
				System.out.print("*"); // found an int print the asterisk
			}
		}
        System.out.print("\n");
		}
	}
}