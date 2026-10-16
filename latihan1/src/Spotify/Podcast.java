package Spotify;

public class Podcast extends MediaAudio {
 private String host;

 public Podcast(String judul, int durasiDetik, String host) {
     super(judul, durasiDetik);
     this.host = host;
 }

 @Override
 public void putarAudio() {
     System.out.println("Memutar podcast: " + getJudul() + " oleh " + host);
 }
}
