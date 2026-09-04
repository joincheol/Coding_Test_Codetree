import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;

        for(int i=1; i<=n; i++){
            num /= i;
            if(num <= 1){
                System.out.println(i);
                break;
            }
        }
    }
}