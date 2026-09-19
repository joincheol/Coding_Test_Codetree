import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String temp = sc.next();
        int len = str.length();
        int cnt = 0;

        while(!str.equals(temp)){
            str = str.substring(len-1) + str.substring(0, len-1);
            cnt++;
            if(cnt >= len){
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}