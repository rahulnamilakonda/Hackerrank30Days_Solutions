package day6;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < s.length ;i++) {
            s[i]=sc.next();

        }
        for (int i = 0; i < s.length; i++) {
            printEven(s[i]);
            printOdd(s[i]);
            System.out.println("");
        }
        sc.close();
    }

    private static void printOdd(String string) {
        System.out.print(" ");
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 != 0)
                System.out.print(string.charAt(i) + "");
        }

    }

    private static void printEven(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0)
                System.out.print(string.charAt(i) + "");
        }
    }

}