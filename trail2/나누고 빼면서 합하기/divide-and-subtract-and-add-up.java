import java.util.Scanner;
public class Main {
    static int[] arr;
    static int cal(int start){
        int total = arr[start];

        while(start != 1){
            if(start % 2 == 0){
                start /= 2;
            }
            else{
                start -= 1;
            }
            total += arr[start];
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(cal(m));
    }
}