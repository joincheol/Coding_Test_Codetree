import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int n;
    static int m;
    static int[][] grid;
    static int[][] dist;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        dist = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                grid[i][j] = sc.nextInt();
                dist[i][j] = -1;
            }
        }
        // Please write your code here.
        bfs(0, 0);

        System.out.println(dist[n-1][m-1] > -1 ? 1 : 0);
    }
    static void bfs(int sr, int sc){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr, sc});
        dist[sr][sc] = 0;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            for(int d=0; d<4; d++){
                int nr = r + dr[d];
                int nc = c + dc[d];

                if(nr < 0 || nr >= n || nc < 0 || nc >= m){
                    continue;
                }
                if(dist[nr][nc] != -1){
                    continue;
                }
                if(grid[nr][nc] == 0){
                    continue;
                }

                dist[nr][nc] = dist[r][c] + 1;
                q.add(new int[]{nr, nc});
            }
        }
    }
}