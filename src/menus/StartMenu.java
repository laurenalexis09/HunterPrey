package menus;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import biome.Biome;
import level.Difficulty;
import main.HunterPrey;
import utilities.ColorUtilities;

public class StartMenu {
	Color color1 = new Color(126, 160, 255);

	public StartMenu(){

		UIManager.put("OptionPane.background", color1);
		UIManager.put("Panel.background", color1);
<<<<<<< HEAD
=======

		myPanel.setBackground(color1);
		myPanel.add(new JLabel("Welcome to the game"));
	//	myPanel.add(Theme);
//		myPanel.add(Box.createHorizontalStrut(15));
	//	myPanel.add(new JLabel("Difficulty: (Easy, Medium, Hard) "));
	//	myPanel.add(hardness);
//		myPanel.add(new JLabel("<html> Rules: <br> You are prey running from the hunter. <br> Use the mouse to run away. <br> The game ends when you are hit by the hunter. <br> Note: It may end right away depending on the placement of the hunter <br> <strong> WARNING: This game has flashing colors.<br> Close this window if you are sensitive to flashing lights.<strong> </html>"));

>>>>>>> 0340d3c4155c43d90f5cbf84dfd9a421f7e3ac6e
		UIManager.put("OptionPane.okButtonText", "Okay!");

		ImageIcon icon = new ImageIcon("Bear.png");

<<<<<<< HEAD
		int result = JOptionPane.showOptionDialog(null, "Welcome to the game!", "HunterPrey", JOptionPane.PLAIN_MESSAGE, 0, icon, null, null);
=======
		int result = JOptionPane.showConfirmDialog(null, "Welcome to the game!", "HunterPrey", JOptionPane.PLAIN_MESSAGE);
>>>>>>> 0340d3c4155c43d90f5cbf84dfd9a421f7e3ac6e
		if (result == JOptionPane.OK_OPTION) {
			new HunterPrey().run();
		}
	}
	
	public static void main(String[] args){
		new StartMenu();
	}
}
