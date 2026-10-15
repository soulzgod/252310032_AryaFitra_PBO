package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String PIN_BENAR = "252310032"; 
        double saldo = 1000000;
        boolean keluar = false;

        while (true) {
            System.out.print("Masukkan PIN: ");
            String pin = input.nextLine();

            if (pin.equals(PIN_BENAR)) {
                break;
            }

            System.out.println("PIN salah, silakan coba lagi.");
        }

        while (!keluar) {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan;

            try {
                pilihan = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka 1 sampai 4.");
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan nominal setor: Rp ");
                    double setor;

                    try {
                        setor = Double.parseDouble(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Nominal tidak valid.");
                        break;
                    }

                    if (setor > 0) {
                        saldo += setor;
                        System.out.println("Setor tunai berhasil.");
                        System.out.println("Saldo sekarang: Rp " + saldo);
                    } else {
                        System.out.println("Nominal harus lebih dari 0.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nominal tarik: Rp ");
                    double tarik;

                    try {
                        tarik = Double.parseDouble(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Nominal tidak valid.");
                        break;
                    }

                    if (tarik <= 0) {
                        System.out.println("Nominal harus lebih dari 0.");
                    } else if (tarik > saldo) {
                        System.out.println("Saldo tidak cukup.");
                    } else {
                        saldo -= tarik;
                        System.out.println("Tarik tunai berhasil.");
                        System.out.println("Saldo sekarang: Rp " + saldo);
                    }
                    break;

                case 4:
                    System.out.print("Yakin ingin keluar? (y/n): ");
                    String konfirmasi = input.nextLine();

                    if (konfirmasi.equalsIgnoreCase("y")) {
                        keluar = true;
                    }
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        }

        System.out.println("Terima kasih telah menggunakan ATM.");
        input.close();
    }
}