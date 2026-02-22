public class MataKuliah01 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah01() {

    }

    public MataKuliah01(String mk, String nm, int sks, int jmlJam) {
        kodeMK = mk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS\t: " + sks);
        System.out.println("Jumlah Jam\t: " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sksBaru);
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam telah ditambah menjadi: " + jumlahJam);
    }
    void kurangJam(int jam) {
        if (jumlahJam > jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi menjadi: " + jumlahJam);
        }else {
            System.out.println("Jam tidak mencukupi untuk dikurangi");
        }
    }
}