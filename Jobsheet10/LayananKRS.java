package Jobsheet10;
import java.util.Scanner;

public class LayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(10);
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Layanan Proses KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses 2 Mahasiswa (Maximal 30 mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Cek Antrian Paling Belakang");
            System.out.println("6. Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.layaniMahasiswa();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.duaAntrianTerdepan();
                    break;
                case 5:
                    antrian.antrianAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian              : " + antrian.getJumlahAntrian() + " mahasiswa");
                    System.out.println("Jumlah antrian selesai      : " + antrian.getJumlahAntrianSelesai() + " mahasiswa");
                    System.out.println("Jumlah antrian belum selesai: " + antrian.getJumlahAntrianBelumSelesai() + " mahasiswa");

                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            if (antrian.getJumlahAntrianBelumSelesai() == 0) {
                System.out.println("Semua mahasiswa telah dilayani.");
                pilihan = 0;
            }
        } while (pilihan != 0);

        sc.close();
    }
}