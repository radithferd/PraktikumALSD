package Praktikum02;

public class Dosen17 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println();
        System.out.println("Informasi Dosen");
        System.out.println("Nama             : " + nama);
        System.out.println("ID               : " + idDosen);
        System.out.println("Status           : " + (statusAktif? "Aktif" : "Tidak aktif"));
        System.out.println("Tahun bergabung  : " + tahunBergabung);
        System.out.println("Bidang keahlian  : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println();
        System.out.println("Status dosen sekarang: " + (statusAktif? "Aktif" : "Tidak aktif"));
    }

    void hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println();
        System.out.println("Masa kerja dosen: " + masaKerja + " tahun");
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println();
        System.out.println("Bidang keahlian diubah menjadi: " + bidangKeahlian);
    }

    public Dosen17() {
    }

    public Dosen17(String id, String nm, boolean status, int thn, String bidang) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = thn;
        bidangKeahlian = bidang;
    }
}