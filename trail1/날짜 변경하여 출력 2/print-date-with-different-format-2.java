import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String time = sc.next();

        String[] parts = time.split("-");
        System.out.println(parts[2]+"."+parts[0]+"."+parts[1]);
    }
}