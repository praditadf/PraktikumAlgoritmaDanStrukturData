package Kuis1;

public class pesanan {
    String menu, pelanggan, kasir;
    int jumlah;

    public pesanan() {

    }

    public pesanan(String menu, String pelanggan, int jumlah, String Kasir) {
        this.menu = menu;
        this.pelanggan = pelanggan;
        this.jumlah = jumlah;
        this.kasir = kasir;
    }

    static void tampilMenu() {
        System.out.println("Daftar Menu");
        System.out.println("Makanan     : Bakso, Mie Goreng, Nasi Goreng");
        System.out.println("Minuman     : Es teh, Air putih, Kopi");
    }

    static void daftarPesanan(String pelanggan, String menu, String kasir, String menuBaru) {
        System.out.println("\nDaftar Pesanan");
        System.out.println("Nama Pelanggan  : " + pelanggan);
        System.out.println("Menu            : " + menu);
        System.out.println("Tambahan Menu   : "+menuBaru);
        System.out.println("Kasir           : " + kasir);
        System.out.println("---------------------------");
    }

    static void tambahMenu(String menuBaru, String menu) {
        System.out.println("Tambahan Menu");
        System.out.println("Menu " + menu + ", " + menuBaru);
    }

}