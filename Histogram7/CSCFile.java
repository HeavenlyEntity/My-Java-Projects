/*
  Name:  Chris Santo
  Date:  Saturday, January 10, 2015
  Desc:  CSCFile object - File with 100 integers
*/
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

class CSCFile
{
	int[] values = new int[100];

	public CSCFile(String infile)
	{
		try {
				Scanner inputStream = new Scanner(new FileInputStream(infile));
				for (int x = 0; x < 100; ++x)
					values[x] = inputStream.nextInt();
		    }
		catch (InputMismatchException e)
  			{
				System.out.println("One of input values is a non-integer.");
				System.exit(0);
			}
		catch (FileNotFoundException e)
		    {
				System.out.println("The filename " + infile + " was not found.");
				System.exit(0);
		    }
		catch (NoSuchElementException e)
		    {
				System.out.println("There weren't enough numbers in the file.");
				System.exit(0);
		    }
	}

	public int[] get()
	{
		return values;
	}
}

