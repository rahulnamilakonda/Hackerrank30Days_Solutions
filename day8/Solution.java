package day8;
import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            hashMap.put(name, phone);
        }
        String str[] = new String[hashMap.size()+1];
        for (int i = 1; i <= hashMap.size(); i++) {
            str[i] = in.next();
        }
        for (int i = 1; i <= n; i++) {
            if (hashMap.containsKey(str[i]))
                System.out.println(str[i] + "=" + hashMap.get(str[i]));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
