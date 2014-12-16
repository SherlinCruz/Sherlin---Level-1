package sherlin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.Random;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame JFrame = new JFrame();
	JPanel JPanel = new JPanel();

	int WhackedMoles = 10;
	int numberoftimes = 0;
	Date startTime = new Date();

	public static void main(String[] args) {
		int random = new Random().nextInt(24);
		new WhackAMole().drawButton(random);

	}

	private void drawButton(int number) {

		JFrame.add(JPanel);
		for (int i = 0; i < 24; i++) {

			JButton JButton = new JButton();
			JButton.setVisible(true);
			JButton.addActionListener(this);
			JPanel.add(JButton);

			if (i == number) {
				JButton.setText("Mole");

			}

		}

		JFrame.setVisible(true);

		JPanel.setVisible(true);

		JFrame.setSize(300, 300);

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (((AbstractButton) e.getSource()).getText() != "Mole")

		{
			speak("dork");

		} else {
			JFrame.dispose();
			int random = new Random().nextInt(24);
			new WhackAMole().drawButton(random);
			numberoftimes = numberoftimes + 1;

		}
		if (numberoftimes == 10) {
			endGame(startTime, WhackedMoles);
		}

	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane
				.showMessageDialog(
						null,
						"Your whack rate is "
								+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
								+ " moles per second.");

	}
}
