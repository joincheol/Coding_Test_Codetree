import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        String new_str = "";

        for(int i=0; i<str.length(); i++){
            if(i == 1 | i == str.length()-2){
                continue;
            }
            new_str += c[i];
        }
        System.out.println(new_str);
    }
}