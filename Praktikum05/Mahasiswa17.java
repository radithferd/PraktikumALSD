package Praktikum05;

public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa17() {
    }

    Mahasiswa17(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}
