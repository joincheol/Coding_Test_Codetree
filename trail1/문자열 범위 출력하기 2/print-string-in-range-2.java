import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index = sc.nextInt();

        if(str.length() < index){
            for(int i=0; i<str.length(); i++){
                System.out.print(str.charAt(str.length()-i-1));
            }
        }
        else{
            for(int i=0; i<index; i++){
                System.out.print(str.charAt(str.length()-i-1));
            }
        }
    }
}