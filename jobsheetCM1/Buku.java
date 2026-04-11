package jobsheetCM1;

public class Buku {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku() {

    }

    Buku(String kode, String judul, int tahun) {
        kodeBuku = kode;
        this.judul = judul;
        tahunTerbit = tahun;
    }

    void tampiilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}
