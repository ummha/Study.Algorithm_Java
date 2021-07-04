package _00_codingTest.programmers.level1.solution11;

public class Solution1 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] basket = new int[moves.length];

        int position = 0;
        for(int i=0; i<moves.length; i++){

            int item=0;
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    item = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }

            if(item == 0) continue;

            basket[position] = item;
            if(position > 0){
                if(basket[position-1] == basket[position]){
                    basket[position-1] = 0;
                    basket[position] = 0;
                    position--;
                    answer+=2;
                }else
                    position++;
            }else
                position++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};

        Solution1 solution1 = new Solution1();
        int result = solution1.solution(board, moves);
        System.out.println(result);
    }
}
