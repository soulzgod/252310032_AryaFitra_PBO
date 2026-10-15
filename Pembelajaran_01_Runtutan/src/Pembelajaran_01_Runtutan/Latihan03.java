package Pembelajaran_01_Runtutan;


import java.util.Scanner;

public class Latihan03 {
    static double diagonal1, diagonal2;
    static double sisi1, sisi2;

    static double alas, tinggiSegitiga;
    static double sisiA, sisiB, sisiC;
    static double panjangPrisma;

    static double luasLayangLayang() {
        return diagonal1 * diagonal2 / 2;
    }

    static double kelilingLayangLayang() {
        return 2 * (sisi1 + sisi2);
    }

    static double luasPermukaanPrisma() {
        double luasAlas = alas * tinggiSegitiga / 2;
        double kelilingAlas = sisiA + sisiB + sisiC;
        return 2 * luasAlas + kelilingAlas * panjangPrisma;
    }

    static double volumePrisma() {
        double luasAlas = alas * tinggiSegitiga / 2;
        return luasAlas * panjangPrisma;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PILIH BANGUN");
        System.out.println("1. Layang-layang");
        System.out.println("2. Prisma Segitiga");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Diagonal 1: ");
            diagonal1 = input.nextDouble();

            System.out.print("Diagonal 2: ");
            diagonal2 = input.nextDouble();

            System.out.print("Sisi pertama: ");
            sisi1 = input.nextDouble();

            System.out.print("Sisi kedua: ");
            sisi2 = input.nextDouble();

            System.out.println("Luas: " + luasLayangLayang());
            System.out.println("Keliling: " + kelilingLayangLayang());

        } else if (pilihan == 2) {
            System.out.print("Alas segitiga: ");
            alas = input.nextDouble();

            System.out.print("Tinggi segitiga: ");
            tinggiSegitiga = input.nextDouble();

            System.out.print("Sisi A segitiga: ");
            sisiA = input.nextDouble();

            System.out.print("Sisi B segitiga: ");
            sisiB = input.nextDouble();

            System.out.print("Sisi C segitiga: ");
            sisiC = input.nextDouble();

            System.out.print("Panjang prisma: ");
            panjangPrisma = input.nextDouble();

            System.out.println("Luas permukaan: " + luasPermukaanPrisma());
            System.out.println("Volume: " + volumePrisma());

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}

