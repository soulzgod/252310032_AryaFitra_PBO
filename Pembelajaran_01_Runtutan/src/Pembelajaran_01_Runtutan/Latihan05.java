package Pembelajaran_01_Runtutan;


import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();

        System.out.println("Hasil: " + teks.toUpperCase());

        input.close();
    }
}

