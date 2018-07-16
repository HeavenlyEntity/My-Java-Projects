/*
Name: <Rhyeca Riley>
Prog: Minilab 7 - Histo
Date: <9/17/16>
Displays a histogram for every time a number in a category shows up
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Buttons8Panel extends JPanel
{
   private JButton increment, decrement, randomize;
   private JLabel label;
   private Random generator = new Random();
   private JPanel buttonPanel;
   private int random;
   private final int MAX = 100, MIN = 1;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the GUI.
   //-----------------------------------------------------------------
   public Buttons8Panel()
   {
	  random = 50;

      increment = new JButton("Increment");
      decrement = new JButton("Decrement");
      randomize = new JButton("Randomize");

      ButtonListener listener = new ButtonListener();
      increment.addActionListener(listener);
      decrement.addActionListener(listener);
      randomize.addActionListener(listener);

      label = new JLabel("" + random);

      buttonPanel = new JPanel();
      buttonPanel.setPreferredSize(new Dimension(400, 200));
      buttonPanel.setBackground(Color.red);
      buttonPanel.add(increment);
      buttonPanel.add(decrement);
      buttonPanel.add(randomize);
	  buttonPanel.setForeground(Color.gray);

      setPreferredSize(new Dimension(300, 100));
      setBackground(Color.gray);
      add(label);
      add(buttonPanel);
   }

   //*****************************************************************
   //  Represents a listener for both buttons.
   //*****************************************************************
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
		  if (event.getSource() == increment)
		  {
			  label.setText("" + (++random));
		  }
		  if (event.getSource() == decrement)
		  {
			  label.setText("" + (--random));
		  }
		  if (event.getSource() == randomize)
		  {
			  random = generator.nextInt(MAX) + MIN;
			  label.setText("" + random);
		  }
	  }
   }
}
