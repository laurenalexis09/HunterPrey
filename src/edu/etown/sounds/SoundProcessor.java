package edu.etown.sounds;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SoundProcessor {

	public static void main(String[] args) {
		

	}
	
	public static void playMusic(String musicLocation) {
		try {
			File musicPath = new File(musicLocation);
			
			if (musicPath.exists())
			{
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			else
			{
				System.out.println("Can't find file");
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void playSound(String soundLocation) {
		try {
			File soundPath = new File(soundLocation);
			
			if (soundPath.exists())
			{
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
			}
			else
			{
				System.out.println("Can't find file");
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
