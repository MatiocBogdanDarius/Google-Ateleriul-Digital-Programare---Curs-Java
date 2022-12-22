package curs06.collections.challenge6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> matrix01 = List.of(
                List.of(1, 2, 3, 4),
                List.of(12, 13, 14, 5),
                List.of(11, 16, 15, 6),
                List.of(10, 9, 8, 7)
        );
        spiralOrder(matrix01);
    }

    public static void spiralOrder(List<List<Integer>> matrix)
    {
        if (matrix.size() == 0) return;

        int m = matrix.size(), n = matrix.get(0).size();
        boolean[][] seen = new boolean[m][n];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int x = 0, y = 0, di = 0;

        for (int i = 0; i < m * n; i++) {
            System.out.print(matrix.get(x).get(y) + " ");
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];

            if (0 <= cr && cr < m && 0 <= cc && cc < n
                    && !seen[cr][cc]) {
                x = cr;
                y = cc;
            }
            else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
    }
}
