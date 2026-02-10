public class PraktikumFungsi {
    static String [] cabangToko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4",};
    static int [] harga = {75000, 50000, 60000, 10000,};
    static int [][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    public static void main(String[] args) {
        pendapatan();
    }

    static void pendapatan(){
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPerCabang = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPerCabang += stockBunga[i][j] * harga[j];
            }
            System.out.println("Pendapatan Cabang "+ cabangToko[i]+ " : "+totalPerCabang );
            if (totalPerCabang > 1500000) {
                System.out.println("Status : Sangat Baik");
            }else {
                System.out.println("Status : Perlu Evaluasi");
            }
        }
    }
}
