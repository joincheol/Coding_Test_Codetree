import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        c[1] = 'a';
        c[str.length()-2] = 'a';

        str = String.valueOf(c);
        System.out.println(str);
    }
}