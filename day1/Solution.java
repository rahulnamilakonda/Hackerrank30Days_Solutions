package day1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        double num1 = Double.parseDouble(scan.nextLine());
        String s1 = scan.nextLine();
        System.out.println(num + i);
        System.out.println(num1 + d);
        System.out.println(s + s1);
        scan.close();
    }
}