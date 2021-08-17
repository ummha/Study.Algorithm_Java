package _00_codingTest.backjoon._02_math_1._08_10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // BigInteger 활용
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        BigInteger A = new BigInteger(st.nextToken());
//        BigInteger B = new BigInteger(st.nextToken());
//
//        System.out.println(A.add(B).toString());
//    }

    // 배열을 활용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str_A = st.nextToken();
        String str_B = st.nextToken();

        int max_length = Math.max(str_A.length(), str_B.length());
        int[] A = new int[max_length + 1];	// 마지막 자리수 올림이 있을 수 있으므로 +1
        int[] B = new int[max_length + 1];	// 마지막 자리수 올림이 있을 수 있으므로 +1

        // A 초기화
        for(int i = str_A.length() - 1, idx = 0; i >= 0; i--, idx++) {
            A[idx] = str_A.charAt(i) - '0';	// 맨 뒤 문자부터 역순으로 하나씩 저장
        }

        // B 초기화
        for(int i = str_B.length() - 1, idx = 0; i >= 0; i--, idx++) {
            B[idx] = str_B.charAt(i) - '0';	// 맨 뒤 문자부터 역순으로 하나씩 저장
        }

        // 덧셈
        for(int i = 0; i < max_length; i++) {
            int value = A[i] + B[i];
            A[i] = value % 10;	// 더한 값의 10으로 나눈 나머지가 자리값이 됨
            A[i + 1] = A[i + 1] + (value / 10);	// 더한 값의 10으로 나눈 몫이 올림값이 됨
        }

        // A배열 역순 출력
        // 가장 높은 자리수가 0일 수도 있기 때문에 0이 아닐 경우에만 출력
        StringBuilder sb = new StringBuilder();
        if(A[max_length] != 0) {
            sb.append(A[max_length]);
        }
        for(int i = max_length - 1; i >= 0; i--) {
            sb.append(A[i]);
        }

        System.out.println(sb);
    }

    // 백준에서 런타임 Exception 뱉음...?
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        String A = st.nextToken();
//        String B = st.nextToken();
//
//        int startAtA = A.length()-1;
//        int startAtB = B.length()-1;
//        StringBuilder result = new StringBuilder();
//
//        int x = 0;
//        while ((startAtA >= startAtB ? startAtA : startAtB) > -1) {
//            int a = 0;
//            if(startAtA > -1) a = Integer.parseInt(String.valueOf(A.charAt(startAtA)));
//            int b = 0;
//            if(startAtB > -1) b = Integer.parseInt(String.valueOf(B.charAt(startAtB)));
//            int ab = a + b + x;
//            if (ab >= 10) {
//                x = 1;
//                result.append(ab % 10);
//            } else {
//                x = 0;
//                result.append(ab);
//            }
//            startAtA--;
//            startAtB--;
//        }
//        if(x == 1) result.append("1");
//        System.out.println(result.reverse().toString());
//    }
}
