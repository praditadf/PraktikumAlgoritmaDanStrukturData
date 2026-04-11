package jobsheetCM1;

public class Peminjaman {
    Mahasiswa mhs = new Mahasiswa();
    Buku buku = new Buku();
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman() {

    }

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = 2000 * terlambat;
        } else {
            denda = 0;
            terlambat = 0;
        }
    }

    void tampilPeminjaman(Peminjaman[] dataPeminjaman) {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat
                + " | Denda: " + denda);
    }
}
