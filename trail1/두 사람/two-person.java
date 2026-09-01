import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a_age = sc.nextInt();
        char a_gender = sc.next().charAt(0);
        int b_age = sc.nextInt();
        char b_gender = sc.next().charAt(0);

        if((a_age >= 19 && a_gender == 'M') || (b_age >= 19 && b_gender == 'M')){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}