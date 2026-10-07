import java.util.Scanner;

class Info{
    String id = "";
    int level = 0;

    public Info(){
        this.id = "codetree";
        this.level = 10;
    }
    public Info(String id, int level){
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        Info u1 = new Info();
        Info u2 = new Info(id, level);

        System.out.println("user "+u1.id+" lv "+u1.level);
        System.out.println("user "+u2.id+" lv "+u2.level);
    }
}