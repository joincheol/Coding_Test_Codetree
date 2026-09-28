import java.util.Scanner;
public class Main {
    static void twoAlpha(String str){
        int len = str.length();
        for(int i=1; i<len; i++){
            if(str.charAt(i-1) != str.charAt(i)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        twoAlpha(A);
    }
}