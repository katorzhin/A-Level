package HomeWork;

import java.util.Scanner;

public class Pascal {
    public static int[][] p;
    public static Scanner in = new Scanner(System.in);

    public static void showPascal(int n) {
        p = new int[n][n];
        int i;
        for (i = 0; i < p.length; i++) {
            p[i][0] = 1;
            p[i][i] = 1;
        }
        int j;
        for (i = 2; i < p.length; i++) {
            for (j = 1; j < p.length - 1; j++) {
                p[i][j] = p[i - 1][j - 1] + p[i - 1][j];
            }
        }
        print();
    }

    public static void print() {
        if (p != null) {
            int i, j;
            for (i = 0; i < p.length; i++) {
                for (j = 1; j < i; j++) {
                    System.out.print(p[i][j] + "\t");
                }
                System.out.println();

            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int n = in.nextInt();
        showPascal(n);
    }

}
