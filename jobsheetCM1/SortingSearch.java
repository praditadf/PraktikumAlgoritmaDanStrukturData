package jobsheetCM1;

public class SortingSearch {
    SortingSearch() {

    }

    void insertionSort(Peminjaman [] dataPeminjaman) {
        for (int i = 1; i < dataPeminjaman.length; i++) {
            Peminjaman temp = dataPeminjaman[i];
            int j = i - 1;
            while (j >= 0 && dataPeminjaman[j].denda <= temp.denda) {
                dataPeminjaman[j + 1] = dataPeminjaman[j];
                j--;
            }
            dataPeminjaman[j + 1] = temp;
        }
    }

    void sequentialSearch(int nimCari, Peminjaman [] dataPeminjaman) {
        int nimPeminjam = 0;
        for (int i = 0; i < dataPeminjaman.length; i++) {
            if (Integer.parseInt(dataPeminjaman[i].mhs.nim) == nimCari) {
                dataPeminjaman[i].tampilPeminjaman(dataPeminjaman);
                nimPeminjam++;
            }
        }if (nimPeminjam == 0) {
            System.out.println("Data peminjaman dengan NIM " + nimCari + " tidak ditemukan");
        }
    }
}