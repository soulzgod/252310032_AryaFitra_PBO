package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan minimal 20: ");
        int angka = input.nextInt();

        if (angka < 20) {
            System.out.println("Bilangan tidak boleh kurang dari 20.");
        } else {
            System.out.print("ASC: Faktor " + angka + " adalah ");

            boolean pertama = true;

            for (int i = 1; i <= angka; i++) {
                if (angka % i == 0) {
                    if (!pertama) {
                        System.out.print(", ");
                    }

                    System.out.print(i);
                    pertama = false;
                }
            }

            System.out.println();
        }

        input.close();
    }
}