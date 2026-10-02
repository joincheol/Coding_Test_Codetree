import java.util.Scanner;
public class Main {
    static int[] arr;
    static int max;

    static int getMax(int n){
        if(n==0){
            return max;
        }
        if(max < arr[n]){
            max = arr[n];
        }
        return getMax(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        max = arr[0];
        System.out.println(getMax(n-1));
    }
}