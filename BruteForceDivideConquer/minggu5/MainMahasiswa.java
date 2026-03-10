package BruteForceDivideConquer.minggu5;
public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa [] mh = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };
        int [] uts = new int[8];
        for (int i = 0; i < uts.length; i++) {
            uts[i] = mh[i].uts;
        }
        int [] uas = new int[8];
        for (int i = 0; i < uas.length; i++) {
            uas[i] = mh[i].uas;
        }
        System.out.println("Nilai UTS Tertinggi: "+mh[0].utsTertinggi(uts, 0, uts.length-1));
        System.out.println("Nilai UTS Terendah: "+mh[0].utsTerendah(uts, 0, uts.length-1));
        System.out.println("Rata-rata nilai UAS: "+mh[0].rataUas(uas));
    }

}
