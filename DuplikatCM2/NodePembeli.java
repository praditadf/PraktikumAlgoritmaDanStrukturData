package DuplikatCM2;

public class NodePembeli {
    Pembeli dataPembeli;
    NodePembeli prev;
    NodePembeli next;

    NodePembeli (Pembeli dataPembeli) {
        this.dataPembeli = dataPembeli;
        this.prev = null;
        this.next = null;
    }
}
