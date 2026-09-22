import java.util.Scanner;
public class Main {
    static int addEven(int num){
        String str = Integer.toString(num);
        char[] c = str.toCharArray();
        int len = str.length();
        int sum = 0;
        for(int i=0; i<len; i++){
            sum += (int)c[i];
        }
        if(sum % 2 == 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    static int check(int a, int b){
        int total = 0;
        for(int i=a; i<=b; i++){
            int cnt = 0;
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt == 2){
                total += addEven(i);
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.println(check(a, b));
    }
}