package Pertemuan12;

import java.util.Scanner;

public class SLLMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, nm, kls;
        double ip;
        System.out.print("Masukkan jumlah mahasiswa: ");
        SingleLinkedList01 sll = new SingleLinkedList01();
        int jmlMhs = sc.nextInt();
        sc.nextLine();
        Mahasiswa01 mhs[] = new Mahasiswa01[jmlMhs];
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama : ");
            name = sc.nextLine();
            System.out.print("NIM  : ");
            nm = sc.nextLine();
            System.out.print("Kelas: ");
            kls = sc.nextLine();
            System.out.print("IPK  : ");
            ip = sc.nextDouble();
            System.out.println();
            mhs[i] = new Mahasiswa01(nm, name, kls, ip);
            sc.nextLine();
        }
        /*
         * Mahasiswa01 mhs1 = new Mahasiswa01("24212200", "Alvaro", "1A", 4.0);
         * Mahasiswa01 mhs2 = new Mahasiswa01("23212201", "Bimon", "2B", 3.8);
         * Mahasiswa01 mhs3 = new Mahasiswa01("22212102", "Cintia", "3C", 3.5);
         * Mahasiswa01 mhs4 = new Mahasiswa01("21212203", "Dirga", "4D", 3.6);
         */
        sll.print();
        sll.addFirst(mhs[3]);
        sll.print();
        sll.addLast(mhs[0]);
        sll.print();
        sll.insertAfter("Dirga", mhs[2]);
        sll.insertAt(2, mhs[1]);
        sll.print();

        System.out.println("data index 1 :");
        sll.getData(1);

        System.out.println("data mahasiswa dengan nama Bimon berada pada index: " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}