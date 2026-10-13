import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] s = str.toCharArray();
        String runLength = "";

        runLength += s[0];
        int count = 1;
        for(int i=1; i<str.length(); i++){
            if(s[i] == s[i-1]){
                count++;
            }
            else{
                runLength += count;
                runLength += s[i];
                count = 1;
            }
        }
        runLength += count;
        System.out.println(runLength.length());
        System.out.println(runLength);
    }
}
