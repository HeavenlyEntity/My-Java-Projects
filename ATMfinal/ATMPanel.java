// ATM Program 3
// Alec Mingione && James Pimley

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonListener;
import java.awt.*;
import java.awt.event.*;

public class ATMPanel extends JPanel {
	private boolean blocked20, blocked50, blocked100 ;
	private JButton withdraw20btn ,withdraw50btn, withdraw100btn, depositbtn, Quitbtn, ClearButton, enterButton,
	pin0btn, pin1btn, pin2btn, pin3btn, pin4btn, pin5btn, pin6btn, pin7btn, pin8btn, pin9btn;
	public int balance = 100 ;
	private int answer;
	private int receipt;
	private TextField InputDisplay ;
	String numberString = "";
	private JProgressBar progressBar;
	String pin = "";
	String depositVal = "";
	int attempts = 0;

	public ATMPanel() {
		setBounds(new Rectangle(0, 0, 754, 418));
		setBackground(Color.BLACK);
		setLayout(null);
		Image imgs = new ImageIcon(this.getClass().getResource("giphy3.gif")).getImage();

		/*
		 * Initializing Text Screen
		 */

		JPanel textPanel = new JPanel();
		textPanel.setBounds(10, 11, 709, 138);
		add(textPanel);
		textPanel.setLayout(null);

		JTextPane txtpnInstructionsArea = new JTextPane();
		txtpnInstructionsArea.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent e) {
			}
			public void inputMethodTextChanged(InputMethodEvent e) {
			}
		});

	//Instructions window\\

		txtpnInstructionsArea.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtpnInstructionsArea.setEditable(false);
		txtpnInstructionsArea.setText("INSTRUCTIONS AREA\r\n'Please Enter Pin on the numeric keypad below'\n'Withdraw cash in denominations of $20, $50, or $100'\n'Deposit by typing desired amount (up to $1000) on the keypad, then press the deposit button'");
		txtpnInstructionsArea.setBounds(10, 11, 689, 89);
		textPanel.add(txtpnInstructionsArea);

		InputDisplay = new TextField();
		InputDisplay.setEditable(false);
		InputDisplay.setText("");
		InputDisplay.setBounds(10, 106, 689, 22);
		textPanel.add(InputDisplay);

	//||||||||||||||||||||||||||||\\
	//Creating withdrawal buttons  \\
	//||||||||||||||||||||||||||||||\\

			withdraw20btn = new JButton("Withdraw 20$");
			withdraw20btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == withdraw20btn){
							balance = balance - 20;
							InputDisplay.setText("$"+balance);
							System.out.println(balance);
							if(balance<20) {
								withdraw20btn.setEnabled(false);
							}
							if (balance < 50){
								withdraw50btn.setEnabled(false);
							}
							if (balance <100){
								withdraw100btn.setEnabled(false);
							}
						}
				}
			});
			withdraw20btn.setBorder(new CompoundBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 165, 0), new Color(255, 215, 0)), new LineBorder(new Color(0, 0, 0), 1, true)), new LineBorder(new Color(0, 0, 0), 1, true)));
			withdraw20btn.setBounds(10, 156, 157, 41);
			add(withdraw20btn);
			withdraw20btn.setVisible(false);

			withdraw50btn = new JButton("Withdraw 50$");
			withdraw50btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == withdraw50btn){
						balance = balance - 50;
						InputDisplay.setText("$"+balance);
						System.out.println(balance);
						if(balance<20) {
							withdraw20btn.setEnabled(false);
							}
						if (balance < 50){
							withdraw50btn.setEnabled(false);
							}
						if (balance <100){
							withdraw100btn.setEnabled(false);
							}
 						}
				}
			});
			withdraw50btn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 215, 0), new Color(255, 165, 0)), new LineBorder(new Color(0, 0, 0), 2, true)));
			withdraw50btn.setBounds(10, 208, 157, 41);
			add(withdraw50btn);
			withdraw50btn.setVisible(false);

			withdraw100btn = new JButton("Withdraw 100$");
			withdraw100btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == withdraw100btn){
						balance = balance - 100;
						InputDisplay.setText("$"+balance);
						System.out.println(balance);
						if(balance<20) {
							withdraw20btn.setEnabled(false);
						}
						if (balance < 50){
							withdraw50btn.setEnabled(false);
						}
						if (balance <100){
							withdraw100btn.setEnabled(false);
							}
						}
				}
			});
			withdraw100btn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 0), new Color(255, 255, 0), new Color(255, 215, 0), new Color(255, 165, 0)), new LineBorder(new Color(0, 0, 0), 2, true)));
			withdraw100btn.setBounds(10, 260, 157, 41);
			add(withdraw100btn);
			withdraw100btn.setVisible(false);

			//||||||||||||||||||||||||||||||||||||\\
			//      Creating Deposit button       \\
			//||||||||||||||||||||||||||||||||||||\\

			depositbtn = new JButton("Deposit");
			depositbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					depositVal = numberString;
					int depInt = Integer.parseInt(depositVal);
					if(depInt <= 1000){
						balance = balance + depInt;
					}
					InputDisplay.setText("$"+balance);
					System.out.println(balance);
					numberString = ("");
					if(balance>=20) {
						withdraw20btn.setEnabled(true);
					}
					if (balance >= 50){
						withdraw50btn.setEnabled(true);
					}
					if (balance >=100){
						withdraw100btn.setEnabled(true);
					}
				}
			});
			depositbtn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 0), new Color(0, 255, 0), new Color(46, 139, 87), new Color(173, 255, 47)), new CompoundBorder(new BevelBorder(BevelBorder.RAISED, new Color(124, 252, 0), new Color(124, 252, 0), new Color(0, 255, 0), new Color(0, 255, 0)), new LineBorder(new Color(0, 0, 0), 2, true))));
			depositbtn.setBounds(10, 312, 157, 41);
			add(depositbtn);
			depositbtn.setVisible(false);

			//Quit button with functions

			Quitbtn = new JButton("Quit");
			Quitbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent quit) {
							if (quit.getSource() == Quitbtn)
							{

								answer = JOptionPane.showOptionDialog(Quitbtn,
									    "Are you sure you want to quit?"
									    	    + "",
									    	    "Quit?",
									    	    JOptionPane.YES_NO_OPTION,
									    	    JOptionPane.QUESTION_MESSAGE,
									    	    null,
									    	    null,
									    	   null);
								if (answer == 00){
								receipt =JOptionPane.showOptionDialog(Quitbtn,
										    "Would you like a receipt?"
										    	    + "",
										    	    "Receipt before you leave?",
										    	    JOptionPane.YES_NO_OPTION,
										    	    JOptionPane.QUESTION_MESSAGE,
										    	    null,
										    	    null,
										    	   null);
								System.out.println("" +"Balance = " + balance);
						// Including receipt prompting here as well
						//				if (receipt == 01 )
									System.exit(0);

					}
					}
				}
			});
			Quitbtn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(165, 42, 42), new Color(139, 0, 0)), new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(139, 0, 0), new Color(255, 0, 0), new Color(105, 105, 105), new Color(0, 0, 0)), new LineBorder(new Color(0, 0, 0), 2, true))));
			Quitbtn.setBounds(10, 364, 157, 43);
			add(Quitbtn);

			//-------------------------------------------------------------------------------\\
			//--------------------------------Pin-Pad Buttons--------------------------------\\
			//-------------------------------------------------------------------------------\\

			{
			pin1btn = new JButton("1");
			pin1btn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(50, 205, 50), new Color(50, 205, 50), new Color(173, 255, 47), new Color(0, 255, 0)), new LineBorder(new Color(0, 0, 0), 2, true)));
			pin1btn.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			pin1btn.setBounds(208, 166, 89, 41);
			add(pin1btn);


			pin2btn = new JButton("2");
			pin2btn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(50, 205, 50), new Color(50, 205, 50), new Color(173, 255, 47), new Color(152, 251, 152)), new LineBorder(new Color(0, 0, 0), 2, true)));
			pin2btn.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			pin2btn.setBounds(307, 166, 89, 41);
			add(pin2btn);

			pin3btn = new JButton("3");
			pin3btn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(50, 205, 50), new Color(50, 205, 50), new Color(173, 255, 47), new Color(152, 251, 152)), new LineBorder(new Color(0, 0, 0), 2, true)));
			pin3btn.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			pin3btn.setBounds(406, 166, 89, 41);
			add(pin3btn);

			pin4btn = new JButton("4");
			pin4btn.setBorder(new CompoundBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(50, 205, 50), new Color(50, 205, 50), new Color(173, 255, 47), new Color(152, 251, 152)), new LineBorder(new Color(0, 0, 0), 1, true)), new LineBorder(new Color(0, 0, 0))));
			pin4btn.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			pin4btn.setBounds(208, 218, 89, 41);
			add(pin4btn);

			pin5btn = new JButton("5");
			pin5btn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(50, 205, 50), new Color(50, 205, 50), new Color(173, 255, 47), new Color(152, 251, 152)), new LineBorder(new Color(0, 0, 0), 2, true)));
			pin5btn.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			pin5btn.setBounds(307, 218, 89, 41);
			add(pin5btn);

			pin6btn = new JButton("6");
			pin6btn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(50, 205, 50), new Color(50, 205, 50), new Color(173, 255, 47), new Color(152, 251, 152)), new LineBorder(new Color(0, 0, 0), 2, true)));
			pin6btn.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			pin6btn.setBounds(406, 218, 89, 41);
			add(pin6btn);

			pin7btn = new JButton("7");
			pin7btn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(50, 205, 50), new Color(50, 205, 50), new Color(152, 251, 152), new Color(173, 255, 47)), new LineBorder(new Color(0, 0, 0), 2, true)));
			pin7btn.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			pin7btn.setBounds(208, 270, 89, 41);
			add(pin7btn);

			pin8btn = new JButton("8");
			pin8btn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(50, 205, 50), new Color(50, 205, 50), new Color(173, 255, 47), new Color(152, 251, 152)), new LineBorder(new Color(0, 0, 0), 2, true)));
			pin8btn.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			pin8btn.setBounds(307, 270, 89, 41);
			add(pin8btn);

			pin9btn = new JButton("9");
			pin9btn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(50, 205, 50), new Color(50, 205, 50), new Color(173, 255, 47), new Color(152, 251, 152)), new LineBorder(new Color(0, 0, 0), 2, true)));
			pin9btn.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			pin9btn.setBounds(406, 270, 89, 41);
			add(pin9btn);

			pin0btn = new JButton("0");
			pin0btn.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(50, 205, 50), new Color(50, 205, 50), new Color(173, 255, 47), new Color(152, 251, 152)), new LineBorder(new Color(0, 0, 0), 2, true)));
			pin0btn.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 12));
			pin0btn.setBounds(307, 325, 89, 41);
			add(pin0btn);

			//-------------------------------------------------------------\\
			//---------------------Pin-Pad buttons end---------------------\\
			//-------------------------------------------------------------\\

			//Progress Bar

			progressBar = new JProgressBar(0,20);
			progressBar.setForeground(Color.GREEN);
			progressBar.setValue(0);
			progressBar.setStringPainted(true);
			progressBar.setBounds(505, 366, 214, 41);
			add(progressBar);

			ClearButton = new JButton("Clear");
			ClearButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					InputDisplay.setText("");
					numberString = ("");
				}
			});
			ClearButton.setBorder(new CompoundBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), new Color(0, 255, 255), new Color(64, 224, 208), new Color(32, 178, 170)), new BevelBorder(BevelBorder.LOWERED, new Color(32, 178, 170), new Color(0, 206, 209), new Color(0, 191, 255), new Color(70, 130, 180))), new LineBorder(new Color(0, 0, 0), 2, true)));
			ClearButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 28));
			ClearButton.setBounds(534, 166, 166, 66);
			add(ClearButton);

			enterButton = new JButton("Enter"); // Enter Button make to Pin and deposit
			enterButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					pin = numberString;
					int pinInt = Integer.parseInt(pin);
					if(pinInt == 7777){
						System.out.println("" + pin);
						withdraw20btn.setVisible(true);
						withdraw50btn.setVisible(true);
						withdraw100btn.setVisible(true);
						depositbtn.setVisible(true);
						numberString = ("");
						InputDisplay.setText("Access Granted. You have a balance of $" + balance);
					}
					else{
						InputDisplay.setText("Access Denied");
						numberString = ("");
						attempts++;
						System.out.println("attempt" + attempts);
						if(attempts > 2){
							System.exit(0);
						}
					}
				}
			});
			enterButton.setBorder(new CompoundBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), new Color(0, 255, 255), new Color(64, 224, 208), new Color(32, 178, 170)), new BevelBorder(BevelBorder.LOWERED, new Color(32, 178, 170), new Color(0, 250, 154), new Color(0, 255, 127), new Color(0, 255, 0))), new LineBorder(new Color(0, 0, 0), 2, true)));
			enterButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 28));
			enterButton.setBounds(534, 242, 166, 69);
			add(enterButton);

			// Background Image \\
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(imgs));
			label.setBounds(0, 0, 754, 418);
			add(label);

//pin

			char PinButtons[];

			PinButtons = new char[10];
			PinButtons[0]=0;
			PinButtons[1]=1;
			PinButtons[2]=2;
			PinButtons[3]=3;
			PinButtons[4]=4;
			PinButtons[5]=5;
			PinButtons[6]=6;
			PinButtons[7]=7;
			PinButtons[8]=8;
			PinButtons[9]=9;


			ButtonListener listener = new ButtonListener();
			pin1btn.addActionListener(listener);
			pin2btn.addActionListener(listener);
			pin3btn.addActionListener(listener);
			pin4btn.addActionListener(listener);
			pin5btn.addActionListener(listener);
			pin6btn.addActionListener(listener);
			pin7btn.addActionListener(listener);
			pin8btn.addActionListener(listener);
			pin9btn.addActionListener(listener);
			pin0btn.addActionListener(listener);
		}
	}
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

	  		 if (e.getSource() == pin1btn) {
						numberString += "1";
						InputDisplay.setText(numberString);
						System.out.println(numberString);
		 		} else if (e.getSource() == pin2btn) {
						numberString += "2";
					 	InputDisplay.setText(numberString);
					 	System.out.println(numberString);
		 		} else if (e.getSource() == pin3btn) {
		 				numberString += "3";
		 				InputDisplay.setText(numberString);
		 				System.out.println(numberString);
		 		} else if (e.getSource() == pin4btn) {
		 				numberString += "4";
		 				InputDisplay.setText(numberString);
		 				System.out.println(numberString);
		 		} else if (e.getSource() == pin5btn) {
		 				numberString += "5";
		 				InputDisplay.setText(numberString);
		 				System.out.println(numberString);
		 		} else if (e.getSource() == pin6btn) {
		 				numberString += "6";
		 				InputDisplay.setText(numberString);
		 				System.out.println(numberString);
				} else if (e.getSource() == pin7btn) {
						numberString += "7";
						InputDisplay.setText(numberString);
						System.out.println(numberString);
				} else if (e.getSource() == pin8btn) {
						numberString += "8";
						InputDisplay.setText(numberString);
						System.out.println(numberString);
				} else if (e.getSource() == pin9btn) {
					   	numberString += "9";
					   	InputDisplay.setText(numberString);
					   	System.out.println(numberString);
				} else if (e.getSource() == pin0btn) {
	   					numberString += "0";
					    InputDisplay.setText(numberString);
					    System.out.println(numberString);
				}
		}
	}
}