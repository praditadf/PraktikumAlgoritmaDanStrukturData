package DuplikatCM2;

public class DllPesanan {
    NodePesanan head;
    NodePesanan tail;

    DllPesanan() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void simpanPesanan(int kode, String namaPesanan, int harga) {
        Pesanan pesananBaru = new Pesanan(kode, namaPesanan, harga);
        NodePesanan dataPesananBaru = new NodePesanan(pesananBaru);
        if (isEmpty()) {
            head = tail = dataPesananBaru;
        } else {
            tail.next = dataPesananBaru;
            dataPesananBaru.prev = tail;
            tail = dataPesananBaru;
        }
    }

    void sortingNamaPesanan() {
        if (isEmpty() || head.next == null) {
            System.out.println("Data pesanan masih kosong.");
            return;
        }
        NodePesanan current = head;
        while (current != null) {
            NodePesanan next = current.next;
            while (next != null) {
                if (current.dataPesanan.namaPesanan.compareTo(next.dataPesanan.namaPesanan) > 0) {
                    Pesanan sorted = current.dataPesanan;
                    current.dataPesanan = next.dataPesanan;
                    next.dataPesanan = sorted;
                }
                next = next.next;
            }
            current = current.next;
        }
    }

    void cetakPesanan() {
        if (isEmpty()) {
            System.out.println("Data pesanan masih kosong.");
            return;
        }
        sortingNamaPesanan();
        NodePesanan current = head;
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-15s %-15s %-12s %n", "Kode Pesanan", "Nama Pesanan", "Harga");
        while (current != null) {
            current.dataPesanan.tampil();
            current = current.next;
        }
        System.out.println("======================================");
        System.out.println("Total Pendapatan Restoran = Rp." + hitungTotalPendapatan());
    }

    int hitungTotalPendapatan() {
        int total = 0;
        NodePesanan current = head;
        while (current != null) {
            total += current.dataPesanan.harga;
            current = current.next;
        }
        return total;
    }
}