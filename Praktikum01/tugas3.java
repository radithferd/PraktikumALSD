package Praktikum01;

import java.util.Scanner;

public class tugas3 {
    public static void seluruhJadwal(int n, String[] mataKuliah, int[] sks, int[] semester, String[] hari) {
        System.out.println("================== Seluruh Jadwal Kuliah =================");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Mata kuliah: " + mataKuliah[i]);
            System.out.println("Banyak SKS:  " + sks[i]);
            System.out.println("Semester:    " + semester[i]);
            System.out.println("Hari:        " + hari[i]);
            System.out.println("----------------------------------------------------------");
        }
    }

    public static void jadwalHari(int n, String[] mataKuliah, int[] sks, int[] semester, String[] hari, Scanner sc) {
        sc.nextLine();
        System.out.print("Masukkan hari yang ingin dilihat: ");
        String pilihanHari = sc.nextLine();
        System.out.println("============ Jadwal Kuliah Pada Hari " + pilihanHari + " =============");

        boolean ditemukan = false;
        for (int i = 0; i < hari.length; i++) {
            if (hari[i].equalsIgnoreCase(pilihanHari)) {
                System.out.println("Mata kuliah: " + mataKuliah[i]);
                System.out.println("Banyak SKS:  " + sks[i]);
                System.out.println("Semester:    " + semester[i]);
                System.out.println("----------------------------------------------------------");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ditemukan");
        }
    }
    
    public static void jadwalSemester(int n, String[] mataKuliah, int[] sks, int[] semester, String[] hari, Scanner sc) {
        System.out.print("Masukkan semester yang ingin dilihat: ");
        int pilihanSemester = sc.nextInt();
        System.out.println("============= Jadwal Kuliah Pada Semester " + pilihanSemester + " ==============");
    
        boolean ditemukan = false;
        for (int i = 0; i < semester.length; i++) {
            if (semester[i] == pilihanSemester) {
                System.out.println("Mata kuliah: " + mataKuliah[i]);
                System.out.println("Banyak SKS:  " + sks[i]);
                System.out.println("Hari:        " + hari[i]);
                System.out.println("----------------------------------------------------------");
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak Ditemukan");
        }
    }    

    public static void infoMatkul(int n, String[] mataKuliah, int[] sks, int[] semester, String[] hari, Scanner sc) {
        sc.nextLine();
        System.out.print("Masukkan mata kuliah yang ingin dicari: ");
        String pilihanMatkul = sc.nextLine();
        System.out.println("============== Informasi Mata Kuliah " + pilihanMatkul + " =============");

        boolean ditemukan = false;
        for (int i = 0; i < mataKuliah.length; i++) {
            if (mataKuliah[i].equalsIgnoreCase(pilihanMatkul)) {
                System.out.println("Mata kuliah: " + mataKuliah[i]);
                System.out.println("Banyak SKS:  " + sks[i]);
                System.out.println("Semester:    " + semester[i]);
                System.out.println("Hari:        " + hari[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================================");
        System.out.print("Masukkan banyak mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] mataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hari = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Masukkan data mata kuliah ke-" + (i+1) + ": ");

            System.out.print("Nama mata kuliah: ");
            mataKuliah[i] = sc.nextLine();
            
            System.out.print("Banyak SKS: ");
            sks[i] = sc.nextInt();

            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Hari kuliah: ");
            hari[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("========================== MENU ==========================");
            System.out.println("1. Menampilkan seluruh jadwal kuliah.");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari tertentu.");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester.");
            System.out.println("4. Menampilkan informasi mata kuliah.");
            System.out.println("5. Keluar program");
            System.out.println("==========================================================");
            System.out.print("Masukkan nomor menu yang diinginkan: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    seluruhJadwal(n, mataKuliah, sks, semester, hari);
                    break;
                case 2:
                    jadwalHari(n, mataKuliah, sks, semester, hari, sc);
                    break;
                case 3:
                    jadwalSemester(n, mataKuliah, sks, semester, hari, sc);
                    break;
                case 4:
                    infoMatkul(n, mataKuliah, sks, semester, hari, sc);
                    break;
                case 5:
                    System.out.println("==========================================================");
                    System.out.println("            Program selesai! Terima Kasih");
                    System.out.println("==========================================================");
                    return;
                default:
                    System.out.println("==========================================================");
                    System.out.println("       Pilihan tidak valid. Silakan coba lagi.");
                    System.out.println("==========================================================");
            }
        }
    }
}