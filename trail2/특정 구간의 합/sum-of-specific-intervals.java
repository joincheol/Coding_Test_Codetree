import java.util.Scanner;
public class Main {
    static int[] arr;
    static void cal(int num1, int num2){
        int total = 0;
        for(int i=num1-1; i<=num2-1; i++){
            total += arr[i];
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            cal(a1, a2);
        }
    }
}