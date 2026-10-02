import java.util.Scanner;
public class Main {
    static int[] arr;

    static int getMax(int n){
        if(n==0){
            return arr[n];
        }
        return Math.max(getMax(n-1), arr[n]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.println(getMax(n-1));
    }
}