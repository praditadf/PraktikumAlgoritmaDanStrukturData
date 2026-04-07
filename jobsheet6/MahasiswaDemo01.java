package jobsheet6;
import java.util.Scanner;
public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, nm, kls, dummy;
        double ip;
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerpestrasi01 list = new MahasiswaBerpestrasi01(jumMhs);
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.print("Masukkan Nama  : ");
            name = sc.nextLine();
            System.out.print("Masukkan NIM   : ");
            nm = sc.nextLine();
            System.out.print("Masukkan Kelas : ");
            kls = sc.nextLine();
            System.out.print("Masukkan IPK   : ");
            dummy = sc.nextLine();
            ip = Double.parseDouble(dummy);
            System.out.println("-------------------------");
            Mahasiswa01 m = new Mahasiswa01(nm, name, kls, ip);
            list.tambah(m);
        }

        list.tampil();
        /* Pencarian Data menggunakan sequential search
        System.out.println("----------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        */

        System.out.println("----------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("-------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}