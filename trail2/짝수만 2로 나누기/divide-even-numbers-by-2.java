import java.util.Scanner;
public class Main {
    static void check(int num){
        if(num % 2 == 0){
            System.out.print(num / 2 + " ");
        }
        else{
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        for(int i=0; i<n; i++){
            check(arr[i]);
        }
    }
}