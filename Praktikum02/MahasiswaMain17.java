package Praktikum02;

public class MahasiswaMain17 {
    public static void main(String[] args) {
        Mahasiswa17 mhs1 = new Mahasiswa17();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa17 mhs2 = new Mahasiswa17("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
        
        Mahasiswa17 mhsRadith = new Mahasiswa17("Radith Ferdian Hibawan", "244107060091", 3.58, "SIB 1D");
        mhsRadith.tampilkanInformasi();
        mhsRadith.nilaiKinerja();
    }
}