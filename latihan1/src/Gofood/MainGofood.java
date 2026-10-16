package Gofood;


public class MainGofood {
 public static void main(String[] args) {
     PesananFood pesanan = new PesananFood("PSN-001", "Nasi Goreng");
     pesanan.hitungTotal(25000, 2);
     Driver driver = new Driver("DRV-01", "Budi");

     driver.terimaPesanan(pesanan);
     System.out.println("Total harga : Rp" + pesanan.getTotalHarga());
     System.out.println("Diantar oleh: " + pesanan.getDriver().getNamaDriver());
     // pesanan.totalHarga = 0;  // ERROR: totalHarga bersifat private
 }
}
