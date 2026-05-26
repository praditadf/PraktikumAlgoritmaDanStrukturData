package Pertemuan14;

public class Mahasiswa01 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa01() {

    }

    Mahasiswa01(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("NIM: " + this.nim + " " + "Nama: " + this.nama + " " + "Kelas: " + this.kelas + " "
                + "IPK: " + this.ipk);
    }
}