package Praktikum05;

public class DataDosen01 {
    Dosen01[] dataDosen = new Dosen01[10];
    int idx;

    void tambah(Dosen01 d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen masih kosong");
        } else {
            for (Dosen01 d : dataDosen) {
                d.tampil();
                System.out.println("-------------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen01 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen01 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 0; i < dataDosen.length; i++) {
            Dosen01 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
