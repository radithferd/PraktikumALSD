package Praktikum03;

public class DataDosen17 {
    public void dataSemuaDosen(Dosen17[] arrayOfDosen){
        System.out.println("Data Semua Dosen");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Kode            : " + arrayOfDosen[i].kode);
            System.out.println("Nama            : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin   : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + arrayOfDosen[i].usia);
            System.out.println("------------------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen17[] arrayOfDosen){
        int dosenPria = 0, dosenWanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                dosenPria++;
            } else {
                dosenWanita++;
            }
        }
        System.out.println("Jumlah dosen berjenis kelamin pria   : " + dosenPria);
        System.out.println("Jumlah dosen berjenis kelamin wanita : " + dosenWanita);
        System.out.println("------------------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen17[] arrayOfDosen){
        int jumlahPria = 0, jumlahWanita = 0, dosenPria = 0, dosenWanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                jumlahPria += arrayOfDosen[i].usia;
                dosenPria++;
            } else {
                jumlahWanita += arrayOfDosen[i].usia;
                dosenWanita++;
            }
        }

        int rerataPria = (jumlahPria/dosenPria);
        int rerataWanita = (jumlahWanita/dosenWanita);

        System.out.println("Rata-rata usia dosen pria   : " + rerataPria);
        System.out.println("Rata-rata usia dosen wanita : " + rerataWanita);
        System.out.println("------------------------------------------");
    }

    public void infoDosenPalingTua(Dosen17[] arrayOfDosen){
        int dosenTertua = 0, indeksDosen = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dosenTertua) {
                dosenTertua = arrayOfDosen[i].usia;
                indeksDosen = i;
            }
        }
        System.out.println("Data dosen tertua: ");
        System.out.println("Kode          : " + arrayOfDosen[indeksDosen].kode);
        System.out.println("Nama          : " + arrayOfDosen[indeksDosen].nama);
        System.out.println("Jenis kelamin : " + (arrayOfDosen[indeksDosen].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + arrayOfDosen[indeksDosen].usia);
        System.out.println("------------------------------------------");
    }

    public void infoDosenPalingMuda(Dosen17[] arrayOfDosen){
        int dosenTermuda = 100, indeksDosen = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < dosenTermuda) {
                dosenTermuda = arrayOfDosen[i].usia;
                indeksDosen = i;
            }
        }
        System.out.println("Data dosen termuda: ");
        System.out.println("Kode          : " + arrayOfDosen[indeksDosen].kode);
        System.out.println("Nama          : " + arrayOfDosen[indeksDosen].nama);
        System.out.println("Jenis kelamin : " + (arrayOfDosen[indeksDosen].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + arrayOfDosen[indeksDosen].usia);
        System.out.println("------------------------------------------");
    }
}