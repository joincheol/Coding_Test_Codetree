import java.util.Scanner;
public class Main {
    public static String text;
    public static String pattern;
    public static void startIndex(){
        int len1 = text.length();
        int len2 = pattern.length();

        for(int i=0; i<len1-len2+1; i++){
            if(text.substring(i, i+len2).equals(pattern)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        // Please write your code here.
        startIndex();
    }
}