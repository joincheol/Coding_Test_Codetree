import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1001];

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            arr[num]++;
        }

        int max = -1;
        for(int i=0; i<1001; i++){
            if(arr[i] == 1){
                max = i;
            }
        }
        System.out.println(max);
    }
}