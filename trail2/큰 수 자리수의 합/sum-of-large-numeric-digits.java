import java.util.Scanner;
public class Main {
    static int getNum(int total){
        if(total < 10){
            return total % 10;
        }
        return getNum(total / 10) + total % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.println(getNum(a*b*c));
    }
}