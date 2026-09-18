import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            total += num;
        }
        String str = Integer.toString(total);
        System.out.println(str.substring(1) + str.substring(0, 1)); 
    }
}