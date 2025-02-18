package Praktikum01;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();
        
        int n = (int) (nim % 100);
        if (n < 10) {
            n += 10;
        }

        System.out.println("=========================");
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        sc.close();
    }    
}