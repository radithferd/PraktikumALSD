public class Mahasiswa17 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa17() {
    }

    public Mahasiswa17(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%s\t%s\t%s\t%.1f\n", nama, nim, kelas, ipk);
    }
}