import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int n;
    static int[][] grid;
    static boolean[][] visited;
    static int count;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        grid = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        count = 0;
        for(int i=0; i<k; i++){
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            if(!visited[r][c] && grid[r][c] == 0){
                bfs(r ,c);
            }
        }
        System.out.println(count);
    }
    static void bfs(int sr, int sc){
        Queue<int[]> q = new LinkedList<>();
        visited[sr][sc] = true;
        count++;
        q.add(new int[]{sr, sc});

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            for(int d=0; d<4; d++){
                int nr = r + dr[d];
                int nc = c + dc[d];

                if(nr < 0 || nr >= n || nc < 0 || nc >= n){
                    continue;
                }
                if(visited[nr][nc]){
                    continue;
                }
                if(grid[nr][nc] == 1){
                    continue;
                }

                visited[nr][nc] = true;
                q.add(new int[]{nr, nc});
                count++;
            }
        }
    }
}