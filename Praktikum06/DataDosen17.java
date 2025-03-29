package Praktikum06;

public class DataDosen17 {
    Dosen17[] dataDosen;
    int idx;

    DataDosen17() {
        dataDosen = new Dosen17[5];
        idx = 0;
    }

    void tambah(Dosen17 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen17 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen17 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen17 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    void pencarianDataSequential17(String nama) {
        boolean found = false;
        int dosen = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                found = true;
                dosen++;
            }
        }

        if (!found) {
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (dosen > 1) {
            System.out.println("Peringatan: ditemukan lebih dari satu dosen dengan nama yang sama!");
        }
    }

    void pencarianDataBinary17(int usia) {
        sortingASC();
        int kiri = 0, kanan = idx -1;
        boolean found = false;
        int dosen = 0;

        while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;
            if (dataDosen[tengah].usia == usia) {
                int i = tengah;
                while (i <= kanan && dataDosen[i].usia == usia) {
                    dataDosen[i].tampil();
                    i++;
                    dosen++;
                }
                found = true;
                break;
            } else if (dataDosen[tengah].usia < usia) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }

        if (!found) {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan.");
        } else if (dosen > 1) {
            System.out.println("Peringatan: ditemukan lebih dari satu dosen dengan usia yang sama!");
        }
    }
}