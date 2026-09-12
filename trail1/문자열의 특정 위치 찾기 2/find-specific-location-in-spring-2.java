import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        
        int c = sc.next().charAt(0);
        int cnt = 0;

        for(int i=0; i<5; i++){
            for(int j=2; j<=3; j++){
                if(arr[i].charAt(j) == c){
                    System.out.println(arr[i]);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}