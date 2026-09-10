import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        double w_total1 = 0;
        double w_total2 = 0;
        double h_total1 = 0;
        double h_total2 = 0;
        double h_total3 = 0;
        double h_total4 = 0;
        double total = 0;

        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
                total += arr[i][j];
            }
        }

        for(int i=0; i<4; i++){
            w_total1 += arr[0][i];
            w_total2 += arr[1][i];
        }
        for(int i=0; i<2; i++){
            h_total1 += arr[i][0];
            h_total2 += arr[i][1];
            h_total3 += arr[i][2];
            h_total4 += arr[i][3];
        }

        System.out.printf("%.1f %.1f\n", w_total1 / 4, w_total2 / 4);
        System.out.printf("%.1f %.1f %.1f %.1f\n", h_total1 / 2, h_total2 / 2, h_total3 / 2, h_total4 / 2);
        System.out.printf("%.1f", total / 8);
    }
}