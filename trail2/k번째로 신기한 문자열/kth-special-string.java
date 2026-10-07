import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        
        String[] result = new String[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();

            if(check(words[i], t)){
                result[cnt++] = words[i];
            }
        }

        Arrays.sort(result, 0, cnt);
        System.out.println(result[k - 1]);
        // Please write your code here.
    }
    static boolean check(String str, String t){
        if(str.length() < t.length()){
            return false;
        }
        for(int i = 0; i<t.length(); i++){
            if(str.charAt(i) != t.charAt(i)){
                return false;
            }
        }
        return true;
    }
}