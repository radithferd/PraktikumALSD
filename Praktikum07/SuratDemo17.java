package Praktikum07;

import java.util.Scanner;

public class SuratDemo17 {
    public static void main(String[] args) {
        StackSurat17 stack = new StackSurat17(10);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin Terakhir");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih Menu: ");
            pilih = scan.nextInt();
            scan.nextLine();
        
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat          : ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama              : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas             : ");
                    String kelas = scan.nextLine();
                    System.out.println("Jenis Izin: S(Sakit)/ I(Izin Lainnya)");
                    System.out.print("Jenis Izin        : ");
                    char jnsIzin = scan.next().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = scan.nextInt();

                    Surat17 srt = new Surat17(idSurat, nama, kelas, jnsIzin, durasi);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil diterima\n", srt.namaMahasiswa);
                    break;

                case 2:
                    Surat17 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memverifikasi surat dari " + diproses.namaMahasiswa);
                        System.out.print("Diverifikasi (yes/ no): ");
                        String verifikasi = scan.nextLine();
                        if (verifikasi.equalsIgnoreCase("yes")) {
                            System.out.println("Surat Izin " + diproses.namaMahasiswa + " Terverifikasi.");
                        } else {
                            System.out.println("Surat Izin " + diproses.namaMahasiswa + " Tidak Terverifikasi.");
                        }
                    }
                    break;

                case 3:
                    Surat17 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Pengajuan Surat Terakhir Dilakukan Oleh " + lihat.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang ingin dicari: ");
                    String dicari = scan.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i <= stack.top; i++) {
                        if (stack.stack[i].namaMahasiswa.equalsIgnoreCase(dicari)) {
                            System.out.println("Surat " + stack.stack[i].namaMahasiswa + " Ditemukan");
                            System.out.println("ID Surat          : " + stack.stack[i].idSurat);
                            System.out.println("Nama              : " + stack.stack[i].namaMahasiswa);
                            System.out.println("Kelas             : " + stack.stack[i].kelas);
                            System.out.println("Jenis Izin        : " + stack.stack[i].jenisIzin);
                            System.out.println("Durasi Izin (hari): " + stack.stack[i].durasi);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Surat dari " + dicari + " tidak ditemukan.");
                    }
                    break;
            }
        } while(pilih >= 1 && pilih <= 4);

        scan.close();
    }
}