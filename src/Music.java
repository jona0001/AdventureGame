import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;
public class Music {
    public static void playAudioFile(String audioFilePath) {
        try {
            URL lydURL = Music.class.getResource(audioFilePath);
            if (lydURL == null) {
                System.out.println("Filen blev ikke fundet: " + audioFilePath);
                return;
        }
            AudioInputStream audioInputCurrent = AudioSystem.getAudioInputStream(lydURL);

            Clip soundClip = AudioSystem.getClip();
            soundClip.open(audioInputCurrent);

            soundClip.start();
            Thread.sleep(soundClip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


