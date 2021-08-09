package _00_codingTest.backjoon._01_string._10_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = 0;
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i < n; i++) {
            if(checker()) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }

    public static boolean checker() throws IOException {
        boolean[] check = new boolean[26];
        int p = 0;
        String str = br.readLine();

        for(int i=0; i < str.length(); i++) {
            int now = str.charAt(i);

            if(p != now) {
                if(!check[now - 'a']) {
                    check[now - 'a'] = true;
                    p = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
