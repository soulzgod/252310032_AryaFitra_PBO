package Pembelajaran_02_Selection_Repetition;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row: ");
        int baris = input.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= baris; j++) {
                if (i == 1 || i == baris || j == 1 || j == baris) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        input.close();
    }
}