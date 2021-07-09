package day7;
import java.io.IOException;
import java.util.Scanner;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int a[]=new int[len+1];
        for(int i=0;i<len;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=len-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
