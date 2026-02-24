import java.util.Scanner;

public class MatakuliahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Matakuliah : ");
        int jumlahMk = sc.nextInt();
        sc.nextLine();
        Matakuliah01[] arrayOfMataKuliah01 = new Matakuliah01[jumlahMk];
        String kode, nama, dummy;
        int sks, jumlahJam;
        for (int i = 0; i < jumlahMk; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Sks           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------");
            arrayOfMataKuliah01[i] = new Matakuliah01(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < jumlahMk; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah01[i].cetakInfo();
        }
    }
}
