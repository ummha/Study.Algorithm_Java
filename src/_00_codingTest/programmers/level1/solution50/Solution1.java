package _00_codingTest.programmers.level1.solution50;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) sb.append("*");
        for (int i = 0; i < m; i++) {
            System.out.println(sb.toString());
        }
    }

}
