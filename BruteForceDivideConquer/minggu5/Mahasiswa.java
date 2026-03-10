package BruteForceDivideConquer.minggu5;
public class Mahasiswa {
    String nama, nim;
    int tahun, uts, uas;
    public Mahasiswa (String nm, String nim, int th, int uts, int uas) {
        nama = nm;
        this.nim = nim;
        tahun = th;
        this.uts = uts;
        this.uas = uas;
    }
    double utsTertinggi (int uts[], int l, int r) {
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r ) / 2;
        double left = utsTertinggi(uts, l, mid);
        double right = utsTertinggi(uts, mid + 1, r);
        if (left > right) {
            return left;
        } else {
            return right;
        }
    }
    double utsTerendah (int uts[], int l, int r) {
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r ) / 2;
        double left = utsTerendah(uts, l, mid);
        double right = utsTerendah(uts, mid + 1, r);
        if (left < right) {
            return left;
        } else {
            return right;
        }
    }
    double rataUas(int uas[]) {
        double rata = 0;
        for (int i = 0; i < uas.length; i++) {
            rata += uas[i];
        }
        return rata/uas.length;
    } 
}
