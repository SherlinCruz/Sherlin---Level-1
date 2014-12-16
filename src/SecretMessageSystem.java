// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friends can read it.
 * 
 * Toolbox: String variables, main() method, JOptionPane.showInputDialog,
 * JOptionPane.showMessageDialog, String.equals, if statement
 */

public class SecretMessageSystem {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {

		// 1. Ask for an initial password, and store it in a variable
		String password = JOptionPane
				.showInputDialog("Type in a initial password please : ");
		// 2. Ask for a message and store it in a variable
		String message = JOptionPane.showInputDialog("Type in a message : ");
		// 3. Ask your friend for the password and store it in a variable
		String password2 = JOptionPane.showInputDialog("What's the password");
		// 4. If the password matches,
		if (password2.endsWith(password)) {
			JOptionPane.showMessageDialog(null, message);
		}

		// show the secret message
		// *5. OPTIONAL: let your friend keep guessing even if they are wrong

	}
}
