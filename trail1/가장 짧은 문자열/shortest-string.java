import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if(len1 > len2){
            if(len1 > len3){
                max = len1;
                if(len2 > len3){
                    min = len3;
                }
                else{
                    min = len2;
                }
            }
            else{
                max = len3;
                min = len2;
            }
        }
        else{
            if(len2 > len3){
                max = len2;
                if(len3 > len1){
                    min = len1;
                }
                else{
                    min = len3;
                }
            }
            else{
                max = len3;
                min = len1;
            }
        }
        System.out.println(max - min);
    }
}