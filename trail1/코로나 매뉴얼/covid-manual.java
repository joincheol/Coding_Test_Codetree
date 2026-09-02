import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int a_temp = sc.nextInt();
        char b = sc.next().charAt(0);
        int b_temp = sc.nextInt();
        char c = sc.next().charAt(0);
        int c_temp = sc.nextInt();

        if((a=='Y' && a_temp>=37) && (b=='Y' && b_temp>=37) ||
        (a=='Y' && a_temp>=37) && (c=='Y' && c_temp>=37) ||
        (b=='Y' && b_temp>=37) && (c=='Y' && c_temp>=37)){
            System.out.println("E");
        }
        else{
            System.out.println("N");
        }
    }
}