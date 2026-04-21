package Jobsheet9;

import java.util.Scanner;

public class SuratDemo01 {
    public static void main(String[] args) {
        StackSurat01 stack = new StackSurat01(10);
        Scanner scan = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Melihat Surat Izin Terakhir");
            System.out.println("4. Mencari Surat Izin");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Id Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin: ");
                    char jenisIzin = scan.next().charAt(0);
                    System.out.print("Durasi Izin: ");
                    int durasi = scan.nextInt();

                    Surat01 mhs = new Surat01(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(mhs);
                    System.out.printf("Surat %s telah diterima\n", namaMahasiswa);
                    break;
                case 2:
                    Surat01 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari " + diproses.namaMahasiswa);
                        System.out.print("Verifikasi Surat:(y/t) ");
                        String verif = scan.nextLine();
                        diproses.diproses(verif);
                        System.out.printf("Statur Surat %s : %s\n", diproses.namaMahasiswa, diproses.proses );
                    }
                    break;
                case 3:
                    Surat01 lihatSurat = stack.peek();
                    if (lihatSurat != null) {
                        System.out.println("Surat terakhir adalah surat milik " + lihatSurat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Cari Surat Berdasarkan Nama Mahasiswa");
                    scan.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaCari = scan.nextLine();
                    System.out.println("Id\tNama\tKelas\tJenis\tDurasi");
                    stack.print(namaCari);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
