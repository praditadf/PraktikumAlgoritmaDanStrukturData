package JobsheetCM2;

public class DLLPembeli {
    NodePembeli head;
    NodePembeli tail;

    DLLPembeli() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void tambahAntrian(int a, String b, String c) {
        Pembeli dataPembeli = new Pembeli(a, b, c);
        NodePembeli dataPembeliBaru = new NodePembeli(dataPembeli);
        if (isEmpty()) {
            head = tail = dataPembeliBaru;
        } else {
            tail.next = dataPembeliBaru;
            dataPembeliBaru.prev = tail;
            tail = dataPembeliBaru;
        }
    }

    void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
            return;
        }

        NodePembeli current = head;
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-15s %-15s %-12s %n", "No Antrian", "Nama", "No HP");
        while (current != null) {
            current.dataPembeli.tampil();
            current = current.next;
        }
    }

    void panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
            return;
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

}
