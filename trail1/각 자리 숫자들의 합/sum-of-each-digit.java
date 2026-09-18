import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int total = 0;

        for(int i=0; i<str.length(); i++){
            total += str.charAt(i) - '0';
        }
        System.out.println(total);
    }
}