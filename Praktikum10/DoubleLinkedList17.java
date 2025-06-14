package Praktikum10;

public class DoubleLinkedList17 {
    Node17 head;
    Node17 tail;

    public DoubleLinkedList17() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa17 data) {
        Node17 newNode = new Node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa17 data) {
        Node17 newNode = new Node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa17 data) {
        Node17 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node17 newNode = new Node17(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }
        Node17 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        }
        Mahasiswa17 removeData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus. Data yang terhapus adalah: "); 
        removeData.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        }
        Mahasiswa17 removedData = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus. Data yang terhapus adalah: ");
        removedData.tampil();
    }

    public Node17 search(String nim) {
        Node17 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void add(int index, Mahasiswa17 data) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        
        Node17 current = head;
        int i = 0;

        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Index melebbihi panjang list");
            return;
        }

        Node17 newNode = new Node17(data);
        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
        System.out.println("Node berhasil ditambahkan pada index " + index);
        
    }

    public void removeAfter(String keyNim) {
        Node17 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node17 toRemove = current.next;
        current.next = toRemove.next;

        if (toRemove.next != null) {
            toRemove.next.prev = current;
        } else {
            tail = current; 
        }

        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus.");
    }

    public void remove(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Index tidak valid atau list kosong.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }

        Node17 current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Index melebbihi panjang list");
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev; 
        }

        System.out.println("Node pada index " + index + " berhasil dihapus.");
    }

    public Mahasiswa17 getFirst() {
        return (head != null) ? head.data : null;
    }

    public Mahasiswa17 getLast() {
        return (tail != null) ? tail.data : null;
    }

    public Mahasiswa17 getIndex(int index) {
        if (index < 0) return null;
        Node17 current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Index melebbihi panjang list");
            return null;
        }

        return current.data;
    }

    public int size() {
        int count = 0;
        Node17 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

}
