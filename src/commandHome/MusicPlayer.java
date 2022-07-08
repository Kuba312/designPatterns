package commandHome;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    int currentTrackNumber = 0;


    public void playFirstTrack() {
        currentTrackNumber++;
        if (currentTrackNumber == 1) {
            currentTrackNumber = 0;
        }
        System.out.println("Gram pierwszy utwór " + tracks.get(currentTrackNumber));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > 2) {
            currentTrackNumber = 0;
        }
        System.out.println("Gram następny utwór " + tracks.get(currentTrackNumber));

    }

    public void playRandomTrack() {
        String s = tracks.get(new Random().nextInt(tracks.size()));

        System.out.println("Gram losowy numer " + s.toString());

    }
}
