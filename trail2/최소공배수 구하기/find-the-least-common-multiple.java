import java.util.Scanner;

public class Main {
    public static int cal(int num1, int num2){
        int result = 0;
        for(int i=1; i<=Math.min(num1, num2); i++){
            if(num1 % i == 0 & num2 % i == 0){
                result = i;
            }
        }
        return num1 * num2 / result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        System.out.println(cal(n, m));
    }
}