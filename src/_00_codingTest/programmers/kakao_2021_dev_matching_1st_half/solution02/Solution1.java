package _00_codingTest.programmers.kakao_2021_dev_matching_1st_half.solution02;

public class Solution1 {
    int[][] arr;
    int[] result;
    int valueMove = 0;
    int min = 0;

    public int[] solution(int rows, int columns, int[][] queries) {
        arr = new int[rows][columns];
        result = new int[queries.length];

        int cnt = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = cnt++;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int x1 = queries[i][0] - 1;
            int y1 = queries[i][1] - 1;
            int x2 = queries[i][2] - 1;
            int y2 = queries[i][3] - 1;
            min = arr[x1][y1];
            rotateRight(x1, y1, y2);
            rotateDown(y2, x1, x2);
            rotateLeft(x2, y2, y1);
            rotateUp(y1, x2, x1);
            result[i] = min;
        }

        return result;
    }

    private void rotateRight(int x1, int y1, int y2) {
        for (int i = y1; i < y2; i++) {
            int temp = 0;
            if (i == y1) {
                valueMove = arr[x1][i + 1];
                arr[x1][i + 1] = arr[x1][i];
            } else {
                temp = arr[x1][i + 1];
                arr[x1][i + 1] = valueMove;
                valueMove = temp;
            }
            if (min > valueMove) min = valueMove;
        }
    }

    private void rotateLeft(int x2, int y2, int y1) {
        for (int i = y2-1; i >= y1; i--) {
            int temp = arr[x2][i];
            arr[x2][i] = valueMove;
            valueMove = temp;
            if (min > valueMove) min = valueMove;
        }
    }

    private void rotateUp(int y1, int x2, int x1) {
        for (int i = x2-1; i >= x1; i--) {
            int temp = arr[i][y1];
            arr[i][y1] = valueMove;
            valueMove = temp;
            if (min > valueMove) min = valueMove;
        }
    }

    private void rotateDown(int y2, int x1, int x2) {
        for (int i = x1+1; i <= x2; i++) {
            int temp = arr[i][y2];
            arr[i][y2] = valueMove;
            valueMove = temp;
            if (min > valueMove) min = valueMove;
        }
    }

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] queries = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
        Solution1 solution1 = new Solution1();
        solution1.solution(rows, columns, queries);
    }
}
