import java.util.Scanner;
public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input NIM: ");
        long nim = sc.nextLong();
        long n = nim%100;
        if (n < 10) {
            n += 10;
        }
        System.out.print("Output: ");
        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                System.out.print("");
            }else if (i%3==0) {
                System.out.print("# ");
            }else if (i%2==1) {
                System.out.print("* ");
            }else if (i%2==0) {
                if (i%3!=0) {
                    System.out .print(i+" ");
                }
            }
        }
    }
}
