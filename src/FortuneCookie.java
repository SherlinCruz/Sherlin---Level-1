import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {

		FortuneCookie cookie = new FortuneCookie();

		cookie.showButton();

	}

	private void showButton() {

		System.out.println("BUTTON");

		JFrame frame = new JFrame();

		frame.setVisible(true);

		JButton button = new JButton();

		button.setVisible(true);

		frame.add(button);

		button.addActionListener(this);

		button.setText("CLICK ME");

		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Your fortune is: ");

		int random = new Random().nextInt(5);

		System.out.println(random);

		if (random == 0) {
			JOptionPane
					.showMessageDialog(null,
							"Don’t let friends impose on you, work calmly and silently.");
		}

		else if (random == 1) {

			JOptionPane.showMessageDialog(null,
					"A fresh start will put you on your way.");

		} else if (random == 2) {

			JOptionPane.showMessageDialog(null,
					"A smooth long journey! Great expectations.");

		} else if (random == 3) {

			JOptionPane.showMessageDialog(null,
					"An inch of time is an inch of gold.");

		} else if (random == 4) {

			JOptionPane.showMessageDialog(null, "Believe it can be done.");

		}

	}

}
