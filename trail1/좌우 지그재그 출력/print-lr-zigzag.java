import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int cnt = 1;
            if(i % 2 == 0){
                cnt = cnt+(i*n);
                for(int j=0; j<n; j++){
                    System.out.print(cnt+" ");
                    cnt++;
                }
            }
            else{
                cnt = (i+1) * n;
                for(int j=0; j<n; j++){
                    System.out.print(cnt+" ");
                    cnt--;
                }
            }
            System.out.println();
        }
    }
}