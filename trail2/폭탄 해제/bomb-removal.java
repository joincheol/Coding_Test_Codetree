import java.util.Scanner;

class Code{
    String code;
    char color;
    int second;
    
    public Code(String code, char color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Code c = new Code(uCode, lColor, time);
        System.out.println("code : "+c.code);
        System.out.println("color : "+c.color);
        System.out.println("second : "+c.second);
    }
}