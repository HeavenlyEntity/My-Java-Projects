// ATM Program 3
// Alec Mingione && James Pimley

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.CompoundBorder;
/*
 * To Do list-
 *
 * Design ATM JPanel Program Window [X]
 * Create Buttons( Withdrawal,Keypad,User Screen, Enter, Clear, and Quit) [X]
 * Program Default Close operation [X]
 * Program Quit button [X]
 * Program On board screen [X]
 * Program buttons [X]- Deposit, PinEntry, Receipt, textpnTnstructionsArea reprint after pin is correct pin along with the setVisible methods
 * Program Calculations [X]
 * Program test [X]
 *
 */

public class ATM {
    public static int PIN = 7777 ; //sets pin for ATM


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame ATM = new JFrame("ATM - Program3");
		ATM.setMaximizedBounds(new Rectangle(0, 0, 745, 470));
		ATM.setMaximumSize(new Dimension(746, 465));
		ATM.setMinimumSize(new Dimension(745, 455));
		ATM.setLocationRelativeTo(null);
		ATM.setBounds(100, 100, 745, 470);
		ATM.getContentPane().add(new ATMPanel());
		ATM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ATM.setVisible(true);
		ATM.pack();
		ATM.setResizable(false);

	}
}
