import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);

        if(alpha == 'S'){
            System.out.println("Superior");
        }
        else if(alpha == 'A'){
            System.out.println("Excellent");
        }
        else if(alpha == 'B'){
            System.out.println("Good");
        }
        else if(alpha == 'C'){
            System.out.println("Usually");
        }
        else if(alpha == 'D'){
            System.out.println("Effort");
        }
        else{
            System.out.println("Failure");
        }
    }
}