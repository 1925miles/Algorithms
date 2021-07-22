package Algorithms;

import java.util.Scanner;

public class lx_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a == b && a == c) {
            System.out.print("equal");
        } else {
            System.out.print("not equal");
        }
    }
}
