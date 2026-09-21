import java.util.Scanner;

public class Main {
    public static int check(int a, int b){
        int total = 0;
        for(int i=a; i<=b; i++){
            boolean status = true;
            for(int j=2; j<i; j++){
                if(i % j == 0){
                    status = false;
                    break;
                }
            }
            if(status == true){
                total += i;
                status = false;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.println(check(a, b));
    }
}