import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ab = a+b;
        String ba = b+a;
        boolean status = true;

        for(int i=0; i<ab.length(); i++){
            if(ab.charAt(i) != ba.charAt(i)){
                status = false;
            }
        }
        System.out.println(status);
    }
}