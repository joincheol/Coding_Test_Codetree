import java.util.Scanner;

public class Main {
    public static int minNum(int a, int b, int c){
        int min = a;
        if(a > b){
            if(c > a || c > b){
                min = b;
            }
            else{
                min = c;
            }
        }
        else{
            if(c > b || c > a){
                min = a;
            }
            else{
                min = c;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int result = minNum(a, b, c);
        System.out.println(result);
    }
}