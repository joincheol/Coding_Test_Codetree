import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        double avg = 0;

        while(true){
            int age = sc.nextInt();
            
            if(age / 10 != 2){
                break;
            }
            
            sum += age;
            cnt++;
        }
        avg = (double)sum / cnt;
        System.out.printf("%.2f", avg);
    }
}