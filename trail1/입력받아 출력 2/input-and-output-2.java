import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String p_number = sc.next();

        String[] p_num = p_number.split("-");
        System.out.println(p_num[0]+p_num[1]);
    }
}