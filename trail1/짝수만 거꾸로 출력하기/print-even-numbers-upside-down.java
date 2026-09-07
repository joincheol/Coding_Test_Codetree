import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            if(temp % 2 == 0){
                arr[cnt] = temp;
                cnt++;
            }
        }
        for(int i = cnt-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}