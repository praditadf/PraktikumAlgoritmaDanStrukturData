package Pertemuan12;

public class QueueLinkedList {
    NodeLayananKemahasiswaan front;
    NodeLayananKemahasiswaan rear;
    int size;

    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return (front == null);
    }

    boolean isFull(int max) {
        return (size == max);
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue berhasil dikosongkan");
    }

    void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian sedang kosong.");
        } else {
            System.out.println("Antrian terdepan: ");
            System.out.println("NAMA\t\tNIM\t\tKELAS\t\tPRODI");
            front.data.tampilInformasi();
        }
    }

    void antrianAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian sedang kosong.");
        } else {
            System.out.println("Antrian terakhir: ");
            System.out.println("NAMA\t\tNIM\t\tKELAS\t\tPRODI");
            rear.data.tampilInformasi();
        }
    }

    int jumlahAntrian() {
        return size;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            NodeLayananKemahasiswaan tmp = front;
            System.out.println("NAMA\t\tNIM\t\tKELAS\t\tPRODI");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }

    void enqueue(Mahasiswa input) {
        NodeLayananKemahasiswaan ndInput = new NodeLayananKemahasiswaan(input, null);
        if (isEmpty()) {
            front = ndInput;
            rear = ndInput;
            size++;
        } else {
            rear.next = ndInput;
            rear = ndInput;
            size++;
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } else if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        size--;
    }

}
