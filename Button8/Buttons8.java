/*
Name: <Rhyeca Riley>
Prog: Minilab 7 - Histo
Date: <9/17/16>
Displays three buttons to choose from "Increment, Decrement, Randomize"
*/
import javax.swing.JFrame;

public class Buttons8
{
   //-----------------------------------------------------------------
   //  Creates and displays the main program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
	  //setLayout(new GridLayout(2, 3));

      JFrame frame = new JFrame("Increment Decrement Randomize");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new Buttons8Panel());

      frame.pack();
      frame.setVisible(true);
   }
}
