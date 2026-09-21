import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int len2 = str2.length();

        while(str1.indexOf(str2) > -1){
            str1 = str1.substring(0, str1.indexOf(str2)) + str1.substring(str1.indexOf(str2) + len2);
        }
        System.out.println(str1);
    }
}