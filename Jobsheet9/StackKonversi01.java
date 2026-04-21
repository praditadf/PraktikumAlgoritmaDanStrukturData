package Jobsheet9;

public class StackKonversi01 {
    int top, size;
    int [] tumpukanBiner;

    StackKonversi01() {
        size = 100;
        tumpukanBiner = new int[size];
        top = -1;
    }
    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
