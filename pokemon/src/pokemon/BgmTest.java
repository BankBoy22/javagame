import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class BgmTest{
	
	public BgmTest(String pathName, boolean isloop) {
		try {
			Clip clip = AudioSystem.getClip();
			File audioFile = new File(pathName);
			AudioInputStream audiostream = AudioSystem.getAudioInputStream(audioFile);
			clip.open(audiostream);
			
			FloatControl gaincontrol = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			// sound volume set
			gaincontrol.setValue(-30.0f);
			
			clip.start();
			if (isloop)
				clip.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (LineUnavailableException e) {
			// TODO: handle exception
		} catch (UnsupportedAudioFileException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}