import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String[] parts = number.split("-");

        System.out.println(parts[0]+"-"+parts[2]+"-"+parts[1]);
    }
}