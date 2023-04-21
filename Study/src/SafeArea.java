public class SafeArea {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] adj = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cur = board[i][j];
                if (cur == 1) {
                    for (int[] x : adj) {
                        int ni = i + x[0];
                        int nj = j + x[1];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                            if (board[ni][nj] == 0) {
                                board[ni][nj] = 2;
                            }
                        }
                    }
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        SafeArea sol = new SafeArea();
        sol.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}});
    }
}
