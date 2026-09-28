import java.util.Scanner;

public class Main {
    static void cal(int a, int b){
        if(a > b){
            a += 25;
            b *= 2;
            System.out.print(a+" "+b);
        }
        else{
            a *= 2;
            b += 25;
            System.out.print(a+" "+b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        cal(a, b);
    }
}