package Praktikum02;

public class MataKuliahMain17 {
    public static void main(String[] args) {
        MataKuliah17 mk1 = new MataKuliah17();
        mk1.kodeMK = "alsd01";
        mk1.nama = "ALSD";
        mk1.sks = 2;
        mk1.jumlahJam = 4;
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tampilInformasi();

        MataKuliah17 mk2 = new MataKuliah17("bs01", "Basis Data", 2, 4);
        mk2.tampilInformasi();
        mk2.tambahJam(1);
        mk2.tampilInformasi();

        MataKuliah17 mk3 = new MataKuliah17("kwn01", "Kewarganegaraan", 2, 2);
        mk3.tampilInformasi();
        mk3.kurangJam(3);
        mk3.tampilInformasi();
    }
}
