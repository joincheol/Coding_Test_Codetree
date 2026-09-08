import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for(int i=0; i<100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999){
                System.out.print(maxVal+" "+minVal);
                break;
            }
            if(maxVal < arr[i]){
                maxVal = arr[i];
            }
            if(minVal > arr[i]){
                minVal = arr[i];
            }
        }
    }
}