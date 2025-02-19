package Praktikum02;

public class DosenMain17 {
    public static void main(String[] args) {
        Dosen17 dsn1 = new Dosen17();
        dsn1.idDosen = "VAL";
        dsn1.nama = "Vivin Ayu Lestari";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2016;
        dsn1.bidangKeahlian = "Algoritma dan Struktur Data";
        dsn1.tampilInformasi();
        dsn1.hitungMasaKerja(2024);


        Dosen17 dsn2 = new Dosen17("FRD", "Farid Angga Pribadi", false, 2020, "Matematika Lanjut");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Basis Data");
        dsn2.tampilInformasi();
    }
}
