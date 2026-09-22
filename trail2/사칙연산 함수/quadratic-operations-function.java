import java.util.Scanner;
public class Main {
    public static int add(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        if(o == '+'){
            System.out.print(a+" + "+c+" = "+add(a, c));
        }
        else if(o == '-'){
            System.out.print(a+" - "+c+" = "+minus(a, c));
        }
        else if(o == '*'){
            System.out.print(a+" * "+c+" = "+mul(a, c));
        }
        else if(o == '/'){
            System.out.print(a+" / "+c+" = "+divide(a, c));
        }
        else{
            System.out.print("False");
        }
    }
}