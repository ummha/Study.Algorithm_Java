package _00_codingTest.backjoon._02_math_1._09_1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=0 ; i<T ; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int distance = y-x;

            double j = Math.sqrt(distance);
            int n = (int) j;

            if(distance == n*n)
                sb.append(2*n-1).append("\n");
            else if (distance <= n*(n+1))
                sb.append(2*n).append("\n");
            else
                sb.append(2*n+1).append("\n");
        }
        System.out.println(sb);
    }

    // 정상작동
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int testCase = Integer.parseInt(br.readLine());
//        long[] result = new long[testCase];
//
//        for (int i = 0; i < testCase; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            long x = Long.parseLong(st.nextToken());
//            long y = Long.parseLong(st.nextToken());
//
//            long dis = y - x;
//            long cnt = 0; // 총 이동거리
//            long ans = 1;
//            while (cnt < dis) {
//                ans++;
//                cnt+=(ans/2);
//            }
//            result[i] = ans-1;
//        }
//        for (long l : result) {
//            System.out.println(l);
//        }
//    }
}
