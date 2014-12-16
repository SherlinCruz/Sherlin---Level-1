

import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AutomatedPhoneSystem {

	public static void main(String[] args) {

		WhatToDo();

	}

	public static void WhatToDo() {

		speak("Welcome to the Wintriss Bank "
				+ "For account information, enter “1”.  To speak to a representative, enter “0");

		String WhichOne = JOptionPane
				.showInputDialog(" Type in your choise below : ");

		if (WhichOne.equals("1")) {
			speak("Please listen carefully to the following menu options: To hear your account balance, press “12”.  To hear a list of recent transactions, press “13”.  To change your account password, press “14”.  To speak to a representative, press “00”");
			String What = JOptionPane
					.showInputDialog(" Type in your choise below : ");
			if (What.equals("12")) {
				speak("Your current balance is $1,300.52");
			}
			if (What.equals("13")) {
				speak("There have been no transactions in the last 7 days.");

			}
			if (What.equals("14")) {

				speak("Please enter your new password.  It must be at least 4 characters longs.");
				String NewPassword = JOptionPane
						.showInputDialog("Enter your new password. It must be 4 characters long : ");

				speak("Your new password it " + NewPassword);

			}
			if (What.equals("00")) {
				speak("Please stay on the line.  I will connect you to a customer service representative.");
			} else {
				speak("");
			}

		} else if (WhichOne.equals("0")) {
			speak("	Please stay on the line.  I will connect you to a customer service representative.");

		}

	}

	static void speak(String words) {

		try {

			Runtime.getRuntime().exec("say " + words);

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}