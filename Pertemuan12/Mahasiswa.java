package Pertemuan12;

public class Mahasiswa {
    String nama, nim, kelas, prodi;
    
    Mahasiswa() {

    }

    Mahasiswa(String name, String nm, String kls, String prodi) {
        nama = name;
        nim = nm; 
        kelas = kls;
        this.prodi = prodi;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t\t" + prodi);
    }
}
