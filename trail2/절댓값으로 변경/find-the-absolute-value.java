import java.util.Scanner;

public class Main {
    static void absNum(int num){
        if(num > 0){
            System.out.print(num + " ");
        }
        else{
            System.out.print(-1*num + " ");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        for(int i=0; i<n; i++){
            absNum(arr[i]);
        }
    }
}