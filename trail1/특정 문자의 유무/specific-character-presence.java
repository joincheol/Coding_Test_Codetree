import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String status1 = "No";
        String status2 = "No";

        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("ee")){
                status1 = "Yes";
            }
            if(str.substring(i,i+2).equals("ab")){
                status2 = "Yes";
            }
        }
        System.out.println(status1+" "+status2);
    }
}