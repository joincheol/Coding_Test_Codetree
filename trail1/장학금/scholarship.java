import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int last = sc.nextInt();

        if(mid >= 90 && last >= 95){
            System.out.println(100000);
        }
        else if(mid >= 90 && last >= 90){
            System.out.println(50000);
        }
        else{
            System.out.println(0);
        }
    }
}