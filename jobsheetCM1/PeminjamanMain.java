package jobsheetCM1;

import java.util.Scanner;

public class PeminjamanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] mhs = new Mahasiswa[3];
        mhs[0] = new Mahasiswa("22001", "Andi", "Teknik Informatika");
        mhs[1] = new Mahasiswa("22002", "Budi", "Teknik Informatika");
        mhs[2] = new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis");

        Buku[] buku = new Buku[4];
        buku[0] = new Buku("B001", "Algoritma", 2020);
        buku[1] = new Buku("B002", "Basis Data", 2019);
        buku[2] = new Buku("B003", "Pemograman", 2021);
        buku[3] = new Buku("B004", "Fisika", 2024);

        Peminjaman[] dataPeminjaman = new Peminjaman[5];
        dataPeminjaman[0] = new Peminjaman(mhs[0], buku[0], 7);
        dataPeminjaman[1] = new Peminjaman(mhs[1], buku[1], 3);
        dataPeminjaman[2] = new Peminjaman(mhs[2], buku[2], 10);
        dataPeminjaman[3] = new Peminjaman(mhs[2], buku[3], 6);
        dataPeminjaman[4] = new Peminjaman(mhs[0], buku[1], 4);
        for (Peminjaman p : dataPeminjaman) {
            p.hitungDenda();
        }
        SortingSearch ss = new SortingSearch();

        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            System.out.println();
            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (Buku b : buku) {
                        b.tampiilBuku();
                    }
                    break;
                case 3:
                    System.out.println("Daftar Peminjaman");
                    for (Peminjaman p : dataPeminjaman) {
                        p.tampilPeminjaman(dataPeminjaman);
                    }
                    break;
                case 4:
                    System.out.println("Setelah diurutkan (Denda Terbesar)");
                    ss.insertionSort(dataPeminjaman);
                    for (Peminjaman p : dataPeminjaman) {
                        p.tampilPeminjaman(dataPeminjaman);
                    }
                    break;
                case 5:
                    ss.insertionSort(dataPeminjaman);
                    System.out.print("Masukkan NIM: ");
                    int nimCari = sc.nextInt();
                    sc.nextLine();
                    ss.sequentialSearch(nimCari, dataPeminjaman);
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

        } while (pilihan != 0);
    }
}
