package Praktikum03;
public class DataDosen01 {
    void dataSemuaDosen(Dosen01[] arrayOfDosen) {
        System.out.println("Data Semua Dosen");
        int i = 1;
        for (Dosen01 data : arrayOfDosen) {
            data.tampilData(i);
            i++;
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen01 data : arrayOfDosen) {
            if (data.jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
            } else if (data.jenisKelamin.equalsIgnoreCase("Wanita")) {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Per Jenis Kelamin");
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("-----------------------------\n");
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, jumlahPria = 0, jumlahWanita = 0;
        for (Dosen01 data : arrayOfDosen) {
            if (data.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalUsiaPria += data.usia;
                jumlahPria++;
            } else if (data.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totalUsiaWanita += data.usia;
                jumlahWanita++;
            }
        }
        System.out.println("Rerata Usia Dosen Per Jenis Kelamin");
        System.out.println("Rerata Usia Dosen Pria   : " + (totalUsiaPria / jumlahPria));
        System.out.println("Rerata Usia Dosen Wanita : " + (totalUsiaWanita / jumlahWanita));
        System.out.println("-----------------------------\n");
    }

    public Dosen01 infoDosenPalingTua (Dosen01[] arrayOfDosen) {
        Dosen01 dosenPalingTua = new Dosen01();
        dosenPalingTua = arrayOfDosen[0];
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > dosenPalingTua.usia) {
                dosenPalingTua = arrayOfDosen[i];
            }
        }
        System.out.println("Data Dosen Paling Tua");
        dosenPalingTua.tampilData(1);
        System.out.println("-----------------------------\n");
        return dosenPalingTua;
    }

    public Dosen01 infoDosenPalingMuda (Dosen01[] arrayOfDosen) {
        Dosen01 dosenPalingMuda = new Dosen01();
        dosenPalingMuda = arrayOfDosen[0];
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < dosenPalingMuda.usia) {
                dosenPalingMuda = arrayOfDosen[i];
            }
        }
        System.out.println("Data Dosen Paling Muda");
        dosenPalingMuda.tampilData(1);
        System.out.println("-----------------------------\n");
        return dosenPalingMuda;
    }
}
