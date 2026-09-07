import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<10; i++){
            num[i] = sc.nextInt();
            if((i+1) % 2 == 0){
                sum1 += num[i];
            }
            else{
                sum2 += num[i];
            }
        }
        if(sum1 > sum2){
            System.out.println(sum1 - sum2);
        }
        else{
            System.out.println(sum2 - sum1);
        }
    }
}