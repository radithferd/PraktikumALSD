package Praktikum03;

import java.util.Scanner;

public class MatakuliahDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMk = sc.nextInt();
        Matakuliah17[] arrayofMatakuliah = new Matakuliah17[jumlahMk];

        for (int i = 0; i < arrayofMatakuliah.length; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            arrayofMatakuliah[i] = new Matakuliah17("","",0,0);
            arrayofMatakuliah[i].tambahData();
        }    

        for (int i = 0; i < arrayofMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayofMatakuliah[i].cetakInfo();
        }

        sc.close();
    }    
}    
