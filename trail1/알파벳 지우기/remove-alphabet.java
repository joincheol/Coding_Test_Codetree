import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String temp1 = "";
        String temp2 = "";

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) >= '0' & str1.charAt(i) <= '9'){
                temp1 += str1.charAt(i);
            }
        }
        
        for(int i=0; i<str2.length(); i++){
            if(str2.charAt(i) >= '0' & str2.charAt(i) <= '9'){
                temp2 += str2.charAt(i);
            }
        }
        System.out.println(Integer.parseInt(temp1) + Integer.parseInt(temp2));
    }
}