package day9;

import java.io.IOException;
import java.util.Scanner;

class Result {

    public Result() {
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Result.factorial(n);
        System.out.println(result);
        sc.close();

    }
}
