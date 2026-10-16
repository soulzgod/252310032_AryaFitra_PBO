package Spotify;

public class Lagu extends MediaAudio {
 private String artis;

 public Lagu(String judul, int durasiDetik, String artis) {
     super(judul, durasiDetik);
     this.artis = artis;
 }

 @Override
 public void putarAudio() {
     System.out.println("Memutar lagu: " + getJudul() + " - " + artis);
 }
}
