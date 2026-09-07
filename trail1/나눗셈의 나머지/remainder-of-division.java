import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] num = new int[10];

        while(true){
            num[a%b]++;
            a = a/b;
            if(a <= 1){
                break;
            }
        }
        int sum = 0;
        for(int i=0; i<10; i++){
            if(num[i] >= 1){
                sum += num[i] * num[i];
            }
        }
        System.out.println(sum);
    }
}