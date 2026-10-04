import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static void sort(String str1, String str2){
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String sortStr1 = String.valueOf(s1);
        String sortStr2 = String.valueOf(s2);

        if(!sortStr1.equals(sortStr2)){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        sort(word1, word2);
    }
}