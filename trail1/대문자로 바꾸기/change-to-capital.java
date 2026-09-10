import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] alphabet = new int[5][3];

        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                alphabet[i][j] = sc.next().charAt(0) - 32;
                System.out.print((char)alphabet[i][j]+" ");
            }
            System.out.println();
        }
    }
}