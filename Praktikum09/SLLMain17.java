import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList17 sll = new SingleLinkedList17();

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
            sll.addLast(mhs);
            sll.print();
        }
        sc.close();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
