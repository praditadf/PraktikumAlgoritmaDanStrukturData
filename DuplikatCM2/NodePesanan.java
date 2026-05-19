package DuplikatCM2;

public class NodePesanan {
    Pesanan dataPesanan;
    NodePesanan prev;
    NodePesanan next;

    NodePesanan (Pesanan dataPesanan) {
        this.dataPesanan = dataPesanan;
        this.prev = null;
        this.next = null;
    }
}
