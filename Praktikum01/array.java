package Praktikum01;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("==============================");
        System.out.println("Program Penghitung IP Semester");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();
        System.out.println("==============================");

        String[] namaMK = new String[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];
        int[] bobotSKS = new int[jumlahMK];

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i+1) + ": ");
            namaMK[i] = sc.nextLine();

            System.out.print("Masukkan nilai angka untuk " + namaMK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            System.out.print("Masukkan bobot SKS untuk " + namaMK[i] + ": ");
            bobotSKS[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------");

            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 55) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }
        }

        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-20s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-20s %-12.2f %-12s %-12.2f\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        double totalNilai = 0;
        int totalSKS = 0;
        for (int i = 0; i < jumlahMK; i++) {
            totalNilai += bobotNilai[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }
        
        System.out.println("==============================");
        double ipSemester = totalNilai / totalSKS;
        System.out.println("IP Semester: " + ipSemester);

        sc.close();
    }
}