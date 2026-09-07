import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] score = new int[11];

        while(true){
            int temp = sc.nextInt();
            if(temp == 0){
                break;
            }
            score[temp/10]++;
        }
        for(int i=10; i>=1; i--){
            System.out.println(i*10+" - "+score[i]);
        }
    }
}