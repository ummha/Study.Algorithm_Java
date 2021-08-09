package _00_codingTest.backjoon._01_string._05_1157;

public class Main2 {
    // 가장 빠른 효율성을 도출한 코드
    public static void main(String[] args) throws Exception {
        int[] a = new int[26];
        int c, max = 0, maxa = -2;

        while ((c = System.in.read()) > 64) {
            c -= 'a';
            if (c < 0)
                c += 32;

            a[c]++;

            if (max < a[c]) {
                max = a[c];
                maxa = c;
            } else if (max == a[c])
                maxa = -2;
        }

        System.out.print((char)(maxa + 65));
    }
}
