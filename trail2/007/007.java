import java.util.Scanner;

class Secrete{
    String c;
    char p;
    int t;

    public Secrete(String code, char point, int time){
        this.c = code;
        this.p = point;
        this.t = time;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Secrete s = new Secrete(sCode, mPoint, time);
        System.out.println("secret code : "+s.c);
        System.out.println("meeting point : "+s.p);
        System.out.println("time : "+s.t);
    }
}