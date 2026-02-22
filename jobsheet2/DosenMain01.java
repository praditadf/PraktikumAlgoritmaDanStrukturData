public class DosenMain01 {
    public static void main(String[] args) {
        Dosen01 ds1 = new Dosen01();
        ds1.idDosen = "ACH";
        ds1.nama = "Achmad";
        ds1.statusAktif = false;
        ds1.tahunBergabung = 2006;
        ds1.bidangKeahlian = "Teknologi Informasi";

        ds1.tampilInformasi();
        int masaKerja = ds1.hitungMasaKerja(2026);
        System.out.println("Masa Kerja : " +masaKerja + " Tahun");
        ds1.setStatusAktif(true);
        ds1.ubahKeahlian("Sistem Informasi");
        ds1.tampilInformasi();

        Dosen01 ds2 = new Dosen01("PA", "Pradita", "Teknologi Informasi", false, 2015);
        ds2.tampilInformasi();
    }
}
