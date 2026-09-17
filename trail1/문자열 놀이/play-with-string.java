import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int q = sc.nextInt();

        for(int i=0; i<q; i++){
            int n = sc.nextInt();
            if(n == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                char temp = c[a-1];
                c[a-1] = c[b-1];
                c[b-1] = temp;
            }
            else{
                char x = sc.next().charAt(0);
                char y = sc.next().charAt(0);
                for(int j=0; j<str.length(); j++){
                    if(c[j] == x){
                        c[j] = y;
                    }
                }
            }
            str = String.valueOf(c);
            System.out.println(str);
        }
        
    }
}