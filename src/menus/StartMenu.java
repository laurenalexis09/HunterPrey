package menus;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import main.HunterPrey;

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
