package Spotify;

import java.util.ArrayList;
import java.util.List;

public class MainSpotify {
 public static void main(String[] args) {
     List<MediaAudio> playlist = new ArrayList<>();
     playlist.add(new Lagu("Hati-Hati di Jalan", 220, "Tulus"));
     playlist.add(new Podcast("Teknologi Hari Ini", 1800, "Rina"));
     playlist.add(new Lagu("Sempurna", 240, "Andra and The Backbone"));

     for (MediaAudio m : playlist) {
         m.putarAudio();
     }
 }
}
