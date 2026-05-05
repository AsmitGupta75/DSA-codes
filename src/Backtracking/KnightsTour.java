package Backtracking;

public class KnightsTour {

    public static void nightstour(int board[][], int r, int c, int step) {
        // out of bounds
        if (r < 0 || c < 0 || r >= board.length || c >= board.length) {
            return;
        }

        // already visited
        if (board[r][c] != 0) {
            return;
        }

        // tour complete
        if (step == board.length * board.length) {
            board[r][c] = step;
            print(board);
            System.out.println("___________");
            board[r][c] = 0;

            return;
        }

        // mark step
        board[r][c] = step;

        // knight moves
        nightstour(board, r - 2, c + 1, step + 1);
        nightstour(board, r - 1, c + 2, step + 1);
        nightstour(board, r + 1, c + 2, step + 1);
        nightstour(board, r + 2, c + 1, step + 1);
        nightstour(board, r + 2, c - 1, step + 1);
        nightstour(board, r + 1, c - 2, step + 1);
        nightstour(board, r - 1, c - 2, step + 1);
        nightstour(board, r - 2, c - 1, step + 1);

        // backtrack
        board[r][c] = 0;
    }

    static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int board[][] = new int[5][5];
        nightstour(board, 0, 0, 1);

    }
}

