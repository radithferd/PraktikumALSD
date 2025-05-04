package Praktikum07;

public class StackSurat17 {
    Surat17[] stack;
    int top;
    int size;

    public StackSurat17(int size) {
        this.size = size;
        stack = new Surat17[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat17 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat17 pop() {
        if (!isEmpty()) {
            Surat17 suratTerproses = stack[top];
            stack[top] = null;
            top--;
            System.out.println("Memproses surat izin dengan ID " + suratTerproses.idSurat);
            return suratTerproses;
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin.");
            return null;
        }
    }

    public Surat17 peek() {
        if (!isEmpty()) {
           return stack[top]; 
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin.");
            return null;
        }
    }
}