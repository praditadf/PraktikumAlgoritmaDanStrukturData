package Jobsheet12;

public class Mahasiswa01 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa01(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println(
            "NIM   : " + nim +
            "\nNama  : " + nama +
            "\nKelas : " + kelas +
            "\nIPK   : " + ipk
        );
    }
}