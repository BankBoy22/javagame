package pokemon;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class BgmTest{
    private Clip clip;
    private boolean isLoop;
    private AudioInputStream audioInputStream;
    private File audioFile;
    
    
    public BgmTest(String pathName, boolean isloop) {
        this.isLoop = isloop;
        try {
            clip = AudioSystem.getClip();
            audioFile = new File(pathName);
            audioInputStream = AudioSystem.getAudioInputStream(audioFile);
            clip.open(audioInputStream);
        } catch (UnsupportedAudioFileException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
            catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
    
    public void start() {
        clip.setFramePosition(0);
        clip.start();
        if(isLoop)
            clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
    public void stop() {
        clip.stop();
    }
    
    
}