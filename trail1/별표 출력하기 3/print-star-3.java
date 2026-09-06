import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<(2*n-1) - (2*i); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}