package sherlin;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class buttons implements ActionListener {

	JButton button = new JButton();

	JButton button2 = new JButton();

	JButton button3 = new JButton();

	JButton button4 = new JButton();

	public static void main(String[] args) {

		buttons buttons = new buttons();

		buttons.showbutton();
	}

	private void showbutton() {

		JFrame frame = new JFrame();

		frame.setVisible(true);

		JPanel panel = new JPanel();

		panel.setVisible(true);

		button.setVisible(true);

		button2.setVisible(true);

		button3.setVisible(true);

		button4.setVisible(true);

		frame.add(panel);

		panel.add(button);

		panel.add(button2);

		panel.add(button3);

		panel.add(button4);

		button.setText("JOKE");

		button2.setText("PUNCHLINE");

		button3.setText("JOKE");

		button4.setText("PUNCHLINE");

		button.addActionListener(this);

		button2.addActionListener(this);

		button3.addActionListener(this);

		button4.addActionListener(this);

		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		if (e.getSource() == button) {

			JOptionPane.showMessageDialog(null,
					" What is the longest word in the dictionary?");

		}
		if (e.getSource() == button2) {

			JOptionPane.showMessageDialog(null,
					"Smiles, because there is a mile between each ‘s’");

		}
		if (e.getSource() == button3) {

			JOptionPane.showMessageDialog(null,
					" How do you make the number one disappear?");

		}
		if (e.getSource() == button4) {

			JOptionPane.showMessageDialog(null,
					" Add the letter G and it’s “GONE”");
			
			

		}
	}

}
