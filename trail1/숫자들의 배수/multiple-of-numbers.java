import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int cnt = 0;

        while(true){
            System.out.print(n*i+" ");
            if(n*i % 5 == 0){
                cnt++;
                if(cnt == 2){
                    break;
                }
            }
            i++;
        }
    }
}