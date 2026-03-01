package Praktikum03;
import java.util.Scanner;
public class DosenDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen : ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();
        Dosen01[] arrayOfDosen = new Dosen01[jumlahDosen];
        String kode, nama, jenisKelamin, dummy;
        int usia;

        for (int i = 0; i < jumlahDosen; i++) {
            arrayOfDosen[i] = new Dosen01();
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.nextLine();
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------");
            arrayOfDosen[i] = new Dosen01(kode, nama, jenisKelamin, usia);
        }

        int i = 1;
        for (Dosen01 data : arrayOfDosen) {
            data.tampilData(i);
            i++;
        }

        DataDosen01 dataDosen01 = new DataDosen01();
        dataDosen01.dataSemuaDosen(arrayOfDosen);
        dataDosen01.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen01.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen01.infoDosenPalingTua(arrayOfDosen);
        dataDosen01.infoDosenPalingMuda(arrayOfDosen);
    }
}
