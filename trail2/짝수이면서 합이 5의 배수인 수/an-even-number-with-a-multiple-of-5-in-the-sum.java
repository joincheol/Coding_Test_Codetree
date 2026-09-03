import java.util.Scanner;
public class Main {
    public static boolean check(int n){
        boolean result = false;

        if(n % 2 == 0 && (n/10 + n%10) % 5 == 0){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        if(check(n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}