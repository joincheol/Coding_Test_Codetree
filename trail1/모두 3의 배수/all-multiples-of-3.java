import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        boolean status = false;

        for(int i=0; i<5; i++){
            int num = sc.nextInt();
            if(num % 3 == 0){
                status = true;
            }
            else{
                status = false;
                break;
            }
        }
        if(status){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}