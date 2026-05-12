package Jobsheet12;

public class DoubleLinkedList01 {
    Node01 head;
    Node01 tail;

    DoubleLinkedList01() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Mahasiswa01 data) {
        Node01 newNode = new Node01(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String keyNim, Mahasiswa01 data) {
        Node01 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { // node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node01 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node01 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        System.out.println("Data berhasil dihapus.");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        
        System.out.println("Date berhasil dihapus.");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}
