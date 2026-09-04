import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int x = 0;

        while(true){
            if(n == num){
                System.out.println(x);
                break;
            }
            num *= 2;
            x++;
        }   
    }
}