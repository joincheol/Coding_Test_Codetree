import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[201];
        int cnt = 0;
        int i = 1;

        while(true){
            String str = sc.next();
            
            if(str.indexOf('0') > -1){
                break;
            }
            cnt++;
            arr[i] = str;
            i++;
        }
        System.out.println(cnt);
        for(int j=1; j<i; j++){
            if(j % 2 == 1){
                System.out.println(arr[j]);
            }
            
        }
    }
}