package menus;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GameOverMenu {
	
	public GameOverMenu() {
		UIManager.put("OptionPane.okButtonText", "Thanks!");
		JOptionPane.showMessageDialog(null, "Thanks for playing!", "I hope you had fun!", 2);
	}

}
