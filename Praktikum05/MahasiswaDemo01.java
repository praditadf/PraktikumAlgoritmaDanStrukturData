package Praktikum05;
import java.util.Scanner;
public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerpestrasi01 list = new MahasiswaBerpestrasi01();
        String name, nm, kls, dummy;
        double ip;
        for (int i = 0; i < 5; i++) {
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

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSort();
        list.tampil();
    }
}