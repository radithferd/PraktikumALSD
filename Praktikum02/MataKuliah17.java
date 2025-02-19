package Praktikum02;

public class MataKuliah17 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    
    public MataKuliah17() {
    }

    public MataKuliah17(String kde, String nm, int sks, int jmljm) {
        kodeMK = kde;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmljm;
    }

    void tampilInformasi() {
        System.out.println();
        System.out.println("Informasi Mata Kuliah");
        System.out.println("Nama mata kuliah          : " + nama);
        System.out.println("Kode mata kuliah          : " + kodeMK);
        System.out.println("SKS mata kuliah           : " + sks);
        System.out.println("Jumlah jam dalam seminggu : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println();
        System.out.println("SKS mata kuliah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println();
        System.out.println("Jumlah jam matkul ditambah menjadi: " + jumlahJam);
    }

    void kurangJam(int jam) {
        if (jumlahJam <= jam) {
            System.out.println();
            System.out.println("Jam matkul tidak dapat dikurangi.");
        } else {
            jumlahJam -= jam;
            System.out.println();
            System.out.println("Jumlah jam matkul dikurangi menjadi: " + jumlahJam);
        }
    }
}
