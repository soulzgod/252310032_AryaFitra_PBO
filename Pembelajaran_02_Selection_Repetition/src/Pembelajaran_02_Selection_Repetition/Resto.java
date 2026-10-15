package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Resto {
    private long Harga;

    private long getPrices(int pilihan) {
        if (pilihan == 1) {
            Harga = 22000;
        } else if (pilihan == 2) {
            Harga = 15000;
        } else if (pilihan == 3) {
            Harga = 25000;
        } else {
            Harga = 0;
        }

        return Harga;
    }

    public void chooseMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nMenu Sarapan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Pilih menu: ");

        int pilihan = input.nextInt();
        long hargaMenu = getPrices(pilihan);

        if (hargaMenu == 0) {
            System.out.println("Maaf menu yang anda masukan salah.");
        } else if (pilihan == 1) {
            System.out.println("Anda memesan Nasi Goreng dengan harga Rp " + hargaMenu);
        } else if (pilihan == 2) {
            System.out.println("Anda memesan Bubur Ayam dengan harga Rp " + hargaMenu);
        } else {
            System.out.println("Anda memesan Soto Ayam dengan harga Rp " + hargaMenu);
        }
    }
}