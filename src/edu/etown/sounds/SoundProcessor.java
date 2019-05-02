package edu.etown.sounds;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundProcessor {

	public void playMusic(String musicLocation) {
		try {
			
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(getClass().getResource(musicLocation));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void playSound(String soundLocation) {
		try {
			
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(getClass().getResource(soundLocation));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start();
			
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
