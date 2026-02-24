public class Mahasiswa01 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    void cetakInfo() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     : " + nim);
            System.out.println("Nama    : " + nama);
            System.out.println("Kelas   : " + kelas);
            System.out.printf("IPK     : %.2f \n" , ipk);
            System.out.println("-----------------------------");
        }
    }
}