import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList17 data = new SingleLinkedList17();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt(); 
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);
            data.addLast(mhs);
            data.print();
        }
        sc.close();
    }
}
