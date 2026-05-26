package Pertemuan14;

public class Node01 {

    Mahasiswa01 mahasiswa;
    Node01 left, right;

    Node01() {

    }

    Node01(Mahasiswa01 mahasiswa) {
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}