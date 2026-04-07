package jobsheetCM1;
public class Mahasiswa {
    String nim, nama, prodi;
    Mahasiswa (String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    void tampilMahasiswa () {
        System.out.println("Nama: " +nama);
        System.out.println("NIM: " +nim);
        System.out.println("Prodi: " +prodi);
    }
}
