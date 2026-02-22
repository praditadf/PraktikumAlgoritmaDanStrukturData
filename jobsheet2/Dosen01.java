public class Dosen01 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen01() {

    }

    public Dosen01 (String id, String nm, String bidang, boolean status, int tahunBergabung) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        this.tahunBergabung = tahunBergabung;
        bidangKeahlian = bidang;
    }

    void tampilInformasi() {
        System.out.println("\nID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        if (statusAktif == true) {
            System.out.println("Status: Aktif");
        } else {
            System.out.println("Status: Tidak Aktif");
        }
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (statusAktif == true) {
            System.out.println("\nStatus telah diubah menjadi: Aktif");
        } else {
            System.out.println("\nStatus telah diubah menjadi: Tidak Aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang Keahlian telah diubah menjadi : "+ bidangKeahlian);
    }
}