package org.example;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
//comment

          for (int i = 1; i <= n; i++) {
            printRow(n, i);
        }
        for (int i = n - 1; i >= 1; i--) {
            printRow(n, i);
        }
    }
    public static void printRow(int n,int j)
    {

for (int i = 1; i <= n - j; i++) {
            System.out.print(" ");
        }
           //  switch (j) {
           // default:
                for (int i = 1; i <= j; i++) {
                    System.out.print(i);
                }
                for (int i = j - 1; i >= 1; i--) {
                    System.out.print(i);
                }
              //  break;



             System.out.println();
    }
}

