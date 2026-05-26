package Pertemuan14;

public class BinaryTreeMain01 {

    public static void main(String[] args) {
        BinaryTree01 bst = new BinaryTree01();

        bst.add(new Mahasiswa01("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa01("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa01("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa01("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal) :");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa01("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa01("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa01("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiwa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPenambahan data mahasiswa");
        bst.addRekursif(bst.root, new Mahasiswa01("244160170", "Fafa", "C", 3.38));
        System.out.println("NIM: 244160170 Nama: Fafa Kelas: C IPK: 3.38");
        
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nData mahasiswa dengan ipk paling kecil");
        bst.cariMinIpk(bst.root);
        System.out.println("Data mahasiswa dengan ipk paling besar");
        bst.cariMaxIpk(bst.root);

        System.out.println("\nDaftar mahasiswa dengan IPK diatas 3.50");
        bst.tampilMahasiswaIPKdiAtas(bst.root, 3.50);
    }
}