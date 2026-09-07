import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = sc.nextInt();
        int cnt = 0;
        System.out.print(arr[0]+" ");
        if(arr[0] % 5 == 0){
            cnt++;
        }
        

        for(int i=1; i<=10; i++){
            arr[i] = arr[i-1] + arr[0];
            System.out.print(arr[i]+" ");
            if(arr[i] % 5 == 0){
                cnt++;
                if(cnt == 2){
                    break;
                }
            }
        }

    }
}