package Jobsheet10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int antrianSelesai = 0;
    int antrianPerDPA = 30;

    public AntrianLayanan(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } else if (size >= 2) {
            int i = 0;
            Mahasiswa mhs = null;
            System.out.println("Melayani mahasiswa: ");
            while (i < 2) {
                mhs = data[front];
                front = (front + 1) % max;
                size--;
                antrianSelesai++;
                mhs.tampilkanData();
                i++;
            }
            return mhs;
        } else {
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            antrianSelesai++;
            System.out.println("Melayani mahasiswa: ");
            mhs.tampilkanData();
            return mhs;
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void duaAntrianTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            if (size >= 2) {
                for (int i = 0; i < 2; i++) {
                    int index = (front + i) % max;
                    System.out.print((i + 1) + ". ");
                    data[index].tampilkanData();
                }
            } else {
                data[front].tampilkanData();
            }
        }
    }

    public void antrianAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahAntrianSelesai() {
        return antrianSelesai;
    }

    public int getJumlahAntrianBelumSelesai() {
        return antrianPerDPA - antrianSelesai;
    }

}