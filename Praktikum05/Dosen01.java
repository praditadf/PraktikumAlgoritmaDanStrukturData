package Praktikum05;
public class Dosen01 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen01 (String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil () {
        System.out.println("Kode: " +kode);
        System.out.println("Nama: " +nama);
        String kelamin;
        if (jenisKelamin) {
            kelamin = "Pria";
        }else {
            kelamin = "Wanita";
        }
        System.out.println("Jenis Kelamin: "+kelamin);
        System.out.println("Usia: " +usia);
    }
}
