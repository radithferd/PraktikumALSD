package Praktikum06;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = input.nextInt();
        input.nextLine();
        
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17(jumMhs);
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Nim: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();
            System.out.println("---------------------------------");

            list.tambah(new Mahasiswa17(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("----------------------------------------------");
        System.out.println("                Pencarian data                ");
        System.out.println("----------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari : ");
        System.out.print("IPK: ");
        double cari = input.nextDouble();

        System.out.println("---------------------------------");
        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("---------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("---------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        input.close();
    }
}
