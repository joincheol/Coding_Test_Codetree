import java.util.Scanner;
public class Main {
    static int getNum(int n){
        if(n==1){
            return 0;
        }
        if(n % 2 == 0){
            return getNum(n/=2) + 1;
        }
        else{
            return getNum(3*n + 1) + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(getNum(n));
    }
}