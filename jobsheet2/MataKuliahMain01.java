public class MataKuliahMain01 {
    public static void main(String[] args) {
        MataKuliah01 mk1 = new MataKuliah01();
        mk1.kodeMK = "PASD_TI";
        mk1.nama = "Praktikum Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(3);
        mk1.kurangJam(1);
        mk1.tampilInformasi();

        MataKuliah01 mk2 = new MataKuliah01("ASD_TI", "Algoritma dan Struktur Data", 2, 4);
        mk2.tampilInformasi();
    }
}
