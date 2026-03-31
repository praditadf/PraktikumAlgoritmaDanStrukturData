package Praktikum05;

import java.util.Scanner;

public class DosenMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen01 data = new DataDosen01();
        String name, kd, dummy;
        boolean jk;
        int menu, age;
        do {
            System.out.println("Pilihan Menu :");
            System.out.println("1. Tambah data");
            System.out.println("2. Tampilkan data");
            System.out.println("3. Mengurutkan data berdasarkan usia mulai dari termuda");
            System.out.println("4. Mengurutkan data berdasarkan usia mulai dari tertua");
            System.out.println("5. Keluar");
            System.out.print("Masukkan menu (1-5) : ");
            menu = sc.nextInt();
            System.out.println("----------------------------------");
            sc.nextLine();
            switch (menu) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Masukkan Data Dosen ke-" + (i + 1));
                        System.out.print("Nama  : ");
                        name = sc.nextLine();
                        System.out.print("Kode  : ");
                        kd = sc.nextLine();
                        System.out.print("JK (true / false): ");
                        dummy = sc.nextLine();
                        jk = Boolean.parseBoolean(dummy);
                        System.out.print("Usia  : ");
                        dummy = sc.nextLine();
                        age = Integer.parseInt(dummy);
                        System.out.println("-------------------------");
                        Dosen01 d = new Dosen01(kd, name, jk, age);
                        data.tambah(d);
                    }
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    System.out.println("Data dosen diurutkan dati termuda hingga tertua");
                    data.bubbleSort();
                    break;
                case 4:
                    System.out.println("Data dosen diurutkan dari tertua hingga termuda");
                    data.insertionSort();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid");
                    break;
            }
        } while (menu != 5);
    }
}
