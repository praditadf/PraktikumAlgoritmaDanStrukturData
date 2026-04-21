package Jobsheet9;

public class StackSurat01 {
    Surat01[] stack;
    int top;
    int size;

    StackSurat01(int size) {
        this.size = size;
        stack = new Surat01[size];
        top = -1;
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Surat01 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    Surat01 pop() {
        if (!isEmpty()) {
            Surat01 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    Surat01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
            return null;
        }
    }

    void print(String namaCari) {
        int suratDitemukan = 0;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaCari)) {
                System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t"
                        + stack[i].jenisIzin + "\t" + stack[i].durasi);
                suratDitemukan++;
            }
        }
        if (suratDitemukan == 0) {
            System.out.println("Surat Izin tidak ditemukan");
        }
        System.out.println("");
    }
}
