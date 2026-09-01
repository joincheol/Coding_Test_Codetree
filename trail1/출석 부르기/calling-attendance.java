import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();

        if(order == 1){
            System.out.println("John");
        }
        else if(order == 2){
            System.out.println("Tom");
        }
        else if(order == 3){
            System.out.println("Paul");
        }
        else{
            System.out.println("Vacancy");
        }
    }
}