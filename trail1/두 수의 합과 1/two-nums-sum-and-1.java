import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int num = Integer.parseInt(str1) + Integer.parseInt(str2);
        String result = Integer.toString(num);
        int cnt = 0;

        for(int i=0; i<result.length(); i++){
            if(result.charAt(i) == '1'){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}