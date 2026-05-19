package DuplikatCM2;

public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;

    Pesanan(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    void tampil() {
        System.out.printf("%-15d %-15s %-12d %n", kodePesanan, namaPesanan, harga);
    }
}
