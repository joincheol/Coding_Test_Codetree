import java.util.Scanner;
public class Main {
    static void printHello(int n){
        if(n == 0){
            return;
        }
        System.out.println("HelloWorld");
        n--;
        printHello(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printHello(n);
    }
}