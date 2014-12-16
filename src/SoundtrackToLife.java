import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {
		// 1. Find out what mood the user is in. Store their answer in a
		// variable.
		String askingmood = JOptionPane.showInputDialog(" What's your mood ? ");
		// 2. If they are in a happy mood, use the playVideo method to play a
		// happy song from YouTube

		if (askingmood.equalsIgnoreCase("happy")) {
			playVideo("https://www.youtube.com/watch?v=iS1g8G_njx8");
		} else if (askingmood.equalsIgnoreCase("sad")) {
			playVideo("https://www.youtube.com/watch?feature=player_detailpage&v=hLQl3WQQoQ0");
		} else if (askingmood.equalsIgnoreCase("mad")) {
			playVideo("https://www.youtube.com/watch?v=__Dw3YC6WzY");
		} else if (askingmood.contains("love")) {
			playVideo("https://www.youtube.com/watch?v=3OVUkUHtlWc");
		}

		// 3. Play different songs for other moods

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
