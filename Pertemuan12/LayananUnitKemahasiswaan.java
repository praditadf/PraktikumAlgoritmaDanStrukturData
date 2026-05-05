package Pertemuan12;

import java.util.Scanner;

public class LayananUnitKemahasiswaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, nm, kls, prodi;
        QueueLinkedList antrian = new QueueLinkedList();
        Mahasiswa mhs = new Mahasiswa();
        int menu;
        System.out.print("Masukkan Jumlah Antrian Maksimal : ");
        int max = sc.nextInt();
        antrian.isFull(max);
        do {
            System.out.println("\n=== Menu Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Data Mahasiswa Ke Antrian");
            System.out.println("2. Memanggil Antrian Mahasiswa");
            System.out.println("3. Lihat Antrian Mahasiswa");
            System.out.println("4. Cek Antrian Kosong / Penuh");
            System.out.println("5. Mengosongkan Semua Antrian");
            System.out.println("6. Menampilkan Antrian Terdepan");
            System.out.println("7. Menampilkan Antrian Paling Akhir");
            System.out.println("8. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    if (antrian.isFull(max)) {
                        System.out.println("Antrian sudah penuh silahkan menunggu antrian tersedia.");
                        break;
                    }else {
                        System.out.println("Masukkan Data Mahasiswa");
                        System.out.print("Nama : ");
                        name = sc.nextLine();
                        System.out.print("NIM  : ");
                        nm = sc.nextLine();
                        System.out.print("Kelas: ");
                        kls = sc.nextLine();
                        System.out.print("Prodi: ");
                        prodi = sc.nextLine();
                        System.out.println();
                        mhs = new Mahasiswa(name, nm, kls, prodi);
                        antrian.enqueue(mhs);
                        break;
                    }
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian sedang kosong");
                    }else if (antrian.isFull(max)) {
                        System.out.println("Antrian sudah penuh");
                        System.out.println("Jumlah Antrian : "+antrian.jumlahAntrian());
                    }else {
                        System.out.println("Antrian masih tersedia.");
                    }
                    break;
                case 5:
                    antrian.clear();
                    break;
                case 6:
                    antrian.lihatTerdepan();
                    break;
                case 7:
                    antrian.antrianAkhir();
                    break;
                case 8:
                    System.out.println("Jumlah antrian tersisa saat ini : "+antrian.jumlahAntrian()+" Antrian");
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Menu yang anda pilih tidak sesuai");
                    break;
            }
        } while (menu != 0);
    }
}