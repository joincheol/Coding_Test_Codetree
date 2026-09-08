import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int gap = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(gap < arr[j] - arr[i]){
                    gap = arr[j] - arr[i];
                }
            }
        }
        System.out.println(gap);
    }
}