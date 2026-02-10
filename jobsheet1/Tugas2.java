import java.util.Scanner;
public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    static void inputJadwal (String [][] jadwal){
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Masukkan jadwal kuliah ke - "+(i+1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Nama Ruang : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah : ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
    }

    static void tampilJadwal (String [][] jadwal){
        System.out.printf("%-45s %-18s %-18s %-18s \n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-45s %-18s %-18s %-18s \n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }System.out.println();
    }

    static void tampilHari (String [][] jadwal){
        System.out.print("Masukkan hari kuliah : ");
        String hari = sc.nextLine();
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-45s %-18s %-18s %-18s \n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }System.out.println();
    }

    static void tampilNamaMk (String [][] jadwal){
        System.out.print("Masukkan nama mata kuliah : ");
        String nama = sc.nextLine();
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(nama)) {
                System.out.printf("%-45s %-18s %-18s %-18s \n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String [][] jadwal = new String [n][4];
        inputJadwal(jadwal);
        boolean menu = true;
        while (menu) {
            System.out.println("Menu Jadwal Kuliah");
            System.out.println("1. Tampilkan semua jadwal");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan nama mata kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            int pilihMenu = sc.nextInt();
            sc.nextLine();
            switch (pilihMenu) {
                case 1:
                    tampilJadwal(jadwal);
                    break;
                case 2:
                    tampilHari(jadwal);
                    break;
                case 3:
                    tampilNamaMk(jadwal);
                    break;
                case 4:
                    menu=false;
                    break;
                default:
                    System.out.println("Menu yang anda pilih tidak sesuai");
                    break;
            }
        }
    }
}
