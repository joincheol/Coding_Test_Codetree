import java.util.Scanner;

public class Main {
    public static void cal(int n1, int n2){
        int divide = 1;
        for(int i=1; i<=Math.min(n1, n2); i++){
            if(n1 % i == 0 & n2 % i == 0){
                divide = i;
            }
        }
        System.out.println(divide);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        cal(n, m);
    }
}