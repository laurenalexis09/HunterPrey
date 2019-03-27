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
		UIManager.put("OptionPane.okButtonText", "Okay!");

		ImageIcon icon = new ImageIcon("Bear.png");

		int result = JOptionPane.showOptionDialog(null, "Welcome to the game!", "HunterPrey", JOptionPane.PLAIN_MESSAGE, 0, icon, null, null);
		if (result == JOptionPane.OK_OPTION) {
			new HunterPrey().run();
		}
	}
	
	public static void main(String[] args){
		new StartMenu();
	}
}
