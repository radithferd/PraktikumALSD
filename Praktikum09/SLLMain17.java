public class SLLMain17 {
    public static void main(String[] args) {
        Mahasiswa17 mhs1 = new Mahasiswa17("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa17 mhs2 = new Mahasiswa17("23212201", "Bimon", "2B", 3.8);
        Mahasiswa17 mhs3 = new Mahasiswa17("22212202", "Cintia", "3C", 3.5);
        Mahasiswa17 mhs4 = new Mahasiswa17("21212203", "Dirga", "4D", 3.6);

        SingleLinkedList17 sll = new SingleLinkedList17();
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
