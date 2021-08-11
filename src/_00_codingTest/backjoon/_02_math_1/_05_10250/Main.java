package _00_codingTest.backjoon._02_math_1._05_10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] result = new int[T];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            String strW = st.nextToken();
            int W = Integer.parseInt(strW);
            int N = Integer.parseInt(st.nextToken());
            if(N % H == 0) {
                System.out.println((H * 100) + (N / H));

            } else {
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }
            /*
            // 틀림 ...  why?
            for(int j=1; j<=W; j++){
                if(N <= H){
                    result[i] = N * ((int)Math.pow(10, strW.length())) + j;
                    break;
                }
                N-=H;
            }
            */
        }
    }
}
