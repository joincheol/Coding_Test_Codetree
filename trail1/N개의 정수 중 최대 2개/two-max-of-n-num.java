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

        int maxVal = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0; i<n; i++){
            if(maxVal < arr[i]){
                maxVal = arr[i];
                index = i;
            }
        }
        System.out.print(maxVal+" ");

        int s_maxVal = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(s_maxVal < arr[i] && i != index){
                s_maxVal = arr[i];
            }
        }
        System.out.print(s_maxVal);
    }
}