import java.util.Scanner;

public class Main {
    static int getSum(int n){
        int total = 0;
        if(n % 2 == 1){
            for(int i=1; i<=n; i+=2){
                total += i;
            }
        }
        else{
            for(int i=2; i<=n; i+=2){
                total += i;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(getSum(n));
    }
}