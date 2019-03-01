package menus;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import biome.Biome;
import entities.Difficulty;
import world.Ecosystem;

public class StartMenu {
	static Biome biome;
	Difficulty dif;
	
	Color color1 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)); 
	
	
	JPanel myPanel = new JPanel();
	
	JTextField hardness = new JTextField(10);
	JTextField Theme = new JTextField(10);
	
	public String diff = null;
	public String themes = null;
	
	public StartMenu() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		JFrame frame = new JFrame();
		  frame.setDefaultCloseOperation
		         (JFrame.EXIT_ON_CLOSE);
		  frame.pack();
		 
		  UIManager.put("OptionPane.background", color1);
		  UIManager.put("Panel.background", color1);
		
		  myPanel.setBackground(color1);
		  myPanel.add(new JLabel("Theme: (Arctic, Forest, Mars, Random) "));
			myPanel.add(Theme);
			myPanel.add(Box.createHorizontalStrut(15));
			myPanel.add(new JLabel("Difficulty: (Easy, Medium, Hard) "));
			myPanel.add(hardness);
			myPanel.add(new JLabel("<html> Rules: <br> You are prey running from the hunter. <br> Use the mouse to run away. <br> The game ends when you are hit by the hunter. <br> Note: It may end right away depending on the placement of the hunter <br> <strong> WARNING: This game has flashing colors.<br> Close this window if you are sensitive to flashing lights.<strong> </html>"));
		
			UIManager.put("OptionPane.okButtonText", "Okay!");
		
			// ImageIcon icon = new ImageIcon(/Bear.png);
			
		int result = JOptionPane.showConfirmDialog(null, myPanel, "Welcome to Lauren's Hunter Prey Game! Enter the theme and difficulty that you'd like", JOptionPane.PLAIN_MESSAGE);
		if (result == JOptionPane.OK_OPTION) {
			
			themes = Theme.getText();
			diff =	hardness.getText();

			biome = Biome.getBiome(themes);

			dif = Difficulty.getDifficulty(diff);
			new Ecosystem(biome,dif);
		}
		else if(result == JOptionPane.CLOSED_OPTION) {
			frame.dispose();
		}
		
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		new StartMenu();
	}
}
