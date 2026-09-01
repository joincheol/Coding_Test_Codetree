import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double leye = sc.nextDouble();
        double reye = sc.nextDouble();

        if(leye >= 1.0 && reye >= 1.0){
            System.out.println("High");
        }
        else if(leye >= 0.5 && reye >= 0.5){
            System.out.println("Middle");
        }
        else{
            System.out.println("Low");
        }
    }
}