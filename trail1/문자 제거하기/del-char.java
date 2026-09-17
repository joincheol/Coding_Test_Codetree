import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0; i<20; i++){
            int len = str.length();
            if(len <= 1){
                break;
            }
            int n = sc.nextInt();
            if(n >= len){
                str = str.substring(0, len-1);
                System.out.println(str);
                continue;
            }
            str = str.substring(0, n) + str.substring(n+1);
            System.out.println(str);
        }
    }
}