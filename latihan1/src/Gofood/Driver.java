package Gofood;

public class Driver {
 private String idDriver;
 private String namaDriver;
 private boolean tersedia = true;
 private PesananFood pesananAktif;

 public Driver(String idDriver, String namaDriver) {
     this.idDriver = idDriver;
     this.namaDriver = namaDriver;
 }

 public void terimaPesanan(PesananFood pesanan) {
     if (tersedia) {
         this.pesananAktif = pesanan;
         this.tersedia = false;
         pesanan.setDriver(this);
         System.out.println(namaDriver + " menerima pesanan "
                 + pesanan.getIdPesanan() + " (" + pesanan.getNamaMenu() + ")");
     } else {
         System.out.println(namaDriver + " sedang tidak tersedia.");
     }
 }

 public String getNamaDriver() { return namaDriver; }
}