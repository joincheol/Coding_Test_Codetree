import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        int space = n-1;

        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int j=0; j<cnt; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i >= n-1){
                cnt-=2;
                space++;
            }
            else{
                cnt+=2;
                space--;
            }
        }
    }
}