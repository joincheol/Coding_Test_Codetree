import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String order = sc.next();
        char[] o = order.toCharArray();
        int len = str.length();

        for(int i=0; i<order.length(); i++){
            if(o[i] == 'L'){
                str = str.substring(1) + str.substring(0, 1);
            }
            else{
                str = str.substring(len-1) + str.substring(0, len-1);
            }
        }
        System.out.println(str);
    }
}