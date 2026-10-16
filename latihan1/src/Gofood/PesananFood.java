package Gofood;

public class PesananFood {
 private String idPesanan;
 private String namaMenu;
 private double totalHarga;
 private Driver driver;

 public PesananFood(String idPesanan, String namaMenu) {
     this.idPesanan = idPesanan;
     this.namaMenu = namaMenu;
 }

 public void hitungTotal(double harga, int jumlah) {
     if (harga > 0 && jumlah > 0) {
         this.totalHarga = harga * jumlah;
     } else {
         System.out.println("Harga/jumlah tidak valid!");
     }
 }

 public double getTotalHarga() { return totalHarga; }
 public String getIdPesanan()  { return idPesanan; }
 public String getNamaMenu()   { return namaMenu; }
 public void setDriver(Driver driver) { this.driver = driver; }
 public Driver getDriver()     { return driver; }
}
