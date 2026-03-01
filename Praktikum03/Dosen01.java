package Praktikum03;
public class Dosen01 {
    String kode, nama, jenisKelamin;
    int usia;

    public Dosen01() {

    }

    public Dosen01(String kode, String nama, String jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampilData(int i) {
        System.out.println("Data Dosen ke-" + i);
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Usia          : " + usia);
        System.out.println("-----------------------------");
    }
}
