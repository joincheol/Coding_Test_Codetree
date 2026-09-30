import java.util.Scanner;

public class Main {
    static int getNum(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        return getNum(n - 1) + getNum(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(getNum(n));
    }
}