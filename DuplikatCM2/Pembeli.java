package DuplikatCM2;

public class Pembeli {
    int noAntrean;
    String namaPembeli;
    String NoHp;

    Pembeli(int a, String b, String c) {
        noAntrean = a;
        namaPembeli = b;
        NoHp = c;
    }

    void tampil() {
        System.out.printf("%-15d %-15s %-12s %n", noAntrean, namaPembeli, NoHp);
    }
}
