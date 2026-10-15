package Pembelajaran_01_Runtutan;


import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int HARGA = 6300;

        System.out.print("Masukan jumlah produk yang dibeli: ");
        int qty = input.nextInt();

        int total = qty * HARGA;
        double diskon = 0;

        if (qty > 0 && qty % 3 == 0) {
            diskon = total * 0.05;
        }

        double subtotal = total - diskon;

        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter format =
            DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println("==================================================");
        System.out.println("              TOKO SERBAGUNA IBIK");
        System.out.println("==================================================");
        System.out.println("Masukan jumlah produk yang dibeli: " + qty);
        System.out.println();
        System.out.println(waktu.format(format));
        System.out.printf("%-20s %5s %12s %12s%n",
                "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println("==================================================");
        System.out.printf("%-20s %5d Rp %,9d Rp %,9d%n",
                "ROTI ENAK", qty, HARGA, total);
        System.out.println("--------------------------------------------------");
        System.out.printf("Diskon   : %.0f%%%n",
                total > 0 ? diskon / total * 100 : 0);
        System.out.printf("Sub Total: Rp %,.0f%n", subtotal);
        System.out.println("==================================================");

        input.close();
    }
}

