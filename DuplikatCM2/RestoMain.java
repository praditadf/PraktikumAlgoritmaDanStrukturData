package DuplikatCM2;

import java.util.Scanner;

public class RestoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DLLPembeli antreanPembeli = new DLLPembeli();
        DllPesanan dataPesanan = new DllPesanan();
        /*
        antreanPembeli.tambahAntrian(1, "Ainra", "08224500000");
        antreanPembeli.tambahAntrian(2, "Danra", "08224511111");
        antreanPembeli.tambahAntrian(3, "Sanri", "08224522222");
        antreanPembeli.tambahAntrian(4, "Vania", "08422234556");
        */
        int a = 1;
        int pilihMenu;
        do {
            System.out.println("==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihMenu = sc.nextInt();
            sc.nextLine();
            switch (pilihMenu) {
                case 1:
                    // Tambah antrian normal & prioritas, prioritas = tidak di akhir, antrian no 2
                    System.out.print("Apakah anda pembeli prioritas (Y/T) : ");
                    String prio = sc.nextLine();
                    if (prio != null && prio.equalsIgnoreCase("Y")) {
                        System.out.print("Nama Pembeli : ");
                        String b = sc.nextLine();
                        System.out.print("No HP        : ");
                        String c = sc.nextLine();
                        Pembeli prioritas = new Pembeli(2, b, c);
                        antreanPembeli.tambahAntrinPrioritas(prioritas, 2);
                        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + 2);
                        a++;
                        break;
                    } else {
                        System.out.print("Nama Pembeli : ");
                        String b = sc.nextLine();
                        System.out.print("No HP        : ");
                        String c = sc.nextLine();
                        antreanPembeli.tambahAntrian(a, b, c);
                        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + a);
                        a++;
                        break;
                    }
                case 2:
                    antreanPembeli.cetakAntrian();
                    break;
                case 3:
                    if (antreanPembeli.isEmpty()) {
                        System.out.println("Antrian masih kosong.");
                        break;
                    }
                    String namaPembeli = antreanPembeli.head.dataPembeli.namaPembeli;
                    antreanPembeli.panggilAntrian();
                    System.out.print("Kode Pesanan : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String namaPesanan = sc.nextLine();
                    System.out.print("Harga        : ");
                    int harga = sc.nextInt();
                    sc.nextLine();
                    dataPesanan.simpanPesanan(kode, namaPesanan, harga);
                    System.out.println(namaPembeli + " telah memesan " + namaPesanan);
                    break;
                case 4:
                    dataPesanan.cetakPesanan();
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Menu yang dipilih tidak valid.");
                    break;
            }
        } while (pilihMenu != 0);
    }
} 
