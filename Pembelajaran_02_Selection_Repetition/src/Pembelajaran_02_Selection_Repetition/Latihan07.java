package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Resto resto = new Resto();
        String ulang;

        do {
            resto.chooseMenu();

            System.out.print("Apakah anda akan memesan kembali? (y/n): ");
            ulang = input.next();
        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah memesan.");
        input.close();
    }
}