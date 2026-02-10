import java.util.Scanner;
public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int jumlahMk = sc.nextInt();
        sc.nextLine();
        String [] namaMk = new String[jumlahMk];
        int [] nilaiAngka = new int[jumlahMk];
        String [] nilaiHuruf = new String[7];
        int []bobotSks = new int[jumlahMk];
        float []bobotNilai = new float[7];
        float [] jumlahNilai = new float[jumlahMk]; 
        int jumlahSKS = 0;
        float ip, totalNilai = 0;

        System.out.println("=======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================");
        for (int k = 0; k < jumlahMk; k++) {
            System.out.print("Nama Mata Kuliah ke-"+(k+1)+ " : ");
            namaMk [k] = sc.nextLine();
        }
        System.out.println("=======================");
        for (int j = 0; j < jumlahMk; j++) {
            System.out.print("Masukkan nilai Angka untuk MK "+namaMk[j]+" : ");
            nilaiAngka[j] = sc.nextInt();
        }
        System.out.println("=======================");
        for (int l = 0; l < jumlahMk; l++) {
            System.out.print("Masukkan bobot SKS untuk MK "+namaMk[l]+ " : ");
            bobotSks [l] = sc.nextInt();
            jumlahSKS += bobotSks[l];
        }
        
        sc.nextLine();
        for (int i = 0; i < jumlahMk; i++) {
            if (nilaiAngka[i]>80){
                    nilaiHuruf[i]="A";
                    bobotNilai[i]=4.00f;
                }else if(nilaiAngka[i]>73){
                    nilaiHuruf[i]="B+";
                    bobotNilai[i]=3.50f;
                }else if(nilaiAngka[i]>65){
                    nilaiHuruf[i]="B";
                    bobotNilai[i]=3.00f;
                }else if(nilaiAngka[i]>60){
                    nilaiHuruf[i]="C+";
                    bobotNilai[i]=2.50f;
                }else if(nilaiAngka[i]>50){
                    nilaiHuruf[i]="C";
                    bobotNilai[i]=2.00f;
                }else if(nilaiAngka[i]>39){
                    nilaiHuruf[i]="D";
                    bobotNilai[i]=1.00f;
                }else if(nilaiAngka[i] <= 39){
                    nilaiHuruf[i]="E";
                    bobotNilai[i]=0.00f;
            }
        }
        System.out.println("=======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=======================");
        System.out.printf("%-30s  %-12s  %-12s  %-12s \n", "MK", "Nilai Angka", "Nilai Huruf", "BobotNilai");
        for (int m = 0; m < jumlahMk; m++) {
            System.out.printf("%-30s  %-12s  %-12s  %-12s \n",namaMk[m], nilaiAngka[m], nilaiHuruf[m], bobotNilai[m]);       
        }
        for (int n = 0; n < jumlahMk; n++) {
            jumlahNilai[n] += (float) bobotNilai[n]*bobotSks[n];
            totalNilai += jumlahNilai[n];
        }
        ip = totalNilai / jumlahSKS;
        System.out.println("=======================");
        System.out.printf("IP : %.2f",ip);
    }
}
