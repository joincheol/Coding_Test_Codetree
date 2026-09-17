import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        if(a > b){
            System.out.println((a+b)+" "+(a-b));
        }
        else{
            System.out.println((a+b)+" "+(b-a));
        }
    }
}