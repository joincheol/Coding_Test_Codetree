import java.util.Scanner;

class ProductInfo{
    String id = "";
    int code = 0;

    public ProductInfo(){
        this.id = "";
        this.code = 0;
    }
    public ProductInfo(String id, int code){
        this.id = id;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        ProductInfo p1 = new ProductInfo();
        ProductInfo p2 = new ProductInfo(id2, code2);

        p1.id = "codetree";
        p1.code = 50;
        System.out.println("product "+p1.code+" is "+p1.id);
        System.out.println("product "+p2.code+" is "+p2.id);
    }
}