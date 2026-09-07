import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        while(true){
            int temp = sc.nextInt();
            if(temp == 0){
                break;
            }
            num[temp/10]++;
        }
        for(int i=1; i<=9; i++){
            System.out.println(i+" - "+num[i]);
        }
    }
}