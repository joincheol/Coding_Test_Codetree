import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int total = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= '0' & str.charAt(i) <= '9'){
                total += str.charAt(i) - '0';
            }
        }
        System.out.println(total);
    }
}