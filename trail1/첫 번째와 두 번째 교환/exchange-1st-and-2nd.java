import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        char first = c[0];
        char second = c[1];

        for(int i=0; i<str.length(); i++){
            if(c[i] == first){
                c[i] = second;
            }
            else if(c[i] == second){
                c[i] = first;
            }
        }
        str = String.valueOf(c);
        System.out.println(str);
    }
}