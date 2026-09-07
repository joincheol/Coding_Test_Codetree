import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int sum1 = 0;
        int sum2 = 0;
        int cnt = 0;

        for(int i=1; i<=10; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 0){
                sum1 += arr[i];
            }
            if(i % 3 == 0){
                sum2 += arr[i];
                cnt++;
            }
        }
        System.out.printf("%d %.1f", sum1, (double)sum2/cnt);
    }
}