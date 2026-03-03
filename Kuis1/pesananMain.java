package Kuis1;
import java.util.Scanner;
public class pesananMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan hari ini : ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();
        String menu, pelanggan, kasir, menuBaru, dummy;
        int jumlah;
        pesanan[] arrayOfPesanan = new pesanan[jumlahPesanan];
        pesanan.tampilMenu();

        for (int i = 0; i < jumlahPesanan; i++) {
            arrayOfPesanan[i] = new pesanan();
            System.out.print("Masukkan nama pelanggan : ");
            pelanggan = sc.nextLine();
            System.out.print("Masukkan jumlah menu yang di pesan : ");
            dummy = sc.nextLine();
            jumlah = Integer.parseInt(dummy);
            System.out.print("Masukkan menu yang dipilih : ");
            menu = sc.nextLine();
            System.out.print("Masukkan nama kasir : ");
            kasir = sc.nextLine();
            System.out.print("Apakah ada menu yang ingin ditambah (Y / T): ");
            arrayOfPesanan[i] = new pesanan(menu, pelanggan, jumlah, kasir);
            String tambah = sc.nextLine();
            if (tambah.equals("Y")) {
                System.out.print("Masukkan nama menu yang ditambah : ");
                menuBaru = sc.nextLine();
                pesanan.tambahMenu(menuBaru, menu);
                pesanan.daftarPesanan(pelanggan, menu, kasir, menuBaru);
            }
        }
    }
}
