import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String time = sc.next();

        String[] afterTime = time.split(":");
        System.out.println(Integer.parseInt(afterTime[0]) + 1 +":"+afterTime[1]);
    }
}