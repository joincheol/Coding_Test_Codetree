import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int maxVal = Integer.MIN_VALUE;

        for(int i=0; i<10; i++){
            num[i] = sc.nextInt();
            if(maxVal < num[i]){
                maxVal = num[i];
            }
        }
        System.out.println(maxVal);
    }
}