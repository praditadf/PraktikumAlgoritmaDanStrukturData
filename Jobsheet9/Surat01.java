package Jobsheet9;

public class Surat01 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;
    String proses;

    Surat01() {

    }

    Surat01(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
        this.proses = "Belum diproses";
    }

    void diproses(String verif) {
        if (verif.equalsIgnoreCase("y")) {
            this.proses = "Disetujui";
        }else {
            this.proses = "Ditolak";
        }
    }
}
