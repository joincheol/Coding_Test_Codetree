import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] grid = new int[101][101];
        int r = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.
            if(direction == 'N'){
                r += distance;
            }
            else if(direction == 'S'){
                r -= distance;
            }
            else if(direction == 'E'){
                c += distance;
            }
            else if(direction == 'W'){
                c -= distance;
            }
        }
        System.out.println(c+" "+r);
    }
}