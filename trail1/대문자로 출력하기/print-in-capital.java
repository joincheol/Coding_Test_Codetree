import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            if(c[i] >= 'a' & c[i] <= 'z'){
                System.out.print((char)(c[i] - 'a' + 'A'));
            }
            else if(c[i] >= 'A' & c[i] <= 'Z'){
                System.out.print((char)c[i]);
            }
        }
    }
}