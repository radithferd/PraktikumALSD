package Praktikum06;

import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen17 dataDosen = new DataDosen17();

        while (true) {
            System.out.println("===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda - Selection Sort)");
            System.out.println("5. Sorting DSC (Usia Tertua ke Termuda - Insertion Sort)");
            System.out.println("6. Tampilkan data dosen berdasarkan nama");
            System.out.println("7. Tampilkan data dosen berdapasarkan umur");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            System.out.println("---------------------------");
            input.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode dosen   : ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan nama dosen   : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan jenis kelamin (true = Laki-laki / false = Perempuan): ");
                    boolean jenisKelamin = input.nextBoolean();
                    System.out.print("Masukkan usia dosen   : ");
                    int usia = input.nextInt();
                    input.nextLine();

                    Dosen17 dosenBaru = new Dosen17(kode, nama, jenisKelamin, usia);
                    dataDosen.tambah(dosenBaru);
                    System.out.println("Data dosen berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("======= DATA DOSEN =======");
                    dataDosen.tampil();
                    break;

                case 3:
                    System.out.println("Mengurutkan data dosen berdasarkan usia (ASC)...");
                    dataDosen.sortingASC();
                    System.out.println("Data berhasil diurutkan!");
                    dataDosen.tampil();
                    break;

                case 4:
                    System.out.println("Mengurutkan data dosen berdasarkan usia (DSC - Selection Sort)...");
                    dataDosen.sortingDSC();
                    System.out.println("Data berhasil diurutkan!");
                    dataDosen.tampil();
                    break;

                case 5:
                    System.out.println("Mengurutkan data dosen berdasarkan usia (DSC - Insertion Sort)...");
                    dataDosen.insertionSort();
                    System.out.println("Data berhasil diurutkan!");
                    dataDosen.tampil();
                    break;

                case 6:
                    System.out.println("Masukkan nama dosen yang ingin dicari");
                    System.out.print("Nama dosen: ");
                    String cariNama = input.nextLine();
                    dataDosen.pencarianDataSequential17(cariNama);
                    break;
                    
                case 7:
                    System.out.println("Masukkan usia dosen yang ingin dicari");
                    System.out.print("Usia: ");
                    int cariUsia = input.nextInt();
                    dataDosen.pencarianDataBinary17(cariUsia);
                    break;
                
                case 8:
                    System.out.println("Terima kasih! Program selesai.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}