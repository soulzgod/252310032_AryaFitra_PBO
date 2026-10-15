package Pembelajaran_01_Runtutan;


import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Students myBio = new Students();

        System.out.print("Masukkan NPM: ");
        Integer npm = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan nama lengkap: ");
        String fullname = input.nextLine();

        System.out.print("Masukkan nama kelas: ");
        String className = input.nextLine();

        System.out.print("Masukkan semester: ");
        Integer semester = input.nextInt();

        System.out.print("Masukkan IPK: ");
        Float gpa = input.nextFloat();

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NPM          : " + myBio.getNPM(npm));
        System.out.println("Nama Lengkap : " + myBio.getFullname(fullname));
        System.out.println("Nama Kelas   : " + myBio.getClassName(className));
        System.out.println("Semester     : " + myBio.getSemester(semester));
        System.out.println("IPK          : " + myBio.getGPA(gpa));

        input.close();
    }
}
