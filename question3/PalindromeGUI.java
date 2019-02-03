package question3;

/**
 * PalindromeGUI @author Justin Kord 
 * Student number 0360764 
 * This GUI representation asks the user to enter a String
 * the checks if the string is a proper Palindrome.
 * The result is then shown in the text area.
 */

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
import java.security.InvalidParameterException;

public class PalindromeGUI extends JPanel implements ActionListener {

	String n;

	// create a JPanel to add components
	JPanel panel = new JPanel();

	JPanel panelTwo = new JPanel();
	// create buttons to perform actions

	JButton addOne = new JButton("Add Text"),

			answer = new JButton("Palindrome?");

	JLabel add1 = new JLabel("Type in text");

	JTextField addOneTF = new JTextField();

	JLabel jlAnswer = new JLabel("Answer");

	// result text area
	TextArea result = new TextArea(10, 10);

	PalindromeGUI() {
		/* add components to JPanel and JFrame */

		result.setEditable(false);

		addOne.addActionListener(this);

		answer.addActionListener(this);

		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

		setLayout(new GridLayout(1, 3));

		panelTwo.setLayout(new GridLayout(10, 2));

		panelTwo.add(add1);
		panelTwo.add(new JLabel());

		panelTwo.add(addOneTF);
		panelTwo.add(addOne);

		panelTwo.add(answer);

		panel.add(result);
		panelTwo.add(panel);

		add(panelTwo);
		panel.add(result);
		add(panel);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == addOne) {
			JOptionPane.showMessageDialog(this, "added");
		}
		if (ae.getSource() == answer) {
			result.setText("");
			String one = addOneTF.getText();
			PalindromeCheck check = new PalindromeCheck();
			// check.PalindromeCheck(one);
			result.append(check.PalindromeCheck(one));
		}
	}

	public static void main(String[] args)

	{

		JFrame jf = new JFrame();

		jf.setDefaultCloseOperation
		// make sure the program exits when the frame closes
		(JFrame.EXIT_ON_CLOSE);

		PalindromeGUI s = new PalindromeGUI();
		// set the title
		jf.setTitle("Palindrome Check");

		jf.add(s);

		jf.pack();

		jf.setVisible(true);

	}
}
