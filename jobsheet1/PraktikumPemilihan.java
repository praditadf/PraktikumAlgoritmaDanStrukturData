import java.util.Scanner;
public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();
        double nilaiAKhir;
        String nilaiHuruf, status;
        boolean nilaiValid = false;
        if (tugas >= 0 && tugas <= 100) {
            if (kuis >= 0 && tugas <= 100) {
                if (uts >= 0 && tugas <= 100) {
                    if (uas >= 0 && tugas <= 100) {
                        nilaiValid = true;
                    }
                }
            }
        }
        System.out.println("======================");
        System.out.println("======================");
        if (nilaiValid) {
            nilaiAKhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.3 * uas;
            if (nilaiAKhir>80){
                nilaiHuruf="A";
                status="LULUS";
            }else if(nilaiAKhir>73){
                nilaiHuruf="B+";
                status="LULUS";
            }else if(nilaiAKhir>65){
                nilaiHuruf="B";
                status="LULUS";
            }else if(nilaiAKhir>60){
                nilaiHuruf="C+";
                status="LULUS";
            }else if(nilaiAKhir>50){
                nilaiHuruf="C";
                status="LULUS";
            }else if(nilaiAKhir>39){
                nilaiHuruf="D";
                status="TIDAK LULUS";
            }
            else{
                nilaiHuruf="E";
                status="TIDAK LULUS";
            }
            System.out.printf("Nilai Akhir : %.2f" ,nilaiAKhir);
            System.out.println("\nNilai Huruf : "+nilaiHuruf);
            System.out.println("======================");
            System.out.println("======================");
            if (status.equalsIgnoreCase("LULUS")) {
                System.out.println("SELAMAT ANDA "+status);
            }else {
                System.out.println("ANDA "+status);
            }
        }else {
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        }
    }
}